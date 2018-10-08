package com.company.biz.risk.Interface;

import feign.HeaderMap;
import feign.RequestLine;
import java.util.Map;

/**
 * Created by Administrator on 2018/9/3.
 *
 * 所有第三方（包含内部应用）提供的API都使用client的方式进行包装，对外提供serice
 * 必需定义Dto，必需做参数校验
 */
//@Headers({"Content-Type: application/json;utf-8", "Accept: application/json", "Type: APPLY",
//    "token: ''"})
//@FeignClient(name = "${risk.name}", url = "${risk.url}")    使用FeignClient 没有找到办法动态设置header
public interface RiskClient {

  @RequestLine("POST /paramAccept/v1/post")
  public String sendInfo2Risk(@HeaderMap Map<String, Object> headerMap, String body);
//  @RequestMapping(value = "/paramAccept/v1/post", method = RequestMethod.POST)
//   public String sendInfo2Risk(String body);


}
