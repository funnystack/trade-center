package com.funny.trade.domain.order.entity;

import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
public class OrderExtEntity extends BaseEntity {
    private static final long serialVersionUID = -6896045341203020736L;

    /**
     * 数据源id 10 电商，11 车服务
     */
    private Integer dbSource;
    /**
     * 订单号
     */
    private String orderId;

    /**
     * 是否运营退款审核(1：是 0：否)
     */
    private String isRefundCheck;

    /**
     * 库存类型 1下单减库存；2支付减库存
     */
    private String stockType;

    /**
     * 定金归属0：汽车之家 1：经销商
     */
    private String payTo;

    /**
     * 是否使用车支付(1：是 0：否)
     */
    private String useAutoPay;

    private String submitAdviserName;

    /**
     * 短信相关
     */
    private String smsInfo;

    /**
     * 关单时间间隔，单位分钟
     */
    private Integer orderClosedPeriod;

    /**
     * 是否买断
     */
    private Integer isBuyOut;

    /**
     * settle_to
     */
    private Long settleTo;

    /**
     * 下单顾问ID号，针对线下订单类型
     */
    private Long submitAdviser;

    /**
     * 提车顾问ID号，针对线下订单类型
     */
    private Long consumeAdviser;

    /**
     * 是否使用汽车之家POS刷尾款（1为是，0为否）
     */
    private Integer isTailMoney;

    /**
     * 统计系统用到的pageLoadId
     */
    private String pageLoadId;

    /**
     * 是否使用台账，使用1，否则null
     */
    private Integer isUseAccount;

    /**
     * 订金是否返还买家： 0-不返还用户 1-返还用户
     */
    private String payToExtend;

    /**
     * 退款自动处理的类型，1为自动通过
     */
    private Integer refundAutoType;

    /**
     * 自动处理的时间，单位天
     */
    private Integer refundAutoDayNum;

    /**
     * 1表示延迟结算，否则都不是
     */
    private Integer settleDelay;

    /**
     * 延迟结算天数，没有是null
     */
    private Integer settleDelayDayNum;

    /**
     * 对于代理人订单标记推送模板ID
     */
    private Integer platformPushId;

    /**
     * 是否允许锁定金
     */
    private Integer allowLockDeposit;

    /**
     * 预终止自动结算的时间
     */
    private Date autoTerminateTime;

    /**
     * 预终止之后自动变终止的天数
     */
    private Integer arbitrationDayNum;

    /**
     * 上传凭证的开始时间
     */
    private Date invoiceStartTime;

    /**
     * 上传凭证的结束时间
     */
    private Date invoiceEndTime;

    /**
     * 相对验券的间隔天数
     */
    private Integer invoiceInterval;

    /**
     * 商家后台发票状态：0-未上传 ，1-已上传，2-通过 ，3-未通过
     */
    private Integer sellerInvoiceStatus;

    /**
     * 分期方案类型，1 是分期方案
     */
    private Integer installmentSchemeType;

    /**
     * 尾款支付方式：0 - 未选择 1 - 汽车之家pos 2 - 其他
     */
    private Integer restPayMethod;

    /**
     * 是否允许单独售卖 1 允许，0 不是
     */
    private Integer allowSingleSale;

    /**
     * 物流方式 1 自提， 2 物流;  4 虚拟发货
     */
    private Integer deliveryMethod;

    /**
     * 各种特殊的活动的标记：1、五菱半价车，2、一元抽奖，3、大通
     */
    private Integer marketingType;

    /**
     * 自营金融车采购状态 0：初始值 1：Call车 2：配板 21：确认交付店信息 22：确认车辆信息 23：打款凭证 24：备车完成 3：发车 31：到店前通知 32：接车 4：车到店（弃用）5：生成费用清单（弃用）51：预约交车时间 52：验车 6：确认费用清单 7：放款通知 8：交付
     */
    private Integer purchaseStatus;

    /**
     * 金融的类型，1湖南，2全国
     */
    private Integer financeType;

    /**
     * 商品类型（车、券、非车）- OrderCommodityType
     */
    private Integer commodityType;

    /**
     * 允许退款的开始时间
     */
    private Date allowRefundTime;

    /**
     * 标记金融单是否生成了费用明细(0未生成；1生成)
     */
    private Integer isCreatedFeeDetail;

    /**
     * 认款状态：0 - 未认款 1-已认款
     */
    private Integer receiveStatus;

    /**
     * 是否需要走交付流程 0-不需要 1-需要
     */
    private Integer deliveryFlow;

    /**
     * 交付物流： 0 - 未选择 1-其他物流 2-长久物流
     */
    private Integer deliveryLogistics;

    /**
     * 是否承运：0-未反馈 1-承运 2-不承运
     */
    private Integer isCarriageAccepted;

    /**
     * 订单默认自动完成时间,没有就是2099年
     */
    private Date autoCompleteTime;

    /**
     * 是否盟主 1 是，0 不是
     */
    private Integer allianceType;

    /**
     * 0:默认值;1:商品售价抵扣车款
     */
    private Integer depositType;

    /**
     * 是否允许线上支付尾款
     */
    private Integer isFinalPayOnline;

    /**
     * 商家后台放款通知状态：0-未上传 ，1-已上传（审核中），2-通过 ，3-未通过
     */
    private Integer sellerLoannoticeStatus;
    /**
     * 是否自营店铺，商家单独的字段，不同于二网盟主之类 0不是，1是
     */
    private Integer isSelfAuthenticate;

    /**
     * 支付流程，1 大定
     */
    private Integer paymentProcess;

    /**
     * 顾问名称加密
     */
    private String submitAdviserNameEncrypt;

    /**
     * 顾问名称加密
     */
    private String submitAdviserNameHash;

    /**
     * 企业支付，1 支持，0 不支持
     */
    private Integer isEnterprisePay;

    /**
     * 必须在汽车之家支付尾款，1 是，0 否
     */
    private Integer isMustFinalpayInAuto;

    /**
     * 1 车付家;2 车益家;3 车融家
     */
    private Integer cpsType;

    /**
     * 订单限制条件，0 默认值，1 限制查询；存储方式为二进制位，格式为：1，2，4，8，16….2^31
     */
    private Integer restrictType;

    /**
     * 保单初次审核通过的时间
     */
    private Date contractFirstAuditTime;

    /**
     * 经销商选择类型 1：可选择 0：不可选
     */
    private Integer dealerSelectType;

    /**
     * 是否保价0 不是，1 时
     */
    private Integer isBaoJia;

    /**
     * 0:不需要验码；1：需要验码
     */
    private Integer checkCodeFlag;

    /**
     * 开始办理时间
     */
    private Date processingTime;

    /**
     * 系统版本号,对于违章代办来说即app版本号
     */
    private Integer sysVersion;

    /**
     * 系统平台标识,1:iOS;2:android。对于违章代办来说即app系统平台
     */
    private Integer sysPlatform;

    /**
     * 最终商家分成
     */
    private BigDecimal settlePaypartner;

    /**
     * 最终服务费
     */
    private BigDecimal settleOthercosts;

    /**
     * 第一个商家id
     */
    private Integer firstSellerid;

    /**
     * 第一个商家设置id
     */
    private Integer firstSellerSettingsId;

    /**
     * 面值
     */
    private BigDecimal parvalue;

    /**
     * 专享码
     */
    private String orderCode;

    /**
     * 意向经销商
     */
    private String dealerId;

    /**
     * 支付回调状态
     */
    private Integer payNotifyStatus;

    /**
     * 尾款回调状态
     */
    private Integer finalpayNotifyStatus;

    /**
     * 尾款修改的锁
     */
    private Integer finalpayLock;

    /**
     * invite_type
     */
    private Integer inviteType;

    /**
     * 开始提车时间
     */
    private Date pickCarStartTime;

    /**
     * 0:非预售 ,1:预售
     */
    private Integer isPreSell;

    /**
     * 定金支付时间
     */
    private Date paymentEarnestTime;

    /**
     * 上传发票
     */
    private Integer upInvoice;

    /**
     * 代客下单 交付店商家编号
     */
    private Integer agentSellerId;

    /**
     * 订单来源，1：pc，2：m端等等
     */
    private String orderSource;

}
