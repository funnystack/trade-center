package com.funny.trade.domain.order.enums;

/**
 * 订单明细类型
 */
public enum GoodsTypeEnum {

    GIFT(1,"赠品"),
    GOODS(0,"商品"),
    combo(2,"套装"),
    WARRANTIE(3,"质保"),
    GIFT_PACKAGE(5,"精品礼包"),//大礼包
    CROSS_PACKAGE(7,"跨店套装"),
    ;

    private int key;
    private String value;

    GoodsTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public static GoodsTypeEnum getGoodsTypeEnum(int key) {
        for (GoodsTypeEnum ps : GoodsTypeEnum.values()) {
            if (ps.getKey() == key) {
                return ps;
            }
        }
        return null;
    }

    public static String getValue(int key) {
        for (GoodsTypeEnum ps : GoodsTypeEnum.values()) {
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
