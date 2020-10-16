package com.zxelec.cache.mapper;

import com.zxelec.cache.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void findEmpById() {
        Employee employee = employeeMapper.findEmpById(1);
        System.out.println(employee);
    }
}