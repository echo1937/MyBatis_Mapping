package com.example.mybatis.dao;


import com.example.mybatis.entity.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {

    Department getDeptById(Integer id);

    Department getDeptByIdPlus(Integer id);

    Department getDeptByIdStep(Integer id);
}
