package com.study.webflux.a_eventloop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

@RestController
@RequestMapping(("/blocking"))
public class EventLoopController {

    private @Autowired Scheduler blockingScheduler;

    @GetMapping("/event-loop")
    public Mono<String> bad() {
        return Mono.fromSupplier(() -> {
            try {
                Thread.sleep(1500); // 이벤트 루프에서 블로킹 발생
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "done";
        });
    }

    @GetMapping("/worker")
    public Mono<String> good() {
        return Mono.fromCallable(() -> {
            try {
                Thread.sleep(1500); // 워커 쓰레드에서 블로킹 발생
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "done";
        }).subscribeOn(Schedulers.boundedElastic());
    }

}
