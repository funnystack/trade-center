package com.funny.trade.domain.order.entity;

import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

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
     * sku价格
     */
    private BigDecimal price;

    /**
     * 商品编号
     */
    private Long productId;

    /**
     * 是否为赠品，1赠品，0非增品
     */
    private Integer isGift;

    /**
     * 赠品关联主商品skuid
     */
    private Long parentSkuId;

    /**
     * 外部id
     */
    private String outerId;

    /**
     * 车系id
     */
    private Long seriesId;

    /**
     * 车型id
     */
    private Long specId;

    /**
     * 车商城价
     */
    private BigDecimal ecPrice;

    /**
     * 线上要支付的金额
     */
    private BigDecimal onlinePrice;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 商家ID
     */
    private Integer sellerId;

    /**
     * 结算价
     */
    private BigDecimal settlementPrice;

    /**
     * 实付款，单价*数量
     */
    private BigDecimal actualPayment;

    /**
     * 其它费用
     */
    private BigDecimal otherCosts;

    /**
     * 优惠信息
     */
    private String preferential;

    /**
     * 附加信息
     */
    private String additionalInfo;

    /**
     * 价格的ID
     */
    private Integer priceId;

    /**
     * 提车城市id
     */
    private Long ruleCityId;

    /**
     * 提车地区id
     */
    private Long ruleCountyId;

    /**
     * ruleId
     */
    private Long ruleId;

    /**
     * 商品主数据的商品id
     */
    private Long mainItemId;
    /**
     * 商品主数据skuId
     */
    private Long mainSkuId;

    /**
     * 多品类后每个商品的差异化信息(TurboOrderDetailExtend的json串)
     */
    private String detailExtend;

    private Long extendId;

    private Integer couponCategory;
    private Long parentExtendId;

    /**
     * 分类id
     */
    private Integer categoryId;
    private List<String> salePropList;

    /**
     * 活动库存id列表
     */
    private String actStockIds;

}
