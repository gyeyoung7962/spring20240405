use w3schools;

#alter table : 테이블 구조 변경

# 컬럼 추가

create table my_table23
(
    name varchar(3),
    age  int
);

insert into my_table23(name, age)
values ('son', 44),
       ('lee', 33);

alter table my_table23
    add column address varchar(10);

select *
from my_table23;

alter table my_table23
    add column city varchar(5);

alter table my_table23
    add column country varchar(10) not null;

alter table my_table23
    add column price int not null;

alter table my_table23
    add column state varchar(10) not null unique;


alter table my_table23
    add column state varchar(10) not null default '서울';

desc my_table23;

alter table my_table23
    add column birth date after age;

# 컬럼 삭제 (주의)
alter table my_table23
    drop column state;

desc my_table23;

alter table my_table23
    drop column city;

# 컬럼 변경(이름, 자료형, 제약사항) 주의
alter table my_table23
    rename column address to town;

alter table my_table23 rename column birth to birth_date;

# 자료형 변경
alter table my_table23
    modify column price dec(20, 2);


alter table my_table23
    modify column name varchar(30);

desc my_table23;

# 타입변경시 주의할 점 : 데이터를 잃어버리지 않도록 해야함
insert into my_table23(name, country)
values ('123456789012345', 'korea');

alter table my_table23
    modify column name varchar(20);

alter table my_table23
    modify column name varchar(10);

select *
from my_table23;

# 제약사항 변경
desc my_table23;

alter table my_table23
    modify column name varchar(20) unique;

alter table my_table23
    modify column age int unique;

# unique 제약사항 삭제하기

show index from my_table23;

# alter table my_table23
#     drop index age;

# alter table my_table23
#     drop index name;
    
# not null 추가
alter table my_table23
    modify column name varchar(20) not null;

desc my_table23;

# not null 삭제
alter table my_table23
    modify name varchar(20) null;

alter table my_table23
    modify column age int not null;

alter table my_table23
    modify age int null;

update my_table23
set age = 0
where age is null;

select *
from my_table23;


# default 제약사항 추가,삭제
alter table my_table23
    modify column name varchar(20) default 'guest';

alter table my_table23
    alter column name drop default;

desc my_table23;

alter table my_table23
    modify column age int default 10;

alter table my_table23
    alter column age drop default;

# primary key 제약 사항 추가/ 삭제
alter table my_table23
    add primary key (name);

alter table my_table23
    drop primary key;

alter table my_table23
    modify column name varchar(20) null;

show index from my_table23;

alter table my_table23
    modify column age int primary key;

alter table my_table23
    drop primary key;

alter table my_table23
    modify column age int null;

desc my_table23;