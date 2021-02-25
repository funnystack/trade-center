package com.funny.trade.domain.order.enums;

import java.util.HashMap;
import java.util.Map;


public enum RefundTypeEnum {

	    REFUND_SELF(1,"用户申请退款"),
	    REFUND_AUTO(2,"超期自动退款"),
	    REFUND_AGENT(3,"客服申请退款"),
		REFUND_FOR_USER(4,"代客申请退款"),//tmh 和 b2c 通过接口调用
		REFUND_DEPOSIT_BACKTRACE(5,"订金原路退款"),	//定金原路退款
		REFUND_OFFLINE(64,"线下退款"),
		REFUND_ATTRIBUTE(6,"用户申请仲裁")
		;

	    private int key;
	    private String value;

	    RefundTypeEnum(int key, String value) {
	        this.key = key;
	        this.value = value;
	    }
	    public static RefundTypeEnum getRefundTypeEnum(int key){
	        for(RefundTypeEnum ps : RefundTypeEnum.values()){
	            if(ps.getKey()==key){
	                return ps;
	            }
	        }
	        return null;
	    }

	    public static String getValue(int key){
	        for(RefundTypeEnum ps : RefundTypeEnum.values()){
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

	    public static Map<Integer,String> getRefundTypeMap(){
	    	RefundTypeEnum[] values =  RefundTypeEnum.values();
	    	Map<Integer,String> map = new HashMap<Integer,String>();
	    	for (RefundTypeEnum refund : values){
	    		map.put(refund.getKey(), refund.getValue());
	    	}
	    	return map;
	    }
}
