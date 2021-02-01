package com.funny.trade.domain.order.enums;


public enum PartRefundEnum {

    PART_REFUND(1, "部分退款"),
    ALL_REFUND(2, "全部退款"),
    PART_REFUND_LAST(3, "最后一次部分退款"),
    ;

    private int key;
    private String value;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    PartRefundEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getValue(int key) {
        for (PartRefundEnum ps : PartRefundEnum.values()) {
            if (ps.getKey() == key) {
                return ps.getValue();
            }
        }
        return null;
    }

    public static PartRefundEnum getPartRefundEnum(int key) {
        for (PartRefundEnum ps : PartRefundEnum.values()) {
            if (ps.getKey() == key) {
                return ps;
            }
        }
        return null;
    }
}
