#normalization : 정규화(정규형)

#first normal form(1nf, 제1정규화)
#1)각 행을 유일하게 구분하는 컬럼이 존재한다 ex) primary key가 있다
#2) 모든 데이터는 원자적으로 저장된다 ex) 같은 형식의 데이터를 저장하는 여러컬럼이 있지 않다,
#   한 컬럼에 여러 값이 저장되지 않는다

#primary key
# not null, unique
# 바뀔 가능성이 현저히 낮아야함
# 가장 좋은 primary key는 의미가없는 컬럼이다
create database mydb1;
use mydb1;
create table customer
(
    id           int primary key auto_increment,
    email        varchar(50),
    name         varchar(10),
    phone_number varchar(50),
    address      varchar(300),
    ssn          varchar(13)
);

insert into customer(email, name, phone_number, address, ssn)
VALUES ('', '', '', '', '');

select *
from customer;

drop table customer;

create table customer
(
    id         int primary key auto_increment,
    first_name varchar(3),
    last_name  varchar(3)
);

create table phone_number
(
    id           int primary key auto_increment,
    customer_id  int,
    phone_number varchar(10),
    foreign key (customer_id) references customer (id)
);

insert into customer(first_name, last_name)
values ('son', 'hm'),
       ('lee', 'ki');

select *
from customer;

insert into phone_number(customer_id, phone_number)
values (1, '1234');

insert into phone_number(customer_id, phone_number)
values (1, '4321');

insert into phone_number(customer_id, phone_number)
values (2, '4321');

select *
from phone_number
order by customer_id, phone_number asc;

drop table customer;
drop table phone_number;


# 외래키(foreign key) 제약사항

#후보키 : primary key가 될 후보키

#second mormal form(2nf, 제2정규화)

#third normal form(3nf, 제3정규화)