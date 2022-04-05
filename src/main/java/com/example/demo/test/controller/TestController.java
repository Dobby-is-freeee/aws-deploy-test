package com.example.demo.test.controller;

import com.example.demo.test.dto.TestDto;
import com.example.demo.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<TestDto> getUser() {
        return testService.getUserList();
    }
}
