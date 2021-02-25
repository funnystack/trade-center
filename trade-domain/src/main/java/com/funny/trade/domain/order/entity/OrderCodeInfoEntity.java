package com.funny.trade.domain.order.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
@Entity
public class OrderCodeInfoEntity extends BaseEntity implements Serializable {
    /**
     *订单号
     */
    private String orderId;
    /**
     *订单类型
     */
    private Integer orderType;
    /**
     *商家编号，跟主单上的相同
     */
    private Integer sellerId;
    /**
     *用户id
     */
    private Long userId;
    /**
     *sku编号，跟订单明细里的相同
     */
    private Long skuId;
    /**
     * 活动id，预留，库中没有
     */
    private Long productId;
    /**
     *优惠码
     */
    private String couponCode;
    /**
     *发码次数
     */
    private Integer sendCount;
    /**
     *电话
     */
    private String mobilePhone;
    /**
     *过期时间
     */
    private Date effectiveDate;
    /**
     *优惠券状态
     */
    private Integer codeStatus;
    /**
     *使用时间
     */
    private Date usedTime;
    /**
     * 提车vin码
     */
    private String vin;
    /**
     * 最终购买车系id
     */
    private Long seriesId;
    /**
     * 最终购买车型id
     */
    private Long specId;
    /**
     * 最终购买车名字（车系name+车型name）
     */
    private String productName;
    /**
     * 最终提车经销商id
     */
    private Long dealerId;


    private Date pickCarStartTime;//提车开始时间

    private String effectiveDateStr;

    private String channel;//验券渠道

    private String mobilePhoneEncrypt;


}
