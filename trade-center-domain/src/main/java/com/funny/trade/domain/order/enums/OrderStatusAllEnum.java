package com.funny.trade.domain.order.enums;
/**
 * @function:订单状态枚举
 * @author: lichao0413
 * @created: 2015年5月14日 上午9:48:03
 */
public enum OrderStatusAllEnum {

	//order_status相关,未补充，在orderStatusEnum中
	//is_delete 字段相关
	ISDELETE_NOTDELETE("is_delete",1,"正常"),
	ISDELETE_LOCK("is_delete",3,"锁定"),
	ISDELETE_DONE("is_delete",2,"已取消"),

	//refund_status字段相关
	REFUNDSTATUS_NOTREFUND("refund_status",0,"正常"),
	REFUNDSTATUS_DOING("refund_status",1,"退款中"),
	REFUNDSTATUS_DONE("refund_status",2,"退款完成"),
	REFUNDSTATUS_REJECT("refund_status",3,"退款驳回"),
	REFUNDSTATUS_TEMINATE("refund_status",4,"订单终止"),
	REFUNDSTATUS_PRETEMINATE("prerefund_status",5,"订单预终止"),
	;

	private String field;
	private int key;
	private String value;

	OrderStatusAllEnum(String field, int key, String value){
		this.field = field;
		this.key = key;
		this.value = value;
	}

	public static OrderStatusAllEnum getByFieldAndKey(String field,int key){
		for(OrderStatusAllEnum en: OrderStatusAllEnum.values()){
			if(en.getField().equals(field) && en.getKey() == key){
				return en;
			}
		}
		return null;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}


}
