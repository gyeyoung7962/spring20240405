#(inner)join
#left join
#right join
#full join -> mariadb에는 없다

#union 합집합

use mydb2;

create table table10
(
    col1 int
);

create table table11
(
    col_a int
);

insert into table10
values (3),
       (4),
       (4),
       (5);

insert into table11
values (3),
       (4),
       (7);

select *
from table10

union

select *
from table11;

select *
from table10 t10
         left join table11 t11
                   on t10.col1 = t11.col_a

union

select *
from table10 t10
         right join table11 t11
                    on t10.col1 = t11.col_a;


select *
from table10 t10
         left join table11 t11
                   on t10.col1 = t11.col_a

union all

select *
from table10 t10
         right join table11 t11
                    on t10.col1 = t11.col_a;
