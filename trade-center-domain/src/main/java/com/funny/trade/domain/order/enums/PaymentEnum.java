package com.funny.trade.domain.order.enums;

import java.util.HashMap;
import java.util.Map;


public enum PaymentEnum {

    ONLINE_PAYMENT(1,"在线支付",0),
    DEPOSIT(2,"订金支付",1),
    PAID_IN_FULL(3,"全款支付",2),
    INSTALLMENT(4,"分期付款",3),
    OFFLINE_FULL(5,"线下全款",4),
    OFFLINE_DEPOSIT(6,"线下订金",5),
    LOAN(7,"金融分期",6),
    COMBINE_DEPOSIT_EARNEST(8,"意向金和定金",7),
    OFFLINE_PAY(9,"线下支付",9),
    POINT_PAY(10,"积分支付",10),
    ;

    private int key;
    private String value;
    private int preKey;

    PaymentEnum(int key, String value, int preKey){
        this.key = key;
        this.value = value;
        this.preKey = preKey;
    }

    public static PaymentEnum getPaymentEnum(int key){
        for(PaymentEnum ps : PaymentEnum.values()){
            if(ps.getKey()==key){
                return ps;
            }
        }
        return null;
    }

    public static PaymentEnum getPaymentEnumByPreKey(int prekey){
        for(PaymentEnum ps : PaymentEnum.values()){
            if(ps.getPreKey()==prekey){
                return ps;
            }
        }
        return null;
    }

    public static String getValue(int key){
        for(PaymentEnum ps : PaymentEnum.values()){
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

    public int getPreKey() {
        return preKey;
    }

    public static Map<Integer,String> getAllPaymentTypeMap(){
        PaymentEnum[] values =  PaymentEnum.values();
        Map<Integer,String> map = new HashMap<Integer,String>();
        for (PaymentEnum type : values){
            map.put(type.getKey(), type.getValue());
        }
        return map;
    }
}
