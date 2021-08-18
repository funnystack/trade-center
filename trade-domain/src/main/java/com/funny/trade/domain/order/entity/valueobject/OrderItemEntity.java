package com.funny.trade.domain.order.entity.valueobject;

import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemEntity extends BaseEntity {
    private static final long serialVersionUID = 1580961805080L;

    /**
     * 数据源id 10电商 11 车服务
     */
    private Long dbSource;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 类目id全路径
     */
    private String categoryPath;
    /**
     * sku编号
     */
    private Long skuId;
    /**
     * sku名称
     */
    private String skuName;
    /**
     * product类型
     */
    private Integer skuType;

    /**
     * 销售属性
     */
    private String saleProp;

    /**
     * 商品图片url
     */
    private String imageUrl;

    /**
     * 购买数量
     */
    private Integer itemNum;
    /**
     * 一辆车可能价值50万（单个商品的）
     */
    private BigDecimal valuePriceMax;
    /**
     * 一辆车可能价值50万（单个商品的）
     */
    private BigDecimal valuePriceMin;
    /**
     * 价格的ID
     */
    private Integer priceId;
    /**
     * 一辆车可能价值50万,线上只卖1000,线下尾款49000
     */
    private BigDecimal onlinePrice;
    /**
     * 商品减去优惠后的价钱（单个商品的）
     * 比如单品直降的活动，满减的活动
     * onlinePrice 为原价，price为减完优惠后的价钱
     */
    private BigDecimal price;
    /**
     * 实付款，单价*数量
     */
    private BigDecimal actualPayment;
    /**
     * 是否为赠品，1赠品，0非增品
     */
    private Integer isGift;
    /**
     * 赠品关联主商品skuid
     */
    private Long parentSkuId;
    /**
     * 商家ID
     */
    private Integer sellerId;
    /**
     * 结算价（单个）
     */
    private BigDecimal settlementPrice;
    /**
     * 扩展信息
     * 提车城市id：pickCityId 提车地区id：pickCountyId
     */
    private String extend;
}
