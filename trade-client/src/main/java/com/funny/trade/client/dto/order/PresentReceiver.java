package com.funny.trade.client.dto.order;

import java.io.Serializable;

/**
 * Created by huanghua on 2016/5/19.
 * 赠品收件人信息
 *
 */
public class PresentReceiver implements Serializable{
    /**
     * 收件人姓名
     */
    private String receiverName;

    private String receiverPhone;//收件人手机

    private String reveiverProvinceId;//省份id

    private String receiverCityId;//城市id

    private String receiverCountryId;//区县id

    private String receiverAreaId;//乡镇街道id

    private String receiverAddress;//收货地址

    private String idCard;//身份证号

    public PresentReceiver() {
    }

    public PresentReceiver(String consName, String consPhone, String hidConsProvinceId,
                           String hidConsCityId, String consAddress, String iDCard,
                           String receiverCountryId, String receiverAreaId) {
        this.receiverName = consName;
        this.receiverPhone = (consPhone!=null?consPhone.replaceAll(" ",""):consPhone);
        this.reveiverProvinceId = hidConsProvinceId;
        this.receiverCityId = hidConsCityId;
        this.receiverAddress = consAddress;
        this.idCard = iDCard;
        this.receiverCountryId = receiverCountryId;
        this.receiverAreaId = receiverAreaId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReveiverProvinceId() {
        return reveiverProvinceId;
    }

    public void setReveiverProvinceId(String reveiverProvinceId) {
        this.reveiverProvinceId = reveiverProvinceId;
    }

    public String getReceiverCityId() {
        return receiverCityId;
    }

    public void setReceiverCityId(String receiverCityId) {
        this.receiverCityId = receiverCityId;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getReceiverCountryId() {
        return receiverCountryId;
    }

    public void setReceiverCountryId(String receiverCountryId) {
        this.receiverCountryId = receiverCountryId;
    }

    public String getReceiverAreaId() {
        return receiverAreaId;
    }

    public void setReceiverAreaId(String receiverAreaId) {
        this.receiverAreaId = receiverAreaId;
    }
}
