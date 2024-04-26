use mydb2;

create table product
(
    id          int primary key auto_increment,
    name        varchar(10) not null,
    price       int         not null default 0,
    category_id int references category (id)
);

create table category
(
    id   int primary key auto_increment,
    name varchar(10) not null
);

insert into category(name)
values ('초콜렛'),
       ('탄산음료'),
       ('과자'),
       ('유제품'),
       ('생필품');

insert into product(name, price, category_id)
values ('가나', 500, 1),
       ('폐레로로쉐', '700', 1),
       ('크런키', 400, 1),
       ('콜라', 300, 2),
       ('사이다', 300, 2),
       ('포카칩', 600, 3),
       ('새우깡', 550, 3);

select *
from product
         join category;

select p.id 상품번호, p.name 상품이름, p.price 가격, c.id '카테고리넘버', c.name 카테고리값
from product p
         join category c on p.category_id = c.id
