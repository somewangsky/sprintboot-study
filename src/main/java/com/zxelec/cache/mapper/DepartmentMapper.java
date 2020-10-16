package com.zxelec.cache.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.zxelec.cache.entity.Department;
import org.apache.ibatis.annotations.Update;

/**
 * DepartmentMapper
 *
 * @author vimicro
 * @date 2020/10/16
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    Department findDepById(int id);

    @Update("update department set departmentName= #{departmentName} where id = #{id}")
    void updateDep(Department department);

    @Delete("delete from department where id = #{id}")
    void deleteDep(int id);
}
