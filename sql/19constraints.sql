use w3schools;

# 제약사항 constraints
# 특정의 컬럼에 제약사항을 줌(예: 꼭 값이 있어야함, 기본값, 중복불가)

# not null : 꼭 값이 있어야함

create table my_table11
(

    col1 varchar(10),
    col2 varchar(10) not null
);

desc my_table11;

insert into my_table11(col1, col2)
VALUES ('value', 'value');

insert into my_table11(col2)
values ('value');

insert into my_table11(col1)
values ('value');

select *
from my_table11;

# 해당 컬럼에 값이 없는 레코드 조회
select *
from my_table11
where col1 is null;

select *
from my_table11
where col1 is not null;

create table my_table12
(

    val1 int           not null,
    val2 decimal(5, 2) not null
);

insert into my_table12(val1, val2)
values (1, 0.1);

select *
from my_table12;
