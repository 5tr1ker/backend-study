package com.study.webflux.a_eventloop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

@Configuration
public class CustomScheduler {

    @Bean
    public Scheduler blockingScheduler() {
        return Schedulers.newBoundedElastic(
                50,                 // 최대 스레드 수
                1000,               // 대기 큐 사이즈
                "blocking-pool"     // 스레드 이름 prefix
        );
    }

}
