package com.funny.trade.domain.user.entity;

import com.funny.combo.core.base.BaseEntity;

public class UserInvoiceEntity extends BaseEntity {
    private static final long serialVersionUID = 1614480738924L;

    /**
    * 
    */
    private String userId;

    /**
    * 发票抬头(个人名称/企业名称)
    */
    private String invoiceTitle;

    /**
    * 发票抬头类型 1用户 2企业
    */
    private Integer invoiceTitleType;

    /**
    * 发票类型 1电子普通发票 2增值税专用发票
    */
    private Integer invoiceType;

    /**
    * 纳税人识别码
    */
    private String taxPayerCode;

    /**
    * 注册地址
    */
    private String registerAddress;

    /**
    * 注册电话
    */
    private String registerMobile;

    /**
    * 银行账号
    */
    private String bankAccount;

    /**
    * 开户银行
    */
    private String bankName;

    /**
    * 收票人手机
    */
    private String receiveEmail;

    /**
    * 收票人邮箱
    */
    private String receiveMobile;

    /**
    * 发票内容
    */
    private String invoiceContent;

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitleType(Integer invoiceTitleType) {
        this.invoiceTitleType = invoiceTitleType;
    }

    public Integer getInvoiceTitleType() {
        return invoiceTitleType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setTaxPayerCode(String taxPayerCode) {
        this.taxPayerCode = taxPayerCode == null ? null : taxPayerCode.trim();
    }

    public String getTaxPayerCode() {
        return taxPayerCode;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress == null ? null : registerAddress.trim();
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterMobile(String registerMobile) {
        this.registerMobile = registerMobile == null ? null : registerMobile.trim();
    }

    public String getRegisterMobile() {
        return registerMobile;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setReceiveEmail(String receiveEmail) {
        this.receiveEmail = receiveEmail == null ? null : receiveEmail.trim();
    }

    public String getReceiveEmail() {
        return receiveEmail;
    }

    public void setReceiveMobile(String receiveMobile) {
        this.receiveMobile = receiveMobile == null ? null : receiveMobile.trim();
    }

    public String getReceiveMobile() {
        return receiveMobile;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent == null ? null : invoiceContent.trim();
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }
}