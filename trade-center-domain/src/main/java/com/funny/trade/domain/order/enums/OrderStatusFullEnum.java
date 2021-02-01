package com.funny.trade.domain.order.enums;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * OrderStatusDisplayEnum的改良版
 */
public enum OrderStatusFullEnum {

	WAIT_SPLIT(			1,1,0,312),
	HAS_SPLIT(		  101,1,0,3121),
	WAIT_PAY(				2,1,0,301),



	WAIT_SEND_CODE(		   11,1,0,313),
	WAIT_SEND_REJECTED(	   11,1,3,313),
	GIFT_REFUNDING2(	   11,3,1,304),
	GIFT_REFUNDED2(		   11,2,2,305),

	WAIT_CONFIRM_DELIVERY( 15,1,0,315),
	WAIT_CONFIRM_REJECTED( 15,1,3,315),
	GIFT_REFUNDING3(	   15,3,1,304),
	GIFT_REFUNDED3(		   15,2,2,305),

	HAS_PAY(			   16,1,0,303),
	PAY_REJECTED(		   16,1,3,303),
	PAY_REFUNDING(		   16,3,1,304),
	PAY_REFUNDED(		   16,2,2,305),


	HAS_FINISH(			   20,1,0,309),
	FINISH_REJECTED(	   20,1,3,309),
	FINISH_REFUNDING(	   20,3,1,304),
	FINISH_REFUNDED(	   20,2,2,305),

	CLOSE(				   0,2,0,310),
	CANCAL(					-1,2,0,302)






	;

	private int orderStatus;
	private int validStatus;
	private int refundStatus;


	private int outputStatus;//对外输出时的status值，仅作查询时的映射，请不要保存，会变，格式3xx


	/**
	 * 通过原始状态解析输出展示的状态枚举
	 * @param orderStatus
	 * @param validStatus
	 * @param refundStatus
	 * @param extendStatus
	 * @return
	 */
	public static OutputOrderStatusEnum getOutputStatusEnumByOriginStatus(Integer orderStatus,Integer validStatus,Integer refundStatus,Integer extendStatus){
		OrderStatusFullEnum fullEnum = null;
		if(orderStatus == null || validStatus == null || refundStatus == null){
			return null;
		}
		for(OrderStatusFullEnum en : OrderStatusFullEnum.values()){
			if(orderStatus == en.getOrderStatus() && validStatus == en.getValidStatus() && refundStatus == en.getRefundStatus()){
				fullEnum = en;
				break;
			}
		}

		if(fullEnum != null){
			for(OutputOrderStatusEnum en : OutputOrderStatusEnum.values()){
				if(fullEnum.getOutputStatus() == en.getStatus()){
					return en;
				}
			}
		}else{
			if(OrderStatusEnum.WAIT_CONSUME.getKey() == orderStatus
					&& OrderStatusAllEnum.ISDELETE_LOCK.getKey() == validStatus
					&& (OrderStatusAllEnum.REFUNDSTATUS_NOTREFUND.getKey() == refundStatus
					|| OrderStatusAllEnum.REFUNDSTATUS_REJECT.getKey() == refundStatus)){
			}
		}

		return null;
	}


	public static List<OrderStatusFullEnum> getSourceByOutputStatus(Integer outputStatus){
		List<OrderStatusFullEnum> list = Lists.newArrayList();
		if(outputStatus != null){
			for(OrderStatusFullEnum en : OrderStatusFullEnum.values()){
				if(outputStatus.intValue() == en.getOutputStatus()){
					list.add(en);
				}
			}
		}
		return list;
	}

	private OrderStatusFullEnum(int orderStatus, int validStatus, int refundStatus, int outputStatus){
		this.orderStatus = orderStatus;
		this.validStatus = validStatus;
		this.refundStatus = refundStatus;
		this.outputStatus = outputStatus;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getvalidStatus() {
		return validStatus;
	}

	public void setvalidStatus(int validStatus) {
		this.validStatus = validStatus;
	}

	public int getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(int refundStatus) {
		this.refundStatus = refundStatus;
	}


	public int getOutputStatus() {
		return outputStatus;
	}

	public void setOutputStatus(int outputStatus) {
		this.outputStatus = outputStatus;
	}

	public int getValidStatus() {
		return validStatus;
	}

	public void setValidStatus(int validStatus) {
		this.validStatus = validStatus;
	}



	public static Integer getOrderStatus(Integer orderStatus,Integer isDelete,Integer refundStatus) {
		OutputOrderStatusEnum orderStatusEnum = OrderStatusFullEnum.getOutputStatusEnumByOriginStatus(
				orderStatus, isDelete,
				refundStatus, null);

		return orderStatusEnum.getStatus();
	}


}
