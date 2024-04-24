use w3schools;

# create table : 새 테이블 만들기
# 테이블 생성시 컬럼들 정의 해야함

# create table 테이블명(
#  #컬럼명 컬럼타입
#
#
# );


# 테이블명, 컬럼명 :( upper/lower) 스네이크 케이스
# UPPER_SNAKE_CASE
# lower_snake_case

create table my_table1
(
    address varchar(30),
    city    varchar(50),
    country varchar(20)
);

insert into my_table1(address, city, country)
VALUES ('신촌', '서울', '한국');

select *
from my_table1;

desc my_table1;

create table my_table2
(
    name varchar(30),
    age  varchar(30)
);

desc my_table2;

insert into my_table2 value ('손흥민', 25);

select *
from my_table2;
