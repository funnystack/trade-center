package com.funny.trade.domain.order.enums;

/**
 */
public enum OrderLadderStatus {

    PROCESSING(1, "阶梯购促销活动进行中"),
    DONE(2, "阶梯购活动结束并且成团"),
    PAY_AFTER_PROMOTION_OVER(3, "活动结束后支付不算参与活动"),
    NOT_GROUP(4, "阶梯购活动结束后没成团"),
    ;

    OrderLadderStatus(int key, String msg) {
        this.key = key;
        this.msg = msg;
    }


    private int key;
    private String msg;

    public int getKey() {
        return key;
    }

    public OrderLadderStatus setKey(int key) {
        this.key = key;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public OrderLadderStatus setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public static String getValueByKey(int key){
        for(OrderLadderStatus e : OrderLadderStatus.values()){
            if(e.getKey() == key ){
                return e.getMsg();
            }
        }
        return null;
    }
}
