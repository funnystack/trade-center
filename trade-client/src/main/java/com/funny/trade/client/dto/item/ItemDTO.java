package com.funny.trade.client.dto.item;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ItemDTO implements Serializable {
    private static final long serialVersionUID = -8503072823047246063L;
    private Long itemId;
    private Long skuId;
    private Integer status;
    private Date startTime;
    private Date endTime;
    private Integer allowMallInstallment;
    private Integer allowInstallment;
    private Integer businessId;
    private Integer allowBooking;
    private Integer source;
    private Integer categoryId;
    private String name;
    private String picUrl;
    private Integer factoryId;
    private Integer brandId;
    private Integer seriesId;
    private Integer specId;
    private Long providerId;
    private BigDecimal price;
    private BigDecimal memberPrice;
}
