package com.funny.trade.starter.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

@Controller
public class BaseController {

    private static final Logger indexLog = LoggerFactory.getLogger(BaseController.class);



    /**
     * 获取服务器IP
     *
     * @return
     */
    public static InetAddress getLocalAddress() {
        try {
            Enumeration allNetInterfaces = NetworkInterface.getNetworkInterfaces();
            InetAddress ip = null;
            while (allNetInterfaces.hasMoreElements()) {
                NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
                Enumeration addresses = netInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    ip = (InetAddress) addresses.nextElement();
                    if (ip != null && ip instanceof Inet4Address) {
                        return ip;
                    }
                }
            }
        } catch (Exception e) {
        }
        return null;
    }


    /**
     * 获取访问者IP
     * <p>
     * 在一般情况下使用Request.getRemoteAddr()即可，但是经过nginx等反向代理软件后，这个方法会失效。
     * <p>
     * 本方法先从Header中获取X-Real-IP，如果不存在再从X-Forwarded-For获得第一个IP(用,分割)，
     * 如果还不存在则调用Request .getRemoteAddr()。
     *
     * @param request
     * @return
     */
    public static String getRomoteAddress(HttpServletRequest request) {
        String ip = "";
        try {

            ip = request.getHeader("X-Forwarded-For");
            indexLog.info("===get X-Forwarded-For:" + ip);
            if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("X-Real-IP");
                indexLog.info("===get X-Real-IP:" + ip);
            }

            if (!StringUtils.isBlank(ip) && !"unknown".equalsIgnoreCase(ip)) {
                // 多次反向代理后会有多个IP值，第一个为真实IP。
                int index = ip.indexOf(',');
                if (index != -1) {
                    return ip.substring(0, index);
                } else {
                    return ip;
                }
            } else {
                return request.getRemoteAddr();
            }
        } catch (Exception e) {
        }
        return ip;
    }

    /**
     * 根据cookie key获得value
     *
     * @param cookies
     * @param key
     * @return
     */
    protected static String getCookieValue(Cookie[] cookies, String key) {
        String value = null,
                name = "";
        if (cookies == null)
            return null;
        for (Cookie cookie : cookies) {
            name = cookie.getName();
            if (key.equals(name)) {
                try {
                    value = cookie.getValue();
                } catch (Exception e) {
                    indexLog.error("get value from cookie error：", e);
                }
                break;
            }
        }
        return value;
    }


    //获取用户ID
    public Object getCookieParam(HttpServletRequest request, String key) {
        if (request.getAttribute(key) == null)
            return null;
        return (Object) request.getAttribute(key);
    }


}
