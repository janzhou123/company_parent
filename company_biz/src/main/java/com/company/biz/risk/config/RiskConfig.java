package com.company.biz.risk.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 风控配置文件
 * Created by Administrator on 2018/8/30.
 */
@Component
public class RiskConfig {

  @Value("${risk.url}")
  String url;

  public String getUrl() {
    return url;
  }
}
