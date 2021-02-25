package com.funny.trade.domain.order.enums;

/**
 * 前台显示的物流轨迹
 */
public enum OrderTraceEnum {

    SPIT_ORDER(OrderEventEnum.SPIT_ORDER.getKey(), "拆分订单", "您的订单已拆分"),
    CHECK_CODE(OrderEventEnum.CHECKCODE.getKey(), "验券", "您的订单已验码，请确认交车"),
    FINISH(OrderEventEnum.FINISH.getKey(), "完成", "您的订单已完成，感谢您在车商城购车，欢迎您再次光临"),
    WAIT_OUT_STORAGE(OrderEventEnum.WAIT_OUT_STORAGE.getKey(), "等待出库", "您的订单已支付，等待发货"),
    SAVE_DELIVERINFO(OrderEventEnum.SAVE_DELIVERINFO.getKey(), "发货", "您的订单已发货，等待您确认收货"),

    PAY_INTENTION_FEE(OrderEventEnum.PAY_INTENTION_FEE.getKey(), "支付意向金", "您的订单已支付意向金"),
    PAY_DEPOSIT(OrderEventEnum.PAY_DEPOSIT.getKey(), "支付大额定金", "您已确认了定金协议并已支付了定金，请等待订单确认"),
    PAY_DOWN_PAYMENT(OrderEventEnum.PAY_DOWN_PAYMENT.getKey(), "支付首付", "您的订单已支付首付，请完成线下手续办理"),
    CALL_CAR(OrderEventEnum.CALL_CAR.getKey(), "Call车", "您的订单已确认，请等待出库"),
    DISTRIBUTION_BOARD(OrderEventEnum.DISTRIBUTION_BOARD.getKey(), "配板", "您的车辆已出库，准备发运"),
    TRANSPORTED(OrderEventEnum.TRANSPORTED.getKey(), "发车", "您的车辆已发运，等待车辆运达"),
    @Deprecated
    ARRIVED(OrderEventEnum.ARRIVED.getKey(), "车到店", "您的车辆已到达经销商店内，请您尽快到店提车"),
    MAKE_SURE_PROTOCOL(OrderEventEnum.MAKE_SURE_PROTOCOL.getKey(), "确认费用清单", "您已确认费用清单"),

    RECEIVE_CAR(OrderEventEnum.RECEIVE_CAR.getKey(), "交付店操作接车", "您的车辆已到达指定交付店内，请您尽快预约到店"),
    EXAMINED_CAR(OrderEventEnum.EXAMINED_CAR.getKey(), "验车", "车辆验收成功"),
    ORDER_DELIVERY_TIME(OrderEventEnum.ORDER_DELIVERY_TIME.getKey(), "预约提车日历", "您已预约成功，请您在约定时间内到店提车"),
    PAY_FINALPAY(OrderEventEnum.PAY_FINALPAY.getKey(), "支付尾款", "您的尾款已支付"),
    PAY_DEPOSIT_WITHOUT_PROTOCOL(OrderEventEnum.PAY_DEPOSIT_WITHOUT_PROTOCOL.getKey(), "支付大额定金", "您已支付了定金，请等待订单确认"),
    CONFIRM_DELIVERY(OrderEventEnum.CONFIRM_DELIVERY.getKey(), "确认收货", "您的订单已确认收货");

    OrderTraceEnum(int type, String value, String desc) {
        this.type = type;
        this.value = value;
        this.desc = desc;
    }


    private int type;
    private String value;
    private String desc;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static OrderTraceEnum getOrderTraceEnum(int type) {
        for (OrderTraceEnum ps : OrderTraceEnum.values()) {
            if (ps.getType() == type) {
                return ps;
            }
        }
        return null;
    }
}
