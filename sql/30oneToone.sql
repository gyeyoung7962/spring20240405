use mydb1;

# 1대1 관계 테이블 (흔치 않음)
create table employee
(
    id      int primary key auto_increment,
    name    varchar(10),
    address varchar(10)
);

create table employee_salary
(
    employee_id int auto_increment primary key references employee (id),
    salary      int
);