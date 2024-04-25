use w3schools;

#default : 값을 주지 않을 때의 기본값을 정의

create table my_table13
(
    col1 varchar(10),
    col2 varchar(10) default 'abc'
);

insert into my_table13(col1)
values ('aa');
insert into my_table13(col1, col2)
VALUES ('aaa', 'aaaa');

insert into my_table13(col2)
values ('aa');

insert into my_table13(col1, col2)
VALUES ('jkl', null);

desc my_table13;

select *
from my_table13;

create table my_table14
(
    col1 int,
    col2 varchar(10)           not null,
    col3 varchar(10) default 'aaa',
    col4 int         default 0 not null
);

insert into my_table14(col1, col2)
values (1, 'aa');

insert into my_table14(col1, col2, col3, col4)
values (1, 'aa', 'aa1', 1);

desc my_table14;

select *
from my_table14;


