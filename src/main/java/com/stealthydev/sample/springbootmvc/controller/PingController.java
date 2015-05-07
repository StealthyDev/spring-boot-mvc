package com.stealthydev.sample.springbootmvc.controller;

import com.stealthydev.sample.springbootmvc.Application;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

@RestController
public class PingController {
    @RequestMapping(value = "/")
    @ResponseBody
    public String ping() {
        return MessageFormat.format("Server started at {0}", Application.startTime);
    }
}
