package com.stealthydev.sample.springbootmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @RequestMapping(value = "/")
    @ResponseBody
    public String ping() {
        return "App is up!";
    }
}