package com.funny.trade.starter.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class MyExceptionHandler extends ExceptionHandlerExceptionResolver {

    private static final Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);

    private static final String SERVER_ERROR_MESSAGE = "服务器繁忙,请稍后重试!";

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntity errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
        logger.error("MyExceptionHandler.errorHandler {} {}?{}{}Msg: {}",
                request.getMethod(),
                request.getRequestURI(),
                request.getQueryString(),
                System.getProperty("line.separator"),
                e.getMessage(), e);
        e.printStackTrace();

        String message;
        Integer code = 500;
        if (e instanceof RuntimeException) {
            message = e.getMessage();
        } else {
            message = SERVER_ERROR_MESSAGE;
        }


        Map<String, Object> map = new HashMap<String, Object>();
        map.put("returncode", code);
        map.put("message", message);
        return new ResponseEntity(map, HttpStatus.OK);
    }

}