package com.example.demo.test.service;

import com.example.demo.test.dto.TestDto;
import com.example.demo.test.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestMapper testMapper;

    @Override
    public List<TestDto> getUserList() {
        return testMapper.getUserList();
    }
}
