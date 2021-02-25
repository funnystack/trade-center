package com.funny.trade.domain.coupon.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

@Data
@Entity
public class CouponMappingEntity extends BaseEntity {
    private static final long serialVersionUID = 1607184616699L;

    /**
    * 批次ID
    */
    private String batchId;

    /**
    * 费用承担部门 department
    */
    private String expenseDep;

    /**
    * 抵扣方式 0为线上优惠，1为线下优惠，2为返现
    */
    private Long couponType;

    /**
    * 场景使用限制: 0 不限制 1 营销事件级别 2 场次级别 3 关联到某些商品 4 关联到某个店铺所有商品 5 关联到某个订单类型商品
    */
    private Long useScene;

    /**
    * 营销事件场次
    */
    private Long processId;

    /**
    * 营销事件ID
    */
    private Long eventId;

    /**
    * 商家ID
    */
    private Integer sellerId;

    /**
    * 商品ID
    */
    private Long productId;

    /**
    * 商品类型
    */
    private Integer itemSource;

    /**
    * 1:白名单, 2:黑名单
    */
    private Integer type;

    /**
    * 使用节点限制: 1 下单 2 验券提车
    */
    private Long useNode;

    /**
    * 叠加互斥规则 1：全部叠加 2：全部互斥 3：个性化配置
    */
    private Integer useRuleType;

    /**
    * 1:有效, 2:无效
    */
    private Integer status;

    /**
    * 是否使用扩展适用范围 0：否  1：是
    */
    private Integer useScope;

    /**
    * 商品类目id
    */
    private Integer itemCategory;

    /**
    * 优惠规则
    */
    private String couponRule;

    /**
    * 平台费用承担比例
    */
    private Integer ratio;
}
