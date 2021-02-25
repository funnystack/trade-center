package com.funny.trade.domain.order.enums;

/**
 *
 */
public enum OrderStatusEnum {

    NEW_ORDER(1,"新订单"),
    WAIT_PAY(2,"等待支付"),
    INTENTION_PAY(5,"等待付意向金"),
    WAIT_DEPOSIT_PAY(6,"等待付定金"),
    WAIT_DOWN_PAY(8,"待付首付"),
    WAIT_OUT_STORAGE(10,"等待出库"),
    WAIT_SEND_CODE(11,"等待发货"),
    WAIT_CONFIRM_DELIVERY(15,"等待确认收货"),
    WAIT_CONSUME(16,"待验券"),
    WAIT_DELIVER(17,"已验券待交付"),
    FINISHED(20,"完成"),
    CLOSED(0,"交易关闭"),
    CANCELED(-1,"用户取消"),
    PARENT_SPLIT(101,"父单已拆分"),
    PARENT_PAYED(102,"父单已支付");

    private int key;
    private String value;

    OrderStatusEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public static OrderStatusEnum getOrderStatus(int key){
        for(OrderStatusEnum ps : OrderStatusEnum.values()){
            if(ps.getKey()==key){
                return ps;
            }
        }
        return null;
    }

    public static String getValue(int key){
        for(OrderStatusEnum ps : OrderStatusEnum.values()){
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
