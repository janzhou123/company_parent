# 本工程旨在做遗留系统微服务改造
######company_gate <br>
系统服务网关项目
######company_biz<br>
业务服务项目
######company_common<br>
系统公共模块


### 简单提要
本项目仅仅只使用zuul和fegin，2个Spring Cloud组件。<br>
zuul只做授权，验签。<br>
feign只做遗留系统接口的封装。<br>
设想中这一套的配置是LB-->conpany_gate-->nginx--->company_biz。<br>
一般1个gate实例带2个biz实例。



