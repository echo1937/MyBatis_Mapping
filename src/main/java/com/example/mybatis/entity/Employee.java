package com.example.mybatis.entity;

import lombok.*;

@Data
@ToString(exclude = "dept")
@EqualsAndHashCode(exclude = "dept")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private String gender;

    private Department dept;

}
