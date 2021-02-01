package com.funny.trade.domain.order.enums;

/**
 */
public enum OrderTypeEnum {

    POPBUYOUT(14,"YPOP"),
    EC(23,"ELECTRONIC_CERTIFICATE"),
    ;



    private int key;
    private String value;

    OrderTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }


    public static String getValue(int key) {
        for (OrderTypeEnum ps : OrderTypeEnum.values()) {
            if (ps.getKey() == key) {
                return ps.getValue();
            }
        }
        return null;
    }


    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }


}
