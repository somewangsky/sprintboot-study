package com.zxelec.cache.controller;

import com.zxelec.cache.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.zxelec.cache.entity.Department;

/**
 * DepartmentController
 *
 * @author vimicro
 * @date 2020/10/16
 */
@RestController
@RequestMapping("/dep")
public class DepartmentController {

    @Autowired
    private RedisTemplate departmentRedisTemplate;

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/find")
    public Department findDepById(@RequestParam(value = "id") int id) {
        return departmentService.findDepById(id);
    }

    @GetMapping("/update")
    public Department updateDep(Department department) {
        return departmentService.updateDep(department);
    }

    @GetMapping("/delete")
    public void deleteDep(int id) {
        departmentService.deleteDep(id);
    }
}
