package com.funny.trade.domain.order.enums;

/**
 */
public enum CouponTypeEnum {


    COUPON_WITHOUT_USER(1000,"优惠券"),
    PROMOTION(2,"促销"),
    JXSYIKOUJIABUTIE(102,"汽车之家全款补贴"),
    ZHESHANGZHE_OFFLINE(1001,"折上折线下优惠"),//单独下单折上折
    DINGJIN_OFFLINE(1002,"一口价定金线下优惠"),//单独下单一口价定金
    WEIKUAN_OFFLINE(1006, "线下尾款抵扣优惠"),//尾款修改时保存
    EXPANSION_WEIKUAN(1007, "预售订金膨胀金额"),//预售订金膨胀金额
    OFFLINE_YOUHUI(1008,"线下优惠金额"),//线下优惠金额，是在支付后人工edit后台改的
    ORDERING_OFFLINE_YOUHUI(1009,"下单时线下优惠金额"),//下单时自动使用的线下优惠，只有芒果长沙的在用
    GROUP_OFFLINE_DISCOUNT(1010,"拼团成团线下优惠"),
    WANLITONG_POINT_DISCOUNT(1011,"万里通积分抵扣优惠"),
    TRAVEL_FOUND_DISCOUNT(1012,"旅行基金抵扣优惠"),
    TRAVEL_POINT_DISCOUNT(1013,"旅行积分抵扣优惠"),
    ;

    private int key;
    private String value;

    CouponTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public static CouponTypeEnum getCouponTypeEnum(int key){
        for(CouponTypeEnum ps : CouponTypeEnum.values()){
            if(ps.getKey()==key){
                return ps;
            }
        }
        return null;
    }

    public static String getValue(int key){
        for(CouponTypeEnum ps : CouponTypeEnum.values()){
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
