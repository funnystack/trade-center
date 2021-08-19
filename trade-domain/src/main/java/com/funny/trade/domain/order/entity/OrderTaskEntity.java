package com.funny.trade.domain.order.entity;


import com.funny.combo.core.base.BaseEntity;
import com.funny.combo.core.ddd.annotion.Entity;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class OrderTaskEntity extends BaseEntity {
    private static final long serialVersionUID = 1589179391737L;

    /**
    * 类型：1、商家后台通知 2,"微信通知";
    */
    private Integer type;

    /**
    * 引用id
    */
    private Long rfId;

    /**
    * 引用类型
    */
    private Integer rfType;

    /**
    * 任务状态：0等待处理，1完成，2失败，3等待确认
    */
    private Integer status;

    /**
    * 任务数据json格式
    */
    private String taskData;

    /**
    * 优先级
    */
    private Integer pri;

    /**
    * 失败次数
    */
    private Integer failCount;

    /**
    * 自动重试
    */
    private Integer autoRedo;

    /**
    * 创建时间
    */
    private Date createdTime;

    /**
    * 修改时间
    */
    private Date modifiedTime;

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setRfId(Long rfId) {
        this.rfId = rfId;
    }

    public Long getRfId() {
        return rfId;
    }

    public void setRfType(Integer rfType) {
        this.rfType = rfType;
    }

    public Integer getRfType() {
        return rfType;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setTaskData(String taskData) {
        this.taskData = taskData == null ? null : taskData.trim();
    }

    public String getTaskData() {
        return taskData;
    }

    public void setPri(Integer pri) {
        this.pri = pri;
    }

    public Integer getPri() {
        return pri;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public Integer getFailCount() {
        return failCount;
    }

    public void setAutoRedo(Integer autoRedo) {
        this.autoRedo = autoRedo;
    }

    public Integer getAutoRedo() {
        return autoRedo;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }
}
