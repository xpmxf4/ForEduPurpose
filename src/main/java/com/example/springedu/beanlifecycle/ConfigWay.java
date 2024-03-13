package com.example.springedu.beanlifecycle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConfigWay {

    public void initialize() throws Exception {
        log.info("=============================================" + "ConfigWay.initialize() called");
    }

    public void close() throws Exception {
        log.info("=============================================" + "ConfigWay.close() called");
    }
}
