# 业务服务项目 company_biz
所有新增业务都写在此项目里面（如果业务项目较大可以考虑做单独项目）<br>
按其业务模块在com.company.biz下面建立对应目录。<br>
遗留系统需要对新业务提供接口，也需要在com.company.biz下面新建目录<br>
将暴露的接口使用figen进行封装，代码放在interface里面<br>
整体目录如下com.company.biz.risk.interface<br>



没有完成的事情：<br>
整合MYBATIS_plus<br>
整合druid<br>
日志功能模块<br>
整合MQ<br>
整合redis<br>
整合xxl-job<br>