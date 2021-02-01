package com.funny.trade.domain.coupon.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
@Entity
public class CouponBindEntity extends BaseEntity {
    private static final long serialVersionUID = 1607184599926L;

    /**
    * 用户ID，默认值0
    */
    private Long userId;

    /**
    * 用户标识
    */
    private String userIdentification;

    /**
    * 批次ID
    */
    private String batchId;

    /**
    * 领取ID
    */
    private String getId;

    /**
    * 优惠券
    */
    private String couponCode;

    /**
    * 券的金额
    */
    private BigDecimal couponSum;

    /**
    * 限制使用的金额，如：满减
    */
    private BigDecimal limitSum;

    /**
    * 使用节点限制: 1 下单 2 验券提车
    */
    private Integer useNode;

    /**
    * 优惠券使用开始时间
    */
    private Date useStartTime;

    /**
    * 优惠券使用结束时间
    */
    private Date useEndTime;

    /**
    * 验券提车使用开始时间
    */
    private Date pickUseStartTime;

    /**
    * 验券提车使用失效时间
    */
    private Date pickUseEndTime;

    /**
    * 抵扣方式 -1为待定 0为线上优惠，1为线下优惠，2为返现
    */
    private Integer couponType;

    /**
    * 优惠券类型 如：普通红包、满减红包等
    */
    private Integer category;

    /**
    * 业务类型
    */
    private Integer bizType;

    /**
    * 玩法
    */
    private Integer playType;

    /**
    * 券使用时间
    */
    private Date usedTime;

    /**
    * 适用平台 -1：全部 1：pc端专用，2：m端专用，4：车商城app专用，8：主软件app专用，16：报价app专用，32：顾问app专用，64：百万代理人（eg：12=4+8表示车商城app和主软件app可用）
    */
    private Integer source;

    /**
    * 0：未使用 1：已经使用 2：失效 3：已过期
    */
    private Integer status;

    /**
    * 购买红包的订单号
    */
    private Long buyOrderId;

    /**
    * 使用红包的订单号
    */
    private String useOrderId;

    /**
    * 手机号
    */
    private String mobile;

    /**
    * 省份id
    */
    private Integer provinceId;

    /**
    * 城市id
    */
    private Integer cityId;

    /**
    * 统计签
    */
    private String pvInfo;

    /**
    * 是否可提现 0否1是
    */
    private Integer isCash;

    /**
    * 拆红包用户id
    */
    private String splitUser;

    /**
    * 优惠券描述
    */
    private String prompt;

    /**
    * 用券时唯一的key
    */
    private String usedKey;

    /**
    * 用券核销位
    */
    private Integer usedConfirm;

    /**
    * 还券核销位
    */
    private Integer rollConfirm;

    /**
    * 使用平台
    */
    private Integer usedPlatform;

    /**
    * 使用节点
    */
    private Integer usedNode;

    /**
    * 返现时间
    */
    private Date cashTime;

    /**
    * 扩展信息
    */
    private String ext;

    /**
    * 是否已发送短信标识  0未发送 1已发送 默认为0
    */
    private Integer sendSmsFlag;

    /**
    * 标题
    */
    private String couponTitle;

    /**
    * 优惠规则
    */
    private String couponRule;

    /**
    * 最大优惠金额
    */
    private BigDecimal maxPreferentialPrice;

    /**
    * 下单优惠金额
    */
    private BigDecimal realDiscountMoney;

    /**
    * 立即使用URL
    */
    private String useUrl;

    /**
    * 是否新规则
    */
    private Integer couponRuleType;

    /**
    * 平台承担比
    */
    private Integer ratio;

    /**
    * 批次标题
    */
    private String batchTitle;

    /**
    * 对标付费会员的渠道，后面可酌情去掉
    */
    private String sourcetype;

    /**
    * 是否累加满减
    */
    private Integer perCutFlag;

}
