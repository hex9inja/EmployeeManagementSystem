package com.org.employee.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/v1")
public class HelloController {

    @GetMapping("/hello")
    @ApiOperation(value = "Hello", response = String.class, produces = MediaType.APPLICATION_JSON_VALUE, tags = {
            "Hello API" })
    public String hello() {
        return "Server is working !";
    }
}