package com.funny.trade.domain.user.entity;

import com.funny.combo.core.base.BaseEntity;

public class UserWxInfoEntity extends BaseEntity {
    private static final long serialVersionUID = 1614480713609L;

    /**
    * 用户id
    */
    private Long userId;

    /**
    * openid
    */
    private String openId;

    /**
    * unionId 
    */
    private String unionId;

    /**
    * phone 
    */
    private String wxPhone;

    /**
    * 昵称
    */
    private String wxNickName;

    /**
    * 性别
    */
    private String wxGender;

    /**
    * 国家
    */
    private String wxCountry;

    /**
    * 城市
    */
    private String wxCity;

    /**
    * 省份
    */
    private String wxProvince;

    /**
    * 头像url
    */
    private String wxAvatarUrl;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public String getUnionId() {
        return unionId;
    }

    public void setWxPhone(String wxPhone) {
        this.wxPhone = wxPhone == null ? null : wxPhone.trim();
    }

    public String getWxPhone() {
        return wxPhone;
    }

    public void setWxNickName(String wxNickName) {
        this.wxNickName = wxNickName == null ? null : wxNickName.trim();
    }

    public String getWxNickName() {
        return wxNickName;
    }

    public void setWxGender(String wxGender) {
        this.wxGender = wxGender == null ? null : wxGender.trim();
    }

    public String getWxGender() {
        return wxGender;
    }

    public void setWxCountry(String wxCountry) {
        this.wxCountry = wxCountry == null ? null : wxCountry.trim();
    }

    public String getWxCountry() {
        return wxCountry;
    }

    public void setWxCity(String wxCity) {
        this.wxCity = wxCity == null ? null : wxCity.trim();
    }

    public String getWxCity() {
        return wxCity;
    }

    public void setWxProvince(String wxProvince) {
        this.wxProvince = wxProvince == null ? null : wxProvince.trim();
    }

    public String getWxProvince() {
        return wxProvince;
    }

    public void setWxAvatarUrl(String wxAvatarUrl) {
        this.wxAvatarUrl = wxAvatarUrl == null ? null : wxAvatarUrl.trim();
    }

    public String getWxAvatarUrl() {
        return wxAvatarUrl;
    }
}