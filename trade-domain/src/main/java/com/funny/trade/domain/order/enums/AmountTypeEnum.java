package com.funny.trade.domain.order.enums;
/**
 * 与台账交互的金额的类型，比如定金，尾款
 *
 */
public enum AmountTypeEnum {
	DOWN_PAYMENT(1,"订金"),
	FINAL_PAY(2,"尾款"),
	COMMISSION_CHARGE(3,"手续费"),
	INTENTION_FEE(4, "意向金"),
	DEPOSIT(5, "大额定金"),
	FinancialLoan(6, "金融贷款"),
	GPS_FEE(7, "GPS费"),
	Insurance(8, "保险"),
	Purchase_Tax(9, "购置税")
	;

	private int key;
	private String value;

	private AmountTypeEnum(int key, String value){
		this.key = key;
		this.value = value;
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

	public static String getValue(int key){
		for(AmountTypeEnum ps : AmountTypeEnum.values()){
			if(ps.getKey() == key){
				return ps.getValue();
			}
		}
		return "未知";
	}

}
