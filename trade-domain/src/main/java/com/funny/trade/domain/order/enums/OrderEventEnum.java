package com.funny.trade.domain.order.enums;

/**
 *
 */
public enum OrderEventEnum {

    CREATED(1, "new_order", "下单"),
    SPIT_ORDER(2, "spit_order", "拆分订单"),

    DELETE(-1, "cancel", "取消"),
    CLOSE(-2, "close", "关单"),

    PAYED(3, "payed", "支付完成"),
    FINISH(4, "finish", "完成"),

    LOCKED(5, "lock", "退款锁定"),
    UNLOCKED(6, "unlock", "解锁"),

    TERMINATE(10, "terminate", "终止"),
    CHECKCODE(11, "check_code", "验券"),
    UNCHECKCODE(12, "uncheck_code", "取消验券"),
    DELIVER(13, "delivery", "交付"),


    REFUND_PASS(15, "refund_pass", "退款审核通过"),
    REFUND_REJECT(16, "refund_reject", "退款审核拒绝"),
    REFUND_NOTIFY(28, "refund_notify", "退款已到账"),

    FINALPAY_MODIFY(17, "final_pay_modify", "修改尾款"),
    UPDATEDEALERID(14, "updateDealerId", "更新经销商"),
    ORDER_MODIFY(18, "order_info_modify", "修改订单信息"),
    MODIFY_AMOUNT(50, "modify_amount", "修改金额"),
    MODIFY_PURCHASE_PRICE(72, "modify_purchase_price", "修改采购价"),
    MODIFY_FREIGHT(69, "modify_freight", "修改运费"),
    MODIFY_FIN_AMOUNT(70, "modify_fin_amount", "Edit后台修改订单金额"),
    MODIFY_SETTLEMENT_PRICE(73, "modify_settlement_price", "修改结算价"),

    UN_LOCK_DEPOSIT(30, "un_lock_deposit", "解锁订金"),
    SELLER_LOCK_DEPOSIT(31, "seller_lock_deposit", "商家发起锁定订金"),
    USER_AGREE_LOCK_DEPOSIT(32, "user_agree_lock_deposit", "用户同意锁定订金"),
    PRE_TERMINATE_ORDER(33, "pre_terminate_order", "商家发起预终止订金"),
    LOCK_ORDER_COUPONS(34, "lock_order_coupons", "验券前锁定优惠券"),


    SAVE_DELIVERINFO(37, "save_deliver_info", "发货"),
    CONFIRM_DELIVERY(65, "confirm_delivery", "确认收货"),


    PAY_INTENTION_FEE(38, "pay_intention_fee", "支付意向金"),
    PAY_FINALPAY(64, "pay_finalpay", "支付尾款"),
    PAY_DEPOSIT(39, "pay_deposit", "支付大额定金"),
    PAY_QUOTATION(75, "pay_quotation", "支付定金"),

    CALL_CAR(40, "call_car", "Call车"),
    DISTRIBUTION_BOARD(41, "distribution_board", "配板"),
    TRANSPORTED(42, "transported", "发运"),
    ARRIVED(43, "arrived", "车到店"),
    ORDER_DELIVERY_TIME(57, "order_delivery_time", "预约交车时间"),
    EXAMINED_CAR(58, "examined_car", "验车"),
    RECEIVE_CAR(56, "receive_car", "接车"),
    DELIVERED(60, "delivered", "交付"),

    CREATED_PROTOCOL(44, "create_protocol", "生成费用清单"),
    PAY_DOWN_PAYMENT(45, "pay_down_payment", "支付首付"),
    WAIT_OUT_STORAGE(46, "wait_out_storage", "等待出库"),

    MAKE_SURE_PROTOCOL(48, "make_sure_protocol", "确认费用清单"),
    QUALIFICATION_PASS(49, "qualification_pass", "资质审核通过"),
    LOAN_NOTIFY(59, "loan_notify", "放款通知"),

    CONSUMECODE_TEMP_INFO(51, "consumecode_temp_info", "保存验码临时信息"),
    QUALIFICATION_UPLOAD(52, "qualification_upload", "资质上传(审核中)"),
    QUALIFICATION_REJECT(53, "qualification_reject", "资质审核被驳回"),
    MAIN_GOOD_CONSUME_CODE(54, "main_good_consume_code", "主商品验码"),
    NOTIFY_BEFORE_ARRIVE(55, "notify_before_arrrive", "到店前通知"),

    SET_TO_ZERO_FOR_BAOPAIDAI(66, "set_to_zero_for_baopaidai", "包牌贷修改gps和保险费用为0"),
    PAIED_DOWNPAYMENT(67, "payied downpayment", "首付已付"),
    CHANGE_ORDER(68, "change_order", "换单"),

    PAY_DEPOSIT_WITHOUT_PROTOCOL(71, "pay_deposit_without_protocol", "支付大额定金"),

    FINANCE_INIT_STATUS(74, "finance_init_status", "重置金融审核状态"),
    SYNC_DELIVERY_TIME(82, "sync_delivery_time", "同步交车时间"),
    ORDER_STATUS_MODIFY(100, "order_status_modify", "修改订单状态"),
    ORDER_INFO_MODIFY(101, "order_info_modify", "修改订单信息"),
    AFTER_SALE_ARBITRADE(102, "after_sale_arbitrate", "申请仲裁"),
    AFTER_SALE_CANCEL(102, "after_sale_cancel", "撤销售后服务单"),
    AFTER_SALE_MODIFY(103, "after_sale_modify", "修改售后服务单"),
    AFTER_SALE_CREATE(104, "after_sale_create", "创建售后服务单"),


    ;

    private int key;
    private String value;
    /**
     * 操作类型中文意义，用于admin展示
     */
    private String name;


    OrderEventEnum(int key, String value, String name) {
        this.key = key;
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public int getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public static OrderEventEnum getOrderOperate(String value) {
        for (OrderEventEnum ps : OrderEventEnum.values()) {
            if (ps.getValue().equals(value)) {
                return ps;
            }
        }
        return null;
    }

    public static String getValue(int key) {
        for (OrderEventEnum ps : OrderEventEnum.values()) {
            if (ps.getKey() == key) {
                return ps.getValue();
            }
        }
        return null;
    }

    public static String getName(int key) {
        for (OrderEventEnum ps : OrderEventEnum.values()) {
            if (ps.getKey() == key) {
                return ps.getName();
            }
        }
        return "未知";
    }
}
