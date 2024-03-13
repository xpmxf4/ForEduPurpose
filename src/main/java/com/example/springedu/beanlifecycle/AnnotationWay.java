package com.example.springedu.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AnnotationWay {

    @PostConstruct
    public void initialize() throws Exception {
        log.info("============================================="+"AnnotationWay.initialize() called");
    }

    @PreDestroy
    public void close() throws Exception {
        log.info("============================================="+"AnnotationWay.close() called");
    }
}
