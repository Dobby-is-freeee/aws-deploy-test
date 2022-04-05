package com.example.demo.test.mapper;

import com.example.demo.test.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<TestDto> getUserList();
}