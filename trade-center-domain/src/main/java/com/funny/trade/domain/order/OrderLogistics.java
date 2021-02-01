package com.funny.trade.domain.order;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 订单物流信息
 */
@Data
@Entity
public class OrderLogistics extends BaseEntity {
    private static final long serialVersionUID = 9131658459109864337L;
    /**
     *订单号
     */
    private String orderId;

    /**
     * 物流公司编号
     */
    private Long logisticsCompanyId;

    /**
     *物流公司Name
     */
    private String logisticsCompanyName;
    /**
     *运单号
     */
    private String waybillNo;
    /**
     *创建时间
     */
    private Date createdTime;

    private String createdTimeStr;

    /**
     *修改时间
     */
    private Date modifiedTime;

    /**
     * 发货时间
     */
    private Date deliveryTime;

    /**
     * 确认收货时间
     */
    private Date confirmDeliveryTime;

    /**
     * 发货方式：1 - 物流发货，2 - 非物流发货
     */
    private Integer deliveryType;


}
