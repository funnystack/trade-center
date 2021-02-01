package com.funny.trade.domain.order.enums;


public enum OrderAmountEnum {
    TOTAL_AMOUNT("totalAmount","全部应付金额"),
    CARLOAD_DEDUCTION_PRICE("carloadDeductionPrice","车款优惠"),
    DEDUCTION_PRICE("deductionPrice","抵扣金额"),
    OFFLINE_YOUHUI_AMOUNT("offlineYouhuiAmount","线下优惠"),
    ORDER_SUM("orderSum","本次应付金额"),
    EXPANSION_AMOUNT("expansionAmount","预售定金膨胀优惠"),
    OFFLINE_COUPON_SUM("offlineCouponSum","尾款优惠"),
    DOWNPAYMENY_AMOUNT("downPaymentAmount","首付"),
    LOAN_AMOUNT("loanAmount","贷款金额"),
    SHOULD_PAY("shouldPay","实付金额"),
    FREIGHT_SUM("freightSum","运费"),
    OFIGINAL_PEICE_BEFORE_COUPON("originalPriceBeforeCoupon","优惠前总金额"),
    SHOULD_FINAL_PAY("shouldFinalPay","尾款金额"),
    PROMOTION("promotion","促销"),
    COUPON_SUM("couponSum","优惠券"),
    CASHBACK("cashBack","返现")

    ;

    private String code;

    private String name;

    OrderAmountEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public OrderAmountEnum setCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public OrderAmountEnum setName(String name) {
        this.name = name;
        return this;
    }
}
