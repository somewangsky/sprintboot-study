package com.zxelec.cache.controller;

import com.zxelec.cache.entity.Employee;
import com.zxelec.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * EmployeeController
 *
 * @author vimicro
 * @date 2020/10/16
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/find")
    public Employee findById(@RequestParam(value = "id") int id) {
        return employeeService.findEmpById(id);
    }

    @GetMapping("/update")
    public Employee updateById(Employee employee) {
        return employeeService.updateEmp(employee);
    }

    @GetMapping("/delete")
    public void delete(int id) {
        employeeService.deleteEmp(id);
    }

    @GetMapping("/emp/lastname/{lastName}")
    public Employee getEmpByLastName(@PathVariable("lastName") String lastName){
        return employeeService.getEmpByLastName(lastName);
    }
}
