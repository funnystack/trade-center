package com.funny.trade.domain.order.enums;

import java.util.Map;
import java.util.TreeMap;

/**
 * 对外的订单状态值枚举，如：seller、openAPI、台账等
 */
public enum OutputOrderStatusEnum {
    WAIT_PAY(301,"待付款"),
    CANCAL(302,"已取消"),
    HAS_PAY(303,"已付款"),
    REFUNDING(304,"退款中"),
    REFUNDED(305,"已退款"),
    TERMINATE(306,"交易终止"),
    PRE_TERMINATE(3061,"锁定待结算"),
    COUPON_CONSUMED(307,"已验券"),
    DELIVERED(308,"已交付"),
    HAS_FINISH(309,"完成"),
    CLOSE(310,"超时关闭"),
    DOWNPAYMENT_PAY(311,"首付已付"),
    WAIT_SPLITE(312,"处理中"),
    HAS_SPLITED(3121,"已拆分"),
    WAIT_OUT_STORAGE(313,"等待发货"),
    WAIT_CONFIRM_DELIVERY(315,"等待确认收货"),
    INTENTION_PAY(316,"已付意向金"),
    WAIT_DEPOSIT_PAY(319,"等待付定金"),
    DEPOSIT_PAY(322,"已付定金"),
    WAIT_DOWN_PAY(323,"待付首付"),
    WAIT_FINISH(325,"已收货"),
    ORDER_CHANGED(330,"已换单"),
    PAYIED_FRPZEN(331,"已付款（冻结中）"),  //16,3,0 || 16,3,3
    QUOTATION_DEPOSIT_PAY(332,"报价单已付定金"),
    HAS_CREATED(333,"已创建"),
    HAS_SEND_CODE(334,"已创建"),
    woringing(335,"正在办理"),
    HAS_BOOKING(336,"已预约"),
    HAS_VALID(337,"已验证")

    ;

    private int status;

    private String name;

    public static Map<Integer,String> getOutputStatusMap(){

        Map<Integer,String> map = new TreeMap<Integer,String>();
        for(OutputOrderStatusEnum en : OutputOrderStatusEnum.values()){

            if(map.containsKey(en.getStatus())){
                continue;
            }
            map.put(en.getStatus(), en.getName());
        }
        return map;
    }

    public static String getNameByOutputStatus(Integer outputStatus){
        if(outputStatus != null){
            for(OutputOrderStatusEnum en : OutputOrderStatusEnum.values()){
                if(outputStatus.intValue() == en.getStatus()){
                    return en.getName();
                }
            }
        }
        return "--";
    }

    OutputOrderStatusEnum(int status, String name) {
        this.status = status;
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public OutputOrderStatusEnum setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getName() {
        return name;
    }

    public OutputOrderStatusEnum setName(String name) {
        this.name = name;
        return this;
    }
}
