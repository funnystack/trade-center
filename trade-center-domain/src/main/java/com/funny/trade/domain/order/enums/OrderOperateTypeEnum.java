package com.funny.trade.domain.order.enums;

/**
 */
public enum OrderOperateTypeEnum {

    PAYMENT(2,"payment","下单"),
    CONFIRM_PAY(3,"confirm_pay",""),
    PRODUCTION(4,"production","支付"),
    FINISH(5,"finish","完成"),
    DELETE(6,"cancel","取消"),
    LOCKED(7,"lock","退款锁定"),
    RESTORE(8,"restore",""),//该类型未使用

    UNLOCKED(9,"unlock","解锁"),
    TERMINATE(10,"terminate","终止"),
	CHECKCODE(11,"check_code","验券"),
	UNCHECKCODE(12,"uncheck_code","取消验券"),
	DELIVER(13,"deliver","交付"),

    UPDATEDEALERID(14,"updateDealerId","更新经销商"),

    REFUND_PASS(15,"refund_pass","退款审核通过"),
    REFUND_REJECT(16,"refund_reject","退款审核拒绝"),
    FINALPAY_MODIFY(17,"final_pay_modify","修改尾款"),
    ORDER_MODIFY(18,"order_info_modify","修改订单信息"),
    ORDER_AUTO_CLOSE(19,"order_auto_finish","Task自动完成订单"),
    OFFLINE_REFUND(20,"offline_refund","线下退款"),
    SPECIAL_REFUND_APPLY(21,"special_refund_apply","发起后台special退款"),
    SPECIAL_REFUND_RETURN(22,"special_refund_return","收到后台special退款通知"),
    MORTGAGE_COMPLETED(23,"mortgage_completed","抵押完成"),
    UPDATE_CONFIRED_TIME(24,"upate_confired_time","更新有效支付时间"),
    UPDATE_VIN(25,"updateVin","更换VIN码（换车）"),
    RECORD_CALLER(26, "recordCaller", "记录接口调用方"),
    WAIT_PAY_CONFIRM(27,"wait_pay_confirm","支付待确认"),
    REFUND_NOTIFY(28,"refund_notify","退款已到账"),
    FIN_COMPLETE_ORDER(29,"fin_complete_order","金融完成订单"),
    UN_LOCK_DEPOSIT(30,"un_lock_deposit","解锁订金"),
    SELLER_LOCK_DEPOSIT(31,"seller_lock_deposit","商家发起锁定订金"),
    USER_AGREE_LOCK_DEPOSIT(32,"user_agree_lock_deposit","用户同意锁定订金"),
    PRE_TERMINATE_ORDER(33,"pre_terminate_order","商家发起预终止订金"),
    LOCK_ORDER_COUPONS(34,"lock_order_coupons","验券前锁定优惠券"),
    NEW_ORDER(35, "new_order", "新订单"),
    WAIT_DEIVERY(36,"wait_delivery","等待发货"),
    SAVE_DELIVERINFO(37,"save_deliver_info","发货"),

    PAY_INTENTION_FEE(38,"pay_intention_fee","支付意向金"),
    PAY_DEPOSIT(39,"pay_deposit","支付大额定金"),
    CALL_CAR(40, "call_car","Call车"),
    DISTRIBUTION_BOARD(41, "distribution_board", "配板"),
    TRANSPORTED(42, "transported","发运"),
    ARRIVED(43, "arrived", "车到店"),
    CREATED_PROTOCOL(44, "create_protocol", "生成费用清单"),
    PAY_DOWN_PAYMENT(45,"pay_down_payment","支付首付"),
    WAIT_OUT_STORAGE(46,"wait_out_storage","等待出库"),
    SPIT_ORDER(47,"spit_order","拆分订单"),
    MAKE_SURE_PROTOCOL(48, "make_sure_protocol", "确认费用清单"),
    QUALIFICATION_PASS(49,"qualification_pass","资质审核通过"),
    MODIFY_AMOUNT(50,"modify_amount","修改金额"),
    CONSUMECODE_TEMP_INFO(51,"consumecode_temp_info","保存验码临时信息"),
    QUALIFICATION_UPLOAD(52,"qualification_upload","资质上传(审核中)"),
    QUALIFICATION_REJECT(53,"qualification_reject","资质审核被驳回"),
    MAIN_GOOD_CONSUME_CODE(54,"main_good_consume_code","主商品验码"),
    NOTIFY_BEFORE_ARRIVE(55,"notify_before_arrrive","到店前通知" ),
    RECEIVE_CAR(56,"receive_car","接车"),
    ORDER_DELIVERY_TIME(57,"order_delivery_time","预约交车时间"),
    EXAMINED_CAR(58,"examined_car","验车"),
    LOAN_NOTIFY(59,"loan_notify","放款通知"),
    DELIVERED(60,"delivered","交付"),
    ADD_OFFLINE_YOUHUI(61,"add_offline_youhui","添加线下优惠"),
    DA_TONG(62,"da_tong","大通金融订单跟踪信息"),
    DA_TONG_HIDDEN(63,"da_tong_hidden","大通金融订单跟踪信息(不显示)"),
    PAY_FINALPAY(64,"pay_finalpay","支付尾款"),

    CONFIRM_DELIVERY(65,"confirm_delivery","确认收货"),
    SET_TO_ZERO_FOR_BAOPAIDAI(66,"set_to_zero_for_baopaidai","包牌贷修改gps和保险费用为0"),
    PAIED_DOWNPAYMENT(67,"payied downpayment","首付已付"),
    CHANGE_ORDER(68,"change_order","换单"),
    MODIFY_FREIGHT(69,"modify_freight","修改运费"),
    MODIFY_FIN_AMOUNT(70,"modify_fin_amount","Edit后台修改订单金额"),
    PAY_DEPOSIT_WITHOUT_PROTOCOL(71,"pay_deposit_without_protocol","支付大额定金"),
    MODIFY_PURCHASE_PRICE(72,"modify_purchase_price","修改采购价"),
    MODIFY_SETTLEMENT_PRICE(73,"modify_settlement_price","修改结算价"),
    FINANCE_INIT_STATUS(74,"finance_init_status","重置金融审核状态"),

    QUOTATION_PAY(75,"QUOTATION_PAY","支付定金"),
    QUALIFICATION_TPCC_UPLOAD(76,"qualification_tpcc_upload","tpcc资质上传(审核中)"),
    QUALIFICATION_TPCC_PASS(77,"qualification_tpcc_pass","tpcc初审通过"),
    QUALIFICATION_TPCC_REJECT(78,"qualification_tpcc_reject","tpcc初审驳回"),
    QUOTATION_MODIFY_REFUND_TIME(79,"qualification_modify_refund_time","报价单订单修改自动退款时间"),

    QUOTATION_REFUND_REJECT_1(80,"refund_reject","提交资质之前退款审核拒绝"),
    QUOTATION_REFUND_REJECT_2(81,"refund_reject","确认费用清单之前退款审核拒绝"),

    SYNC_DELIVERY_TIME(82,"sync_delivery_time","同步交车时间"),

    DELIVERY_SHOP_INFO_CONFIRM(83,"delivery_shop_info_confirm","确认交付店信息"),
    DELIVERY_CAR_INFO_CONFIRM(84,"delivery_car_info_confirm","确认车辆信息"),
    DELIVERY_PAYMENT_VOUCHER_COMPLETE(85,"delivery_payment_voucher_complete","打款凭证"),
    DELIVERY_CAR_READY_COMPLETE(86,"delivery_car_ready_complete","备车完成"),
    OFFLINE_CHECKCODE_FINISHED(87,"offline_checkcode_finished","验券并完成"),
    AUDIT_BEFORE_TPCC_UPLOAD(88,"audit_before_tpcc_upload","机构初审-资质上传(审核中)"),
    AUDIT_BEFORE_TPCC_PASS(89,"audit_before_tpcc_pass","机构初审-通过"),
    AUDIT_BEFORE_TPCC_REJECT(90,"audit_before_tpcc_reject","机构初审-驳回"),
    AUDIT_UPLOAD_LOAN_INFO(91,"audit_update_loan_info","放款资料审核"),
    ORDER_CONTRACT_OPERATOR(92,"order_contract_operator","购车合同上传"),
    ORDER_CONTRACT_AUDIT(93,"order_contract_audit","购车合同审核"),

    ORDER_NUMBER_OPERATOR(94,"order_number_operator","保单上传"),
    ORDER_NUMBER_AUDIT(95,"order_number_audit","保单审核"),
    ORDER_INVOICE_USER_UPLOAD(96,"order_invoice_operator","用户上传发票"),
    ORDER_INVOICE_USER_OPERATOR(97,"order_invoice_operator","用户发票审核"),

    ORDER_INVOICE_SELLER_UPLOAD(98,"order_invoice_operator","经销商上传发票"),
    ORDER_INVOICE_SELLER_OPERATOR(99,"order_invoice_operator","经销商审核"),

    ORDER_STATUS_MODIFY(100,"order_status_modify","修改订单状态"),
    ORDER_INFO_MODIFY(101,"order_info_modify","修改订单信息"),
    AFTER_SALE_ARBITRADE(102,"after_sale_arbitrate","申请仲裁"),
    AFTER_SALE_CANCEL(102,"after_sale_cancel","撤销售后服务单"),
    AFTER_SALE_MODIFY(103,"after_sale_modify","修改售后服务单"),
    AFTER_SALE_CREATE(104,"after_sale_create","创建售后服务单"),



    ;

    private int key;
    private String value;
    /**
     * 操作类型中文意义，用于admin展示
     */
    private String name;


    OrderOperateTypeEnum(int key, String value, String name) {
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

    public static OrderOperateTypeEnum getOrderOperate(String value){
        for(OrderOperateTypeEnum ps : OrderOperateTypeEnum.values()){
            if(ps.getValue().equals(value)){
                return ps;
            }
        }
        return null;
    }

    public static String getValue(int key){
        for(OrderOperateTypeEnum ps : OrderOperateTypeEnum.values()){
            if(ps.getKey() == key){
                return ps.getValue();
            }
        }
        return null;
    }

    public static String getName(int key){
        for(OrderOperateTypeEnum ps : OrderOperateTypeEnum.values()){
            if(ps.getKey() == key){
                return ps.getName();
            }
        }
        return "未知";
    }
}
