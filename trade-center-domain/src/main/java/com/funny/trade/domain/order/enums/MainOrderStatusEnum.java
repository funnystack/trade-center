package com.funny.trade.domain.order.enums;

/**
 */
public enum MainOrderStatusEnum {

    WAIT_PAY(1,"待支付"),
    PROCESS(2,"进行中"),
    FINISHED(3,"已完成"),
    CANCEL(4,"已取消"),
    REFUNDING(5,"退款中"),
    REFUND_OVER(6,"退款完成")
    ;

    private int key;
    private String value;

    MainOrderStatusEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public static MainOrderStatusEnum getOrderStatus(int key){
        for(MainOrderStatusEnum ps : MainOrderStatusEnum.values()){
            if(ps.getKey()==key){
                return ps;
            }
        }
        return null;
    }

    public static String getValue(int key){
        for(MainOrderStatusEnum ps : MainOrderStatusEnum.values()){
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
