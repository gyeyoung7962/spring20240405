use w3schools;

#primary key : not null unique

create table my_table17
(
    col1 int,
    col2 int primary key #not null unique
);


insert into my_table17(col1, col2)
values (1, 1);

insert into my_table17(col1, col2)
values (2, 2);

insert into my_table17(col1, col2)
values (3, 2);

insert into my_table17(col1, col2)
values (null, 3);

insert into my_table17(col1, col2)
values (3, null);

desc my_table17;

# primary key 제약사항은 한 테이블에 하나만 줄수 있음

create table my_table18
(
    col1 int primary key,
    col2 int primary key
);

create table my_table19
(

    col1 int not null unique,
    col2 int not null unique
);

desc my_table19;

create table my_table20
(
    col1 int primary key,
    col2 int not null unique
);

desc my_table20;

# 여러 컬럼 조합으로 primary key 제약사항을 줄 수 있음

create table my_table21
(
    col1 int,
    col2 int,
    col3 int,
    primary key (col1, col2)
);

desc my_table21;

insert into my_table21(col1, col2, col3)
VALUES (1, 1, 1);

insert into my_table21(col1, col2, col3)
VALUES (1, 2, 1);


insert into my_table21(col1, col2, col3)
VALUES (2, 2, 1);

insert into my_table21(col1, col2, col3)
VALUES (null, 1, 1);

create table my_table22
(
    col1 int primary key,
    col2 int not null,
    col3 int unique,
    col4 int,
    col5 int,
    unique (col4, col5)
);

drop table my_table22;
desc my_table22;
