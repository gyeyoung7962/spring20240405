use mydb2;



create table table5
(
    col1 int,
    col2 varchar(3)
);

create table table6
(
    col_a int,
    col_b varchar(3),
    col_c varchar(3)
);

insert into table5
values (1, 'abc'),
       (2, 'def'),
       (3, 'ghi');

insert into table6
values (2, 'jkl', 'mno'),
       (3, 'pqr', 'stu'),
       (4, 'vwx', 'yza'),
       (5, 'bcd', 'efg');

select count(*)
from table5
         join table6;

select *
from table5
         join table6 on col1 = col_a;

select *
from table5
         left join table6 on col1 = col_a;





