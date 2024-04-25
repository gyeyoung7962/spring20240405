use w3schools;

# 사용할 데이터베이스 선택하기

show tables;
show databases;

create database mydb1;
use mydb1;
show tables;

create table my_table1
(
    name varchar(3),
    age  int
);

create database mydb2;
use mydb2;

create table my_table2
(
    name    varchar(10),
    age     int,
    country varchar(10)
);

drop database mydb2;
drop database mydb1;



