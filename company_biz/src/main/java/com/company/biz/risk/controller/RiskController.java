package com.company.biz.risk.controller;



import com.company.biz.risk.model.RiskApplyDto;
import com.company.biz.risk.service.RiskInterfaceService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/8/31.
 */
@RestController
@RequestMapping("/risk/v1")
public class RiskController {
  private static Logger log = LoggerFactory.getLogger(RiskController.class);
  @Autowired
  private RiskInterfaceService riskInterfaceService;

  @GetMapping("/apply")
  public String sendApplyInfo2Risk(HttpServletRequest request, HttpServletResponse response) {

    log.info("Request-No:"+request.getHeader("Request-No").toString());
    RiskApplyDto inArg = new RiskApplyDto();

    inArg.setSerialNo("12458768547");
    inArg.setUserId("3254124124632");
    inArg.setName("test");
    inArg.setMobile("13077362630");
    inArg.setUserIp("106.18.228.32");
    inArg.setBlackBox(
        "eyJvcyI6ImFuZHJvaWQiLCJ2ZXJzaW9uIjoiMy4xLjIiLCJwYWNrYWdlcyI6ImNvbS5tYW5nb2pyLm1hbmdvaHVhKiYxLjAuMCIsInByb2ZpbGVfdGltZSI6NDMxLCJpbnRlcnZhbF90aW1lIjo2MzA0LCJ0b2tlbl9pZCI6IkUwRHIxQzA4OUpWV05INFdZUUlZSTRHc3liOHljeW9kektaYzdSUHAwT1hOa0IwNGdobGRrbG9lZmZFbU95OGF6ZVZNM1YzUVQ3TmFyenhNejlBV2h3PT0ifQ==");
    inArg.setDeviceType("AND");
    inArg.setBankCard("6229000100010002004");
    inArg.setIdCard("43010619940516326");
    inArg.setAddress("湖南省长沙市岳麓区");
    inArg.setApplyAcount("5000");
    inArg.setProductCode("xjd001");
    inArg.setEducation("本科");
    inArg.setCompayName("湖南缺钱花有限公司");
    inArg.setRelativeType("父子");
    inArg.setRelativeName("杨百万");
    inArg.setRelativeMobile("13565841254");
    inArg.setmSubmitTime("2018-04-21 15:23:25");

    try {
      String retStr = riskInterfaceService
          .sendApplyInfo2Risk(inArg);
      log.info("成功了");
      log.info(retStr);
      return retStr;
    } catch (Exception e) {
      log.info("出错了");
      log.info( e.toString() + e.getMessage());
      throw new RuntimeException(e.getMessage());
    }
  }


}
