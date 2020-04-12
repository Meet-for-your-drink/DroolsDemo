package com.duang.droolsdemo;

import com.duang.droolsdemo.entity.Customer;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.sql.Timestamp;

@SpringBootTest
class DroolsdemoApplicationTests {
    @Resource
    private KieSession kieSession;

    @Test
    void contextLoads() {

    }

    @Test
    public void testDrools(){
        Customer customer = new Customer();
        customer.setName("Alice");
        customer.setAge(20);
        customer.setTime(new Timestamp(System.currentTimeMillis()));
        kieSession.insert(customer);
        kieSession.fireAllRules();
    }

}
