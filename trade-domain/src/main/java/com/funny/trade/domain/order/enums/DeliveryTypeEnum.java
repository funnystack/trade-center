package com.funny.trade.domain.order.enums;

/**
 */
public enum DeliveryTypeEnum {
    TO_SHOP(1,"到店自提"),
    HOME_DELIVERY(2,"送货上门");

    private int key;
    private String value;

    DeliveryTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public static DeliveryTypeEnum getDeliveryTypeEnum(int key){
        for(DeliveryTypeEnum ps : DeliveryTypeEnum.values()){
            if(ps.getKey()==key){
                return ps;
            }
        }
        return null;
    }

    public static String getValue(int key){
        for(DeliveryTypeEnum ps : DeliveryTypeEnum.values()){
            if(ps.getKey() == key){
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
