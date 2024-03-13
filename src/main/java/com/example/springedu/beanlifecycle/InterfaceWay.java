package com.example.springedu.beanlifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class InterfaceWay implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        log.info("=============================================" + "InterfaceWay.destroy() called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("=============================================" + "InterfaceWay.afterPropertiesSet() called");
    }
}
