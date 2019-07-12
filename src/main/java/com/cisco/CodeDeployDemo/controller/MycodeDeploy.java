package com.cisco.CodeDeployDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class MycodeDeploy {
    @GetMapping("/getAuth")
    public String getAuth()
    {
        return  "My CodeDeploy Demo";
    }
}
