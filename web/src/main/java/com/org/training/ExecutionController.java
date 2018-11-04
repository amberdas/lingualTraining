package com.org.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Amber on 04-11-2018.
 */

@RestController
public class ExecutionController
{
    @RequestMapping("/")
    public String sayHelloController()
    {
        return "Hello";
    }
}
