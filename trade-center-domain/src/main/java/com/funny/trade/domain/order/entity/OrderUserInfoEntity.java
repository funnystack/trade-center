package com.funny.trade.domain.order.entity;


import com.funny.combo.core.annotion.Entity;
import com.funny.combo.core.base.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class OrderUserInfoEntity extends BaseEntity {
    private String orderId;

    private String fullNameBak;

    private String mobilePhoneBak;

    private Integer provinceId;

    private Integer cityId;

    private Integer countyId;

    private String addressBak;

    private Integer logisticsCompanyId;

    private Integer extType;

    private String idCardBak;

    private String waybillNo;

    private Date createdTime;

    private Date modifiedTime;

    private String deliverySign;

    private Date deliverTime;

    private String fullNameEncrypt;

    private String mobilePhoneEncrypt;

    private String addressEncrypt;

    private String idCardEncrypt;

    private String fullNameHash;

    private String mobilePhoneHash;

    private String addressHash;

    private String idCardHash;

    private BigDecimal invoiceSum;

    private String invoiceTitle;

    private String invoiceType;

    private Integer invoiceStatus;

    private Integer invoiceContentId;

    private String invoiceInfo;

    private Integer areaId;

    private String fullName;

    private String mobilePhone;

    private String address;

    private String idCard;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFullNameBak() {
        return fullNameBak;
    }

    public void setFullNameBak(String fullNameBak) {
        this.fullNameBak = fullNameBak;
    }

    public String getMobilePhoneBak() {
        return mobilePhoneBak;
    }

    public void setMobilePhoneBak(String mobilePhoneBak) {
        this.mobilePhoneBak = mobilePhoneBak;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public String getAddressBak() {
        return addressBak;
    }

    public void setAddressBak(String addressBak) {
        this.addressBak = addressBak;
    }

    public Integer getLogisticsCompanyId() {
        return logisticsCompanyId;
    }

    public void setLogisticsCompanyId(Integer logisticsCompanyId) {
        this.logisticsCompanyId = logisticsCompanyId;
    }

    public Integer getExtType() {
        return extType;
    }

    public void setExtType(Integer extType) {
        this.extType = extType;
    }

    public String getIdCardBak() {
        return idCardBak;
    }

    public void setIdCardBak(String idCardBak) {
        this.idCardBak = idCardBak;
    }

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getDeliverySign() {
        return deliverySign;
    }

    public void setDeliverySign(String deliverySign) {
        this.deliverySign = deliverySign;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public String getFullNameEncrypt() {
        return fullNameEncrypt;
    }

    public void setFullNameEncrypt(String fullNameEncrypt) {
        this.fullNameEncrypt = fullNameEncrypt;
    }

    public String getMobilePhoneEncrypt() {
        return mobilePhoneEncrypt;
    }

    public void setMobilePhoneEncrypt(String mobilePhoneEncrypt) {
        this.mobilePhoneEncrypt = mobilePhoneEncrypt;
    }

    public String getAddressEncrypt() {
        return addressEncrypt;
    }

    public void setAddressEncrypt(String addressEncrypt) {
        this.addressEncrypt = addressEncrypt;
    }

    public String getIdCardEncrypt() {
        return idCardEncrypt;
    }

    public void setIdCardEncrypt(String idCardEncrypt) {
        this.idCardEncrypt = idCardEncrypt;
    }

    public String getFullNameHash() {
        return fullNameHash;
    }

    public void setFullNameHash(String fullNameHash) {
        this.fullNameHash = fullNameHash;
    }

    public String getMobilePhoneHash() {
        return mobilePhoneHash;
    }

    public void setMobilePhoneHash(String mobilePhoneHash) {
        this.mobilePhoneHash = mobilePhoneHash;
    }

    public String getAddressHash() {
        return addressHash;
    }

    public void setAddressHash(String addressHash) {
        this.addressHash = addressHash;
    }

    public String getIdCardHash() {
        return idCardHash;
    }

    public void setIdCardHash(String idCardHash) {
        this.idCardHash = idCardHash;
    }

    public BigDecimal getInvoiceSum() {
        return invoiceSum;
    }

    public void setInvoiceSum(BigDecimal invoiceSum) {
        this.invoiceSum = invoiceSum;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public Integer getInvoiceContentId() {
        return invoiceContentId;
    }

    public void setInvoiceContentId(Integer invoiceContentId) {
        this.invoiceContentId = invoiceContentId;
    }

    public String getInvoiceInfo() {
        return invoiceInfo;
    }

    public void setInvoiceInfo(String invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
