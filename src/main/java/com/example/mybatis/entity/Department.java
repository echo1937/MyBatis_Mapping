package com.example.mybatis.entity;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@ToString(exclude = "emps")
@EqualsAndHashCode(exclude = "emps")
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    private Integer id;
    private String departmentName;
    private Set<Employee> emps = new HashSet<>();

}
