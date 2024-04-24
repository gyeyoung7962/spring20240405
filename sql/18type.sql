use w3schools;

#문자열 varchar(길이)
create table my_table3
(
    name  varchar(3),
    title varchar(5),
    notes varchar(1000)
);

desc my_table3;

insert into my_table3(name, title, notes)
VALUES ('이강인', '축구선수', '파리생제르망');

insert into my_table3(name, title, notes)
values ('네이마르', '야구선수', '사우디아라비아');

create table my_table4
(
    title   varchar(10),
    content varchar(500),
    author  varchar(10)
);

desc my_table4;

insert into my_table4(title, content, author)
VALUES ('동물병원', '많은 동물들이 있습니다', '동물 저자');

select *
from my_table4;

#수
#정수 INT
#실수 DECIMAL, dec (길이, 소수점)
create table my_table5
(
    age    int,
    height dec(5, 2) #총 길이 5, 소수점이하 2
);

desc my_table5;

insert into my_table5(age, height)
VALUES (10, 170.25);

select *
from my_table5;

create table my_table6
(
    value int,
    point dec(3, 1)
);

desc my_table6;

insert into my_table6(value, point)
values ('10', '10.1');

select *
from my_table6;

#날짜시간

#Date 날짜 (YYYY-MM-DD)
#DateTime 날짜시간 (YYYY-MM-DD HH:MM:SS)

create table my_table7
(
    col1 date,
    col2 datetime
);

desc my_table7;

insert into my_table7(col1, col2)
values ('2024-01-01', '2024-01-01 09:00:00');

select *
from my_table7;

create table my_table8
(
    day10 date,
    day11 datetime
);

desc my_table8;

insert into my_table8(day10, day11)
values ('2024-01-01', '2024-01-01 11:10:10');

select *
from my_table8;

create table my_table9
(

    string_col    varchar(30),
    int_col       int,
    dec_col       dec(10, 2),
    date_col      date,
    date_time_col datetime
);

insert into my_table9(string_col, int_col, dec_col, date_col, date_time_col)
VALUES ('점심시간', 50000, 54321.98, '2024-01-01', '2024-01-01 12:00:00');

select *
from my_table9;

create table my_table10
(
    title     varchar(30),
    name      varchar(30),
    age       int,
    price     dec(10, 3),
    published date,
    inserted  datetime
);

insert into my_table10(title, name, age, price, published, inserted)
VALUES ('이것이 자바다', '신용권', 40, 23422.223, '1999-09-09', '1999-09-09 12:33:12');

insert into my_table10(title, name, age, price, published, inserted)
VALUES ('스프링부트', '홍길동', 50, 2342.123, '2024-01-01', '2024-01-01 09:33:33');

select *
from my_table10;

select *
from my_table9;
