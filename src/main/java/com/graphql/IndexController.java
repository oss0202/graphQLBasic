package com.graphql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/test")
    public String testMethod(){
        return "test";
    }

}
