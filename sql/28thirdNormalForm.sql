#thirdNormalForm(3nf)

#1) 2nf이다
#2) 키가 아닌 컬럼끼리 종속되면 안됨

use mydb1;
drop table customer;
# drop table phone_number;

create table customer
(
    id         int primary key auto_increment,
    first_name varchar(3),
    last_name  varchar(3),
    level      int,
    benefit    varchar(100)
);

insert into customer(first_name, last_name, level)
values ('son', 'hm', 1),
       ('lee', 'ki', 1),
       ('kim', 'hs', 2),
       ('lee', 'jh', 2),
       ('cap', 'ste', 3);

select *
from customer;

create table customer
(
    id         int primary key auto_increment,
    first_name varchar(3),
    last_name  varchar(3),
    level      int,
    foreign key (level) references customer_benefit (level)

);

create table customer_benefit
(
    level   int primary key,
    benefit varchar(100)
);

drop table customer_benefit;

insert into customer_benefit(level, benefit)
VALUES (1, '무료배송'),
       (2, '할인'),
       (3, '라운지');
