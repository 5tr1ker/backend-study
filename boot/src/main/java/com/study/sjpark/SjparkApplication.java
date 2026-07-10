package com.study.sjpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(
        scanBasePackages = {
                "com.study.sjpark",
                "com.study.e_mongodb",
                "com.study.f_oracledb"
        }
)
@EnableMongoRepositories(basePackages = "com.study.e_mongodb")
public class SjparkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SjparkApplication.class, args);

	}

}
