package com.study.sjpark.module_manager;

import com.study.e_mongodb.MongoDBConnection;
import com.study.f_oracledb.OracleDBConnection;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ModuleManagerController {

    private final MongoDBConnection mongoDBConnection;
    private final OracleDBConnection oracleDBConnection;

    @GetMapping("/mongodb")
    public String mongodbConnectionTest() {
        mongoDBConnection.connectionTest();

        return "SUCCESS";
    }

    @GetMapping("/oracledb")
    public String oracledbConnectionTest() {
        return oracleDBConnection.a();
    }

}
