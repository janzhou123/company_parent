package com.company.gate.filter;

import com.baomidou.mybatisplus.toolkit.IdWorker;
import com.company.gate.constants.ZuulConstants;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * requestNo生成过滤器
 *
 * @author fengshuonan
 * @date 2017-11-08-下午2:49
 */
public class RequestNoGenerateFilter extends ZuulFilter {

  private static Logger log = LoggerFactory.getLogger(RequestNoGenerateFilter.class);

  @Override
  public String filterType() {
    return FilterConstants.PRE_TYPE;
  }

  @Override
  public int filterOrder() {
    return ZuulConstants.REQUEST_NO_GENERATE_FILTER_ORDER;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() {
    RequestContext currentContext = RequestContext.getCurrentContext();
    HttpServletResponse response = currentContext.getResponse();

    String requestNo = IdWorker.getIdStr();

    currentContext.addZuulRequestHeader("Request-No", requestNo);
    log.info("set Request-No:" + requestNo);

    response.addHeader("Request-No", requestNo);

    return null;
  }
}
