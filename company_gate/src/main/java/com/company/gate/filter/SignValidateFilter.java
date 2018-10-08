//package com.company.gate.filter;
//
//import static org.bouncycastle.asn1.x500.style.RFC4519Style.cn;
//
//import cn.hutool.core.io.IoUtil;
//import com.company.gate.constants.ZuulConstants;
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import java.io.IOException;
//import java.nio.charset.Charset;
//import javax.servlet.ServletInputStream;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// * 权限校验的过滤器
// *
// * @author fengshuonan
// * @date 2017-11-08-下午2:49
// */
//public class SignValidateFilter extends ZuulFilter {
//
//    @Autowired
//    private SignService signService;
//
//    @Override
//    public String filterType() {
//        return "pre";
//    }
//
//    @Override
//    public int filterOrder() {
//        return ZuulConstants.SIGN_VALIDATE_FILTER;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() {
//        RequestContext currentContext = RequestContext.getCurrentContext();
//        HttpServletRequest request = currentContext.getRequest();
//        HttpServletResponse response = currentContext.getResponse();
//
//        ServletInputStream inputStream = null;
//        try {
//            inputStream = request.getInputStream();
//        } catch (IOException e) {
//            LogUtil.error("签名校验时候，流读取异常！", e);
//            throw new ServiceException(CoreExceptionEnum.IO_ERROR);
//        }
//
//        String requestBody = IoUtil.read(inputStream, Charset.forName("utf-8"));
//
//        //requestBody为空则不校验签名
//        if (ToolUtil.isEmpty(requestBody)) {
//            return null;
//        }
//
//        String appId = request.getParameter("appId");
//        String timestamp = request.getParameter("timestamp");
//        String tokenRequest = request.getParameter("token");
//
//        //签名参数不全则返回
//        if (ToolUtil.isOneEmpty(appId, timestamp, tokenRequest)) {
//            throw new ServiceException(SignExceptionEnum.SIGN_ERROR_WITH_EMPTY_DATA);
//        }
//
//        boolean signValidateResult = signService.validateSign(appId, timestamp, tokenRequest, requestBody);
//
//        //验证签名是否正确
//        if (signValidateResult) {
//            return null;
//        } else {
//            throw new ServiceException(SignExceptionEnum.SIGN_ERROR);
//        }
//    }
//
//}
