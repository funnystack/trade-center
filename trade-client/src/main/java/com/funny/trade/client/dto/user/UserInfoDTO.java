package com.funny.trade.client.dto.user;

import com.funny.combo.core.dto.AbstractClient;
import lombok.Data;

@Data
public class UserInfoDTO extends AbstractClient {
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPwd;

    /**
     * 手机号加密
     */
    private String mobile;


}
