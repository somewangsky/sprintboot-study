package com.zxelec.cache.service;

import com.zxelec.cache.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.zxelec.cache.entity.Department;

/**
 * DepartmentService
 *
 * @author vimicro
 * @date 2020/10/16
 */
@CacheConfig(cacheNames = "dep", cacheManager = "departmentCacheManager")
@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Cacheable(value = "dep", key = "#id",unless = "#result==null")
    public Department findDepById(int id) {
        System.out.println("find department by id:" + id);
        return departmentMapper.findDepById(id);
    }

    @CachePut(value = "dep", key = "#result.id")
    public Department updateDep(Department department) {
        System.out.println("update department by id:" + department.getId());
        departmentMapper.updateDep(department);
        return department;
    }

    @CacheEvict(value = "dep",key = "#id")
    public void deleteDep(int id){
        System.out.println("delete department by id:"+id);
        //departmentMapper.deleteDep(id);
    }

}
