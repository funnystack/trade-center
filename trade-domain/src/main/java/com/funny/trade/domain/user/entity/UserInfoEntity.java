package com.funny.trade.domain.user.entity;

import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;

@Entity
public class UserInfoEntity extends BaseEntity {
    private static final long serialVersionUID = 1614480577841L;

    /**
    * 用户名
    */
    private String userName;
    private String userPwd;
    /**
    * 手机号加密
    */
    private String mobile;

    /**
     * 用户状态
     */
    protected Integer userStatus;
    /**
    * 手机号hash
    */
    private String mobileHash;

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobileHash(String mobileHash) {
        this.mobileHash = mobileHash == null ? null : mobileHash.trim();
    }

    public String getMobileHash() {
        return mobileHash;
    }
}