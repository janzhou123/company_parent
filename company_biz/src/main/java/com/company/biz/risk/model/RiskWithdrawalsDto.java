package com.company.biz.risk.model;

//import javax.validation.constraints.NotEmpty;

/**
 * Created by Administrator on 2018/8/30.
 * 提现入参对象
 */
public class RiskWithdrawalsDto {
  private String deviceType;
  private String blackBox;
  private String productCode;
  private String bankCard;
  private String withdrawperiods;
  private String name;
  private String mobile;
  private String userIp;
  private String withdrawAcount;
  private String mSubmitTime;
  private String userId;
  private String serialNo;

  @Override
  public String toString() {
    return "RiskWithdrawalsDto{" +
        "deviceType='" + deviceType + '\'' +
        ", blackBox='" + blackBox + '\'' +
        ", productCode='" + productCode + '\'' +
        ", bankCard='" + bankCard + '\'' +
        ", withdrawperiods='" + withdrawperiods + '\'' +
        ", name='" + name + '\'' +
        ", mobile='" + mobile + '\'' +
        ", userIp='" + userIp + '\'' +
        ", withdrawAcount='" + withdrawAcount + '\'' +
        ", mSubmitTime='" + mSubmitTime + '\'' +
        ", userId='" + userId + '\'' +
        ", serialNo='" + serialNo + '\'' +
        '}';
  }

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public String getBlackBox() {
    return blackBox;
  }

  public void setBlackBox(String blackBox) {
    this.blackBox = blackBox;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getBankCard() {
    return bankCard;
  }

  public void setBankCard(String bankCard) {
    this.bankCard = bankCard;
  }

  public String getWithdrawperiods() {
    return withdrawperiods;
  }

  public void setWithdrawperiods(String withdrawperiods) {
    this.withdrawperiods = withdrawperiods;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getUserIp() {
    return userIp;
  }

  public void setUserIp(String userIp) {
    this.userIp = userIp;
  }

  public String getWithdrawAcount() {
    return withdrawAcount;
  }

  public void setWithdrawAcount(String withdrawAcount) {
    this.withdrawAcount = withdrawAcount;
  }

  public String getmSubmitTime() {
    return mSubmitTime;
  }

  public void setmSubmitTime(String mSubmitTime) {
    this.mSubmitTime = mSubmitTime;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getSerialNo() {
    return serialNo;
  }

  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
  }
}
