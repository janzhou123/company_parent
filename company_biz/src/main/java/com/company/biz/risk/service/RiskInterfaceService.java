package com.company.biz.risk.service;

import com.company.biz.risk.Interface.RiskClient;
import com.company.biz.risk.config.RiskConfig;
import com.company.biz.risk.constants.RiskDataTypeEnum;
import com.company.biz.risk.model.RiskApplyDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Feign;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/8/29.
 */
@Service
public class RiskInterfaceService {
  @Autowired
  RiskConfig riskConfig;

  /**
   * 提现接口调用
   * @param inArg
   * @return
   */
  public String sendApplyInfo2Risk(RiskApplyDto inArg) throws Exception {
    //需要做必要的参数校验
    //==========================================
    String retStr = "";
    //初始化Feign客户端
    RiskClient riskClient = Feign.builder()
//        .encoder(new JacksonEncoder())
//        .decoder(new JacksonDecoder())  //不要这个解码器 就正常返回了，对方接口不是body返回的
        .target(RiskClient.class, riskConfig.getUrl());

    //设置请求头
    Map<String, Object> headerMap = new HashMap<>();
    headerMap.put("Content-type","application/json;" + "utf-8");
    headerMap.put("Type", RiskDataTypeEnum.APPLY);
    headerMap.put("token", "");

    //将入参对象转换到JSON串
    ObjectMapper mapper = new ObjectMapper();
    String sendStr = mapper.writeValueAsString(inArg);
    //发送请求
    retStr =  riskClient.sendInfo2Risk(headerMap,sendStr);
    return retStr;
  }

//  public String sendApplyInfo2Risk(RiskApplyDto inArg) throws Exception {
//    //需要做必要的参数校验
//    //==========================================
//    String retStr = "";
//    //初始化Feign客户端
//    RiskInterface riskClient = Feign.builder()
//        .encoder(new JacksonEncoder())
////        .decoder(new JacksonDecoder())  //不要这个解码器 就正常返回了，对方接口不是body返回的
//        .target(RiskInterface.class, riskConfig.getUrl());
//
//    //设置请求头
//    Map<String, Object> headerMap = new HashMap<>();
//    headerMap.put("Content-type","application/json;" + "utf-8");
//    headerMap.put("Type", RiskDataTypeEnum.APPLY);
//    headerMap.put("token", "");
//    //将入参对象转换到JSON串
//    ObjectMapper mapper = new ObjectMapper();
//    String sendStr = mapper.writeValueAsString(inArg);
//    //发送请求
//    retStr =  riskClient.sendInfo2Risk(headerMap,sendStr);
//    return retStr;
//  }

}
