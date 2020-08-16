package com.example.mybatis.dao;

import com.example.mybatis.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

@Mapper
public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    Employee getEmpAndDept(Integer id);

    Employee getEmpAndDeptByAssociation(Integer id);

    Employee getEmpByIdStep(Integer id);

    Set<Employee> getEmpsByDeptId(Integer deptId);

}
