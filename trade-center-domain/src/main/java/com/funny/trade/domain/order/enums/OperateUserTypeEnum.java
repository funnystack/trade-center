package com.funny.trade.domain.order.enums;

/**
 *
 */
public enum OperateUserTypeEnum {

    USER("user", "用户"),
    SELLER("seller", "商家"),
    PLAT("plat", "平台运营"),
    CC("cc", "客服"),
    SYS_WORKER("worker", "系统定时任务"),
    ;

    private String key;
    private String value;

    OperateUserTypeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }}
