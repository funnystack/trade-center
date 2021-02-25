package com.funny.trade.domain.coupon.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class CouponBaseEntity extends BaseEntity {
    private static final long serialVersionUID = 1607184431352L;

    /**
    * 批次ID
    */
    private String batchId;

    /**
    * 领取ID
    */
    private String getId;

    /**
    * 优惠券批次标题
    */
    private String batchTitle;

    /**
    * 提示语
    */
    private String prompt;

    /**
    * 领取优惠券开始时间
    */
    private Date getStartTime;

    /**
    * 领取优惠券结束时间
    */
    private Date getEndTime;

    /**
    * 使用节点限制: 1 下单 2 验券提车
    */
    private Integer useNode;

    /**
    * 下单使用开始时间
    */
    private Date useStartTime;

    /**
    * 下单使用失效时间
    */
    private Date useEndTime;

    /**
    * 下单使用时间类型 1:绝对时间 2:相对时间
    */
    private Integer useTimeType;

    /**
    * 验券提车使用开始时间
    */
    private Date pickUseStartTime;

    /**
    * 验券提车使用失效时间
    */
    private Date pickUseEndTime;

    /**
    * 券的金额
    */
    private BigDecimal couponSum;

    /**
    * 1:绝对金额 2:单次领取最大金额 4:同一批次领取最大金额
    */
    private Integer couponSumType;

    /**
    * 生成总数
    */
    private Integer total;

    /**
    * 领取总数
    */
    private Integer grantNum;

    /**
    * 已使用总数
    */
    private Integer usedNum;

    /**
    * 券的使用方式类型 1 不关联用户 2 关联用户
    */
    private Integer couponMode;

    /**
    * 审核状态码：0为待审核，1为已通过，2为被驳回
    */
    private Integer checkStatus;

    /**
    * 批次状态：-1为草稿 0为未生成，1为有效，2为失效，3为过期，99为生成中
    */
    private Integer batchStatus;

    /**
    * 抵扣方式 -1为待定，取决于使用规则 0为线上优惠，1为线下优惠，2为返现
    */
    private Integer couponType;

    /**
    * 优惠券类型 如：普通红包、满减红包等
    */
    private Integer category;

    /**
    * 适用平台 -1：全部 1：pc端专用，2：m端专用，4：车商城app专用，8：主软件app专用，16：报价app专用，32：顾问app专用，64：百万代理人（eg：12=4+8表示车商城app和主软件app可用）
    */
    private Integer source;

    /**
    * 业务类型
    */
    private Integer bizType;

    /**
    * 推广平台 -1：全部 1：pc端专用，2：m端专用，4：车商城app专用，8：主软件app专用，16：报价app专用，32：顾问app专用，64：百万代理人，128：商家版App（eg：12=4+8表示车商城app和主软件app可用）
    */
    private Integer promotion;

    /**
    * 短信模板id
    */
    private Integer templateId;

    /**
    * 每个用户限领该批次券几张(默认为1张) 0：不限制张数
    */
    private Integer limitNum;

    /**
    * 限制使用的金额，如：满减
    */
    private Long limitSum;

    /**
    * 玩法 1：收藏 2：百万代理人
    */
    private Integer playType;

    /**
    * 领取方式 1:同步 2:异步
    */
    private Integer getType;

    /**
    * 领取使用类型 0:可以不同时使用 1:必须同时使用
    */
    private Integer getUseType;

    /**
    * 同一批次的优惠券金额是否累加显示 0:否 1:是
    */
    private Integer couponSumAdd;

    /**
    * 上传发票标识 0:不需要上传发票 1:规定时间上传发票 2:提车后上传发票
    */
    private Integer uploadInvoice;

    /**
    * 审核人
    */
    private String checkedMan;

    /**
    * 创建人商家ID
    */
    private Integer sellerId;

    /**
    * 创建人
    */
    private String createdMan;

    /**
    * 广告语
    */
    private String advertisement;

    /**
    * 已关联的数量,默认为:0
    */
    private Integer relevanceNum;

    /**
    * 备注
    */
    private String remark;

    /**
    * 兑换标识,用于会员卡标识，关联dict表
    */
    private Integer exchangeFlag;

    /**
    * 用户标识
    */
    private Integer userFlag;

    /**
    * 限制领取标识，1：每天每人领取标识 0: 限制领取总数标识COMMENT
    */
    private Integer moreTakeFlag;

    /**
    * 最大优惠金额
    */
    private BigDecimal maxPreferentialPrice;

    /**
    * 立即使用地址
    */
    private String useUrl;

    /**
    * 推送的时候，区分车品和旅行家优惠券 模板编号：
    */
    private Integer tempId;

    /**
    * 0一次满减  1累加满减
    */
    private Integer perCutFlag;

    /**
    * 0不推送1推送
    */
    private Integer pushMainApp;

    /**
    * 财务活动id
    */
    private String financeActivity;

    /**
    * 国家 GB  DE
    */
    private String country;
}
