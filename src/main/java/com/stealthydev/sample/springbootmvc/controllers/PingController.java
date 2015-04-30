package com.stealthydev.sample.springbootmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @RequestMapping(value = "/")
    @ResponseBody
    public String securedPing() {
        return "App is up!";
    }
}
