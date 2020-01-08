package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
//@ResponseBody
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/hello")
    public String say() {
        return "Rusen's first SpringBoot App!" + limitConfig.getDescription();
        //
    }
}
