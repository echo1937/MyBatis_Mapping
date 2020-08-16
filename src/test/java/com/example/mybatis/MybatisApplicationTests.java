package com.example.mybatis;

import com.example.mybatis.dao.DepartmentMapper;
import com.example.mybatis.dao.EmployeeMapper;
import com.example.mybatis.entity.Department;
import com.example.mybatis.entity.Employee;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
@Sql(value = "classpath:prepare.sql")
class MybatisApplicationTests {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    void contextLoads() {
    }

    @Test
    public void test01() {
        try (SqlSession openSession = sqlSessionFactory.openSession()) {
            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
            Employee employee = mapper.getEmpById(1);
            System.out.println(employee);
        }
    }

    @Test
    public void test02() {
        try (SqlSession openSession = sqlSessionFactory.openSession()) {
            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
            Employee employee = mapper.getEmpAndDept(1);
            System.out.println(employee);
            System.out.println(employee.getDept());
        }
    }

    @Test
    public void test03() {
        try (SqlSession openSession = sqlSessionFactory.openSession()) {
            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
            Employee employee = mapper.getEmpAndDeptByAssociation(1);
            System.out.println(employee);
            System.out.println(employee.getDept());
        }
    }

    @Test
    public void test04() {
        try (SqlSession openSession = sqlSessionFactory.openSession()) {
            EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
            Employee employee = mapper.getEmpByIdStep(1);
            System.out.println(employee);
            System.out.println(employee.getDept());
        }
    }

    @Test
    public void test05() {
        try (SqlSession openSession = sqlSessionFactory.openSession()) {
            DepartmentMapper mapper = openSession.getMapper(DepartmentMapper.class);
            Department department = mapper.getDeptByIdPlus(1);
            System.out.println(department);
            System.out.println(department.getEmps());
        }
    }

    @Test
    public void test06() {
        try (SqlSession openSession = sqlSessionFactory.openSession()) {
            DepartmentMapper mapper = openSession.getMapper(DepartmentMapper.class);
            Department department = mapper.getDeptByIdStep(1);
            System.out.println(department);
            System.out.println(department.getEmps());
        }
    }
}
