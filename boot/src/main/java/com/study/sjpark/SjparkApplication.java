package com.study.sjpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.study.sjpark",
                "com.study.e_mongodb",
                "com.study.f_oracledb"
        }
)
public class SjparkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SjparkApplication.class, args);

	}

}
