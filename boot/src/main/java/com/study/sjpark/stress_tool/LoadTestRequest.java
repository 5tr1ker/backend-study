package com.study.sjpark.stress_tool;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoadTestRequest {
    private String url;
    private int durationSeconds; // N초
    private int concurrency;     // D
}