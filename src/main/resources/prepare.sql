drop table if exists tbl_employee;

create table tbl_employee
(
    id        int(11) primary key auto_increment,
    last_name varchar(255),
    gender    char(1),
    email     varchar(255),
    d_id      int(11)

);

drop table if exists tbl_dept;

create table tbl_dept
(
    id        int(11) primary key auto_increment,
    dept_name varchar(255)
);


insert into tbl_employee
values (1, 'tom', '0', 'tom@qq.com', 1),
       (2, 'jerry', '1', 'jerry@qq.com', 1);

insert into tbl_dept
values (1, '市场部')