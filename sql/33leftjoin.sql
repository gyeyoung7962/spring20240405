use mydb2;

#left (outer) join

#inner join + 왼쪽 테이블에만 있는 레코드


select *
from table1;

select *
from table2;

select *
from table1
         join table2;

# 공통된 레코드와 왼쪽 table의 레코드 추가
select *
from table1
         left join table2 on col_a = col_b;

delete
from table1;

delete
from table2;

insert into table1
values (1),
       (2),
       (2),
       (3),
       (4);

insert into table2
values (3),
       (4),
       (5),
       (5);

select *
from table1
         left join table2 on col_a = col_b;

select *
from table2
         left join table1 on col_a = col_b;

delete
from table3;

delete
from table4;

insert into table3
values (4),
       (5),
       (6),
       (3);

insert into table4
values (5),
       (6),
       (7),
       (7),
       (8);

select *
from table3
         join table4;

select *
from table3
         join table4 on col_a = col_b;


select *
from table3
         left join table4 on col_a = col_b;

select *
from table1
         right join table2 on col_a = col_b;

