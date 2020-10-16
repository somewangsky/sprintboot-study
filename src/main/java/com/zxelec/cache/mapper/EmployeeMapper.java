package com.zxelec.cache.mapper;

import com.zxelec.cache.entity.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @author vimicro
 */
@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    Employee findEmpById(int id);

    @Update("UPDATE employee SET lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} WHERE id=#{id}")
    void updateEmp(Employee employee);

    @Delete("DELETE FROM employee WHERE id=#{id}")
    Employee deleteEmpById(Integer id);

    @Insert("INSERT INTO employee(lastName,email,gender,d_id) VALUES(#{lastName},#{email},#{gender},#{dId})")
    Employee insertEmployee(Employee employee);

    @Select("SELECT * FROM employee WHERE lastName = #{lastName}")
    Employee getEmpByLastName(String lastName);
}
