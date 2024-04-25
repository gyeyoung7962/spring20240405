use w3schools;

# unique : 다른 레코드의 컬럼 값이 중복되지 않음
create table my_table15
(
    col1 varchar(3),
    col2 varchar(3) unique
);

insert into my_table15(col1, col2)
values ('abc', 'def');

insert into my_table15(col1, col2)
VALUES ('qwe', 'qwe');

insert into my_table15(col1, col2)
values ('abc', 'abc');

insert into my_table15(col1, col2)
VALUES ('def', 'def');

insert into my_table15(col1)
VALUES ('qwe');

insert into my_table15(col1)
VALUES ('asd');


desc my_table15;

select *
from my_table15;

create table my_table16
(
    col1 varchar(10),
    col2 varchar(10) unique,
    col3 varchar(10) unique not null
);

insert into my_table16(col1, col2, col3)
VALUES ('aa', 'bb', 'cc');

insert into my_table16(col1, col2, col3)
VALUES ('aa', null, 'cc1');

insert into my_table16(col2, col3)
VALUES (null, 'cc2');

insert into my_table16(col1, col2, col3)
values ('bb', 'bb1', 'cc3');

insert into my_table16(col3)
values ('ccc');

desc my_table16;

select *
from my_table16;




