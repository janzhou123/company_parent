package com.company.biz.risk.constants;

/**
 * Created by Administrator on 2018/8/29.
 * 风控所需数据类型
 */
public class RiskDataTypeEnum {
//  异步接口
  public static final String APPLY = "APPLY";//自由规则 异步接口
  public static final String REGISTER = "REGISTER";//注册 异步接口
  public static final String LOGIN = "LOGIN";//登录 异步接口
  public static final String ZHIMA = "ZHIMA";//芝麻 异步接口
  public static final String WITHDRAWALS = "WITHDRAWALS";//提现 异步接口
  public static final String PUBLIC_AUTH = "PUBLIC_AUTH";//公安认证 异步接口  /face_auth/v1/add

//  同步接口
  public static final String ACESSACCEPT = "acessAccept";//appChannelSendToRisk 前端调用 透传 同步接口
  public static final String CARRIER = "CARRIER";//运营商 前端调用 透传 同步接口
  public static final String DEVICEID = "riskapigetDeviceId";// 设备ID 前端调用 透传 同步接口
  public static final String FOURELEMENT = "FOURELEMENT";// 四要素验证 同步接口  /SyncParamAccept/v1/post

}
