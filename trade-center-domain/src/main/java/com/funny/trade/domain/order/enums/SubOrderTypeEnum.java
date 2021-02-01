package com.funny.trade.domain.order.enums;

import java.util.HashMap;
import java.util.Map;

public enum SubOrderTypeEnum {
    DEFAULT(0,"父单"),
    CAR(1,"主商品"),
    GIFT(2,"赠品"),
    FINANCE(3,"金融"),
    GIFT_PACKAGE(5,"大礼包"),
    PACKAGE(6,"套装"),
    CROSS_PACKAGE(7,"跨店套装"),
    OTHERS(99,"其它");




    private int key;
    private String value;

    SubOrderTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public static SubOrderTypeEnum getCouponCodeStatusEnum(int key){
        for(SubOrderTypeEnum ps : SubOrderTypeEnum.values()){
            if(ps.getKey()==key){
                return ps;
            }
        }
        return null;
    }

    public static String getValue(int key){
        for(SubOrderTypeEnum ps : SubOrderTypeEnum.values()){
            if(ps.getKey() == key){
                return ps.getValue();
            }
        }
        return null;
    }
    public static int getKeyByValue(String source){
        for(SubOrderTypeEnum ps : SubOrderTypeEnum.values()){
            if(ps.getValue().equalsIgnoreCase(source)){
                return ps.getKey();
            }
        }
        return 0;
    }
    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }


    public static Map<Integer,String> getAllTypeMap(){
    	SubOrderTypeEnum[] values =  SubOrderTypeEnum.values();
    	Map<Integer,String> map = new HashMap<Integer,String>();
    	for (SubOrderTypeEnum type : values){
    		map.put(type.getKey(), type.getValue());
    	}
    	return map;
    }
}
