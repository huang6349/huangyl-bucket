package org.hyl.bucket.data.auditing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.AuditorAware;

public class DataAuditorAware implements AuditorAware<String> {

    private final Logger logger = LoggerFactory.getLogger(DataAuditorAware.class);

    @Override
    public String getCurrentAuditor() {
        logger.error("请实现[hylDataAuditorAware]Bean（需要实现[AuditorAware<T>]接口），完成数据审计用户信息获取逻辑");
        throw new NullPointerException();
    }
}
