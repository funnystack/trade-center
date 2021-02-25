package com.funny.trade.domain.order.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 退款表状态
 */
public enum RefundStatusEnum {

    WAIT_AUDIT(1,"待审核"),
    REFUNDED(2,"已退款"),
    REFUNDING(3,"待银行退款"),
    REJECT(4,"审核不通过"),
    TERMINATED(5,"交易终止"),
    WAIT_REFUND(6,"待退款")
    ;

    private int key;
    private String value;

    RefundStatusEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public static RefundStatusEnum getRefundStatusEnum(int key){
        for(RefundStatusEnum ps : RefundStatusEnum.values()){
            if(ps.getKey()==key){
                return ps;
            }
        }
        return null;
    }

    public static String getValue(int key){
        for(RefundStatusEnum ps : RefundStatusEnum.values()){
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

    public static Map<Integer,Object> getRefundStatusMap(){
    	RefundStatusEnum[] values =  RefundStatusEnum.values();
    	Map<Integer,Object> map = new HashMap<Integer,Object>();
    	for (RefundStatusEnum refund : values){
    		map.put(refund.getKey(), refund.getValue());
    	}
    	return map;
    }
}
