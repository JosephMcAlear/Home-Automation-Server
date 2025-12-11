package com.joseph.homeautomation.server.domain.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/plugin/http")
public class PluginControllerHTTP {

    private static final Logger logger = LoggerFactory.getLogger(PluginControllerHTTP.class);

    @GetMapping("/register")
    public void register(@RequestBody String body)
    {
        logger.info("Register Plugin through HTTP : {}", body);
    }

}
