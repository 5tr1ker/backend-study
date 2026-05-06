package com.study.sjpark.stress_tool;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

@RequiredArgsConstructor
@RestController
@RequestMapping("/load")
public class LoadTestController {

    private final RestTemplate restTemplate;

    @PostMapping("/stress")
    public Map<String, Object> stressTest(@RequestBody LoadTestRequest request) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(request.getConcurrency());

        AtomicLong totalCount = new AtomicLong();
        AtomicLong successCount = new AtomicLong();
        AtomicLong failCount = new AtomicLong();
        AtomicLong totalLatency = new AtomicLong();

        long endTime = System.currentTimeMillis() + (request.getDurationSeconds() * 1000L);

        CountDownLatch latch = new CountDownLatch(request.getConcurrency());

        for (int i = 0; i < request.getConcurrency(); i++) {
            executor.submit(() -> {
                try {
                    while (System.currentTimeMillis() < endTime) {

                        long start = System.currentTimeMillis();

                        try {
                            restTemplate.getForObject(request.getUrl(), String.class);

                            long latency = System.currentTimeMillis() - start;

                            successCount.incrementAndGet();
                            totalLatency.addAndGet(latency);

                        } catch (Exception e) {
                            failCount.incrementAndGet();
                        }

                        totalCount.incrementAndGet();
                    }
                } finally {
                    latch.countDown();
                }
            });
        }

        latch.await();
        executor.shutdown();

        long total = totalCount.get();
        long success = successCount.get();
        long fail = failCount.get();

        double successRate = total == 0 ? 0 : (success * 100.0 / total);
        double failRate = total == 0 ? 0 : (fail * 100.0 / total);

        double avgLatency = success == 0 ? 0 : (totalLatency.get() * 1.0 / success); // MTT
        double tps = total / (double) request.getDurationSeconds();

        Map<String, Object> result = new HashMap<>();
        result.put("totalRequests", total);
        result.put("success", success);
        result.put("fail", fail);
        result.put("successRate(%)", successRate);
        result.put("failRate(%)", failRate);
        result.put("avgLatency(ms)", avgLatency);
        result.put("TPS", tps);

        return result;
    }
}