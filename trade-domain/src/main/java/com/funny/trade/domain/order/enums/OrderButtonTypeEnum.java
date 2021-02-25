package com.funny.trade.domain.order.enums;

/**
 */
public enum OrderButtonTypeEnum {
    TO_PAY(1,"to_pay","去付款","link","red"),
    CANCEL_ORDER(2,"cancel_order","取消订单","ask","white"),
    COMMIT_QUALIFICATION(3,"commit_qualification","提交资质","link","red"),
    UPLOAD_LOAN_DATA(4,"upload_loan_data","上传贷款资料","link","white"),
    VIEW_QUALIFICATION(5,"view_qualification","查看资质","link","white"),
    VIEW_LOAN_PROGRESS(6,"view_loan_progress","查看贷款进度","link","white"),
    PAY_DEPOSIT(7,"pay_deposit","支付定金","layer","red"),
    PAY_DOWNPAYMENT(8,"pay_downpayment","支付首付","link","red"),
    CONFIRM_DELIVER_GOODS(9,"confirm_deliver_goods","确认交货","ask","red"),
    VIEW_DEPOSIT_PROTOCOL(10,"view_deposit_protocol","查看定金协议","layer","white"),
    VIEW_FEE_LIST(11,"view_fee_list","查看费用清单","link","white"),
    CONFIRM_FEE_LIST(12,"confirm_fee_list","查看费用清单","link","red"),//20180601吴越让改的
    CONFIRM_LOCK_DEPOSIT(13,"confirm_lock_deposit","确认锁定金","layer","red"),
    CONFIRM_RECEIVE_GOODS(14,"confirm_receive_goods","确认收货","layer","white"),
    COMMENT(15,"comment","评论","link","white"),
    UPLOAD_INVOICE(16,"upload_invoice","上传发票","link","red"),
    VIEW_CONTRACT(17,"view_contract","查看合同","link","white"),
    APPLY_PINGAN_CASHBACK(18,"apply_pingan_cashback","申请平安返现","link","white"),
    TO_DRAW(19,"to_draw","去抽奖","link","white"),
    RESEND_SMS(20,"resend_sms","重发短信","ask","white"),
    APPLY_REFUND(21,"apply_refund","退款","link","white"),
    VIEW_REFUND_PROGRESS(22,"view_refund_progress","退款进度","link","red"),
    LOGISTICS_DETAIL(23,"logistics_detail","物流详情","layer","white"),
    VIEW_ORDER_DETAIL(24,"view_order_detail","查看详情","link","white"),
    QUALIFICATION_LOGISTICS(25,"qualification_logistics","合格证物流","link","white"),
    SEND_CAR_DETAIL(26,"send_car_detail","发车详情","link","white"),
    VIEW_CAR_RETURN_TIME(27,"view_car_return_time","查看交车时间","link","white"),
    CHECK_CAR(28,"check_car","验车","link","red"),
    BOOK_TAKE_CAR_TIME(29,"book_take_car_time","预约交车时间","link","red"),
    ONLINE_INSURE(30,"online_insure","线上投保","link","white"),
    NEED_COMPLETE_FILE(31,"need_complete_file","需补件","link","white"),
    YZT_UPLOAD_LOAN_DATA(32,"yzt_upload_loan_data","上传贷款资料","link","white"),
    TO_SHARE(33,"to_share","分享得红包","link","white"),
    CUSTOMER_SERVICE_TEL(34,"customer_service_tel","客服电话","link","white"),
    VIEW_FIN_DETAIL(35,"view_fin_detail","查看分期详情","link","white"),
    PAY_FINALPAY_ONLINE(36,"pay_finalpay_online","支付尾款","link","red"),
    BUYCAR_GIFT_INSURANCE(37,"buycar_gift_insurance","赠险福利","link","white"),
    GROUP_ORDER_SHARE(38,"group_order_share","邀请好友","link","white"),
    ACTIVATE_RED_BAG(39,"activate_red_bag","激活红包","layer","white"),
    MODIFY_SCORE(40,"modify_score","修改评分","link","white"),
    PAY_DEPOSIT_WITHOUT_PROTOCOL(41,"pay_deposit_without_protocol","支付定金","link","red"),
    CONSULTANT_COMMENT(42,"consultant_comment","顾问评价","link","white"),
    CONFIRM_ADUIT_RESULT(43,"confirm_audit_result","确认审核结果","link","white"),
    VIEW_QUOTATION_FEE_LIST(44,"view_quotation_fee_list","查看费用清单","link","white"),
    VIEW_QUOTATION_DEPOSIT_PROTOCOL(45,"view_quotation_deposit_protocol","查看定金协议","layer","white"),
    TPCC_WAIT_USER_CONFIRM(46,"tpcc_wait_user_confirm","确认资质","link","red"),
    UPLOAD_CONTRACT(47,"upload_contract","上传合同","link","white"),
    UPLOAD_CONTRACT_DETAIL(48,"upload_contract_detail","查看合同","layer","white"),
    RE_UPLOAD_CONTRACT(49,"re_upload_contract","重新上传合同","link","white"),
    APPLY_SERVICE(50,"apply_service","申请售后","link","white"),
    EVALUATE(51,"evaluate","评价晒单","link","white"),
    MY_EVALUATE(52,"my_envluate","我的评价","link","white"),
    MY_SERVICE(53,"my_service","我的售后","link","white"),
    CONFIRM_RECEIVE(54,"confirm_receive","确认收货","ask","white"),
    CHU_XING_QUAN(55,"chu_xing_quan","查看打车券","link","white"),
    ;

    private Integer key;

    private String code;//标识

    private String value;//文案

    private String mode;//交互方式：link、ask、layer

    private String color;//按钮颜色：

    OrderButtonTypeEnum(Integer key, String code, String value, String mode, String color) {
        this.key = key;
        this.code = code;
        this.value = value;
        this.mode = mode;
        this.color = color;
    }

    public static OrderButtonTypeEnum getByKey(int type){
        for(OrderButtonTypeEnum en : OrderButtonTypeEnum.values()){
            if(type == en.getKey()){
                return en;
            }
        }
        return null;
    }

    public static OrderButtonTypeEnum getByCode(String code){
        for(OrderButtonTypeEnum en : OrderButtonTypeEnum.values()){
            if(en.getCode().equals(code)){
                return en;
            }
        }
        return null;
    }


    public Integer getKey() {
        return key;
    }

    public OrderButtonTypeEnum setKey(Integer key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public OrderButtonTypeEnum setValue(String value) {
        this.value = value;
        return this;
    }

    public String getMode() {
        return mode;
    }

    public OrderButtonTypeEnum setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getColor() {
        return color;
    }

    public OrderButtonTypeEnum setColor(String color) {
        this.color = color;
        return this;
    }

    public String getCode() {
        return code;
    }

    public OrderButtonTypeEnum setCode(String code) {
        this.code = code;
        return this;
    }
}
