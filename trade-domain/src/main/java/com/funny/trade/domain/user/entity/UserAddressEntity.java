package com.funny.trade.domain.user.entity;

import com.funny.combo.core.base.BaseEntity;

public class UserAddressEntity extends BaseEntity {
    private static final long serialVersionUID = 1614480729905L;

    /**
    * 
    */
    private String userId;

    /**
    * 1 用户地址
    */
    private Integer userType;

    /**
    * 国家
    */
    private Integer countryId;

    /**
    * 国家名
    */
    private String countryName;

    /**
    * 省份id
    */
    private Integer provinceId;

    /**
    * 省份名称
    */
    private String provinceName;

    /**
    * 城市id
    */
    private Integer cityId;

    /**
    * 城市name
    */
    private String cityName;

    /**
    * 区县id
    */
    private Integer countyId;

    /**
    * 区县name
    */
    private String countyName;

    /**
    * 区县name
    */
    private String address;

    /**
    * 手机号
    */
    private String mobile;

    /**
    * 联系人
    */
    private String contactPerson;

    /**
    * 标签集合
    */
    private String labels;

    /**
    * 是否默认地址
    */
    private Integer isDefault;

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }

    public String getCountyName() {
        return countyName;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson == null ? null : contactPerson.trim();
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setLabels(String labels) {
        this.labels = labels == null ? null : labels.trim();
    }

    public String getLabels() {
        return labels;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getIsDefault() {
        return isDefault;
    }
}