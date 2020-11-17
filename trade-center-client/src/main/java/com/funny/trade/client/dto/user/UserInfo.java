package com.funny.trade.client.dto.user;

import com.funny.combo.core.dto.AbstractClient;

public class UserInfo extends AbstractClient {
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
