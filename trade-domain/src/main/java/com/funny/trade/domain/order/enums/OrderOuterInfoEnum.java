package com.funny.trade.domain.order.enums;

/**
 * 订单营销活动枚举
 */
public enum OrderOuterInfoEnum {
	ACTIVITY(1,"活动","activity"),
	;

	private int key;
	private String name;
	private String outKey;

	OrderOuterInfoEnum(int key, String name, String outKey) {
		this.key = key;
		this.name = name;
		this.outKey = outKey;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOutKey() {
		return outKey;
	}

	public void setOutKey(String outKey) {
		this.outKey = outKey;
	}



	public static OrderOuterInfoEnum getByOutKey(String outKey){
		if(outKey == null || outKey.length() == 0){
			return null;
		}
		for(OrderOuterInfoEnum en : OrderOuterInfoEnum.values()){
			if(outKey.toLowerCase().equals(en.getOutKey().toLowerCase())){
				return en;
			}
		}
		return null;
	}

	public static OrderOuterInfoEnum getByKey(int key){
		for(OrderOuterInfoEnum en : OrderOuterInfoEnum.values()){
			if(key == en.getKey()){
				return en;
			}
		}
		return null;
	}

}
