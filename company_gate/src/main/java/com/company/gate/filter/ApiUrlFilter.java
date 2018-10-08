package com.company.gate.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.netflix.zuul.web.ZuulHandlerMapping;

public class ApiUrlFilter extends ZuulFilter {

  private static Logger log = LoggerFactory.getLogger(ApiUrlFilter.class);
  @Autowired
  ZuulHandlerMapping zuulHandlerMapping;

  @Override
  public String filterType() {
    return FilterConstants.ROUTE_TYPE;
  }

  @Override
  public int filterOrder() {
    return 1;
  }

  @Override
  public boolean shouldFilter() {
//		Map<String, Object> handlerMap = zuulHandlerMapping.getHandlerMap();
    return true;
  }

  @Override
  public Object run() {
    RequestContext ctx = RequestContext.getCurrentContext();
    HttpServletRequest request = ctx.getRequest();
    log.info("send {} request to {}", request.getMethod(), request.getRequestURL().toString());

//blog.csdn.net/tianyaleixiaowu/article/details/77893822?utm_source=copy
//		Map<String, Object> handlerMap = zuulHandlerMapping.getHandlerMap();
//		RequestContext ctx = RequestContext.getCurrentContext();
//		String location = "happicloud-micro";
//		ctx.set(SERVICE_ID_KEY, location);
//		ctx.setRouteHost(null);
//		ctx.addOriginResponseHeader(SERVICE_ID_HEADER, location);
    log.info("AApiUrlFilter触发到URL了==========================");
    return null;
  }

}
