package com.funny.trade.domain.order.enums;

import java.util.HashMap;
import java.util.Map;


public enum BusinessEnum {
    MALL(10, "品牌旗舰店", -1),
    CFW(11, "车品", -1),
    TOURISM(12, "自驾游-线路游", 1),

    ;

    BusinessEnum(int key, String value, int extKey) {
        this.key = key;
        this.value = value;
        this.extKey = extKey;
    }

    private int key;
    private String value;
    private int extKey;

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

    public int getExtKey() {
        return extKey;
    }

    public void setExtKey(int extKey) {
        this.extKey = extKey;
    }

    public static Map<Integer, String> getAllTypeMap() {
        BusinessEnum[] values = BusinessEnum.values();
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (BusinessEnum type : values) {
            map.put(type.getKey(), type.getValue());
        }
        return map;
    }

    public static String getValue(int key) {
        for (BusinessEnum ps : BusinessEnum.values()) {
            if (ps.getKey() == key) {
                return ps.getValue();
            }
        }
        return null;
    }

    public static BusinessEnum getBusinessEnum(int key) {
        for (BusinessEnum ps : BusinessEnum.values()) {
            if (ps.getKey() == key) {
                return ps;
            }
        }
        return null;
    }
}
