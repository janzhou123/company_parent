package com.company.biz.risk.model;

/**
 * Created by Administrator on 2018/8/31.
 * 自由规则入参类
 */
public class RiskApplyDto {
  private String serialNo;
  private String userId;
  private String name;
  private String mobile;
  private String userIp;

  private String blackBox;
  private String deviceType;
  private String bankCard;
  private String idCard;
  private String address;

  private String applyAcount;
  private String productCode;
  private String education;
  private String compayName;
  private String relativeType;

  private String relativeName;
  private String relativeMobile;
  private String mSubmitTime;

  @Override
  public String toString() {
    return "RiskApplyDto{" +
        "serialNo='" + serialNo + '\'' +
        ", userId='" + userId + '\'' +
        ", name='" + name + '\'' +
        ", mobile='" + mobile + '\'' +
        ", userIp='" + userIp + '\'' +
        ", blackBox='" + blackBox + '\'' +
        ", deviceType='" + deviceType + '\'' +
        ", bankCard='" + bankCard + '\'' +
        ", idCard='" + idCard + '\'' +
        ", address='" + address + '\'' +
        ", applyAcount='" + applyAcount + '\'' +
        ", productCode='" + productCode + '\'' +
        ", education='" + education + '\'' +
        ", compayName='" + compayName + '\'' +
        ", relativeType='" + relativeType + '\'' +
        ", relativeName='" + relativeName + '\'' +
        ", relativeMobile='" + relativeMobile + '\'' +
        ", mSubmitTime='" + mSubmitTime + '\'' +
        '}';
  }

  public String getSerialNo() {
    return serialNo;
  }

  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
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

  public String getBlackBox() {
    return blackBox;
  }

  public void setBlackBox(String blackBox) {
    this.blackBox = blackBox;
  }

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public String getBankCard() {
    return bankCard;
  }

  public void setBankCard(String bankCard) {
    this.bankCard = bankCard;
  }

  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getApplyAcount() {
    return applyAcount;
  }

  public void setApplyAcount(String applyAcount) {
    this.applyAcount = applyAcount;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getEducation() {
    return education;
  }

  public void setEducation(String education) {
    this.education = education;
  }

  public String getCompayName() {
    return compayName;
  }

  public void setCompayName(String compayName) {
    this.compayName = compayName;
  }

  public String getRelativeType() {
    return relativeType;
  }

  public void setRelativeType(String relativeType) {
    this.relativeType = relativeType;
  }

  public String getRelativeName() {
    return relativeName;
  }

  public void setRelativeName(String relativeName) {
    this.relativeName = relativeName;
  }

  public String getRelativeMobile() {
    return relativeMobile;
  }

  public void setRelativeMobile(String relativeMobile) {
    this.relativeMobile = relativeMobile;
  }

  public String getmSubmitTime() {
    return mSubmitTime;
  }

  public void setmSubmitTime(String mSubmitTime) {
    this.mSubmitTime = mSubmitTime;
  }
}
