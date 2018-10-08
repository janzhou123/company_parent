package com.company.gate.constants;


public interface ZuulConstants {

    /**
     * 请求号生成器过滤器顺序
     */
    int REQUEST_NO_GENERATE_FILTER_ORDER = -10;

    /**
     * jwt token验证的过滤器顺序
     */
    int JWT_TOKEN_FILTER_ORDER = 20;

    /**
     * 签名校验的过滤器顺序
     */
    int SIGN_VALIDATE_FILTER = 30;

    /**
     * 路径资源校验的顺序
     */
    int PATH_MATCH_FILTER = 40;

}
