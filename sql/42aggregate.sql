use mydb2;

create table table12
(
    number int
);

insert into table12
values (3),
       (4),
       (5),
       (null),
       (null);


select *
from table12;

select count(number)
from table12;

select max(number)
from table12;

select min(number)
from table12;

select sum(number)
from table12;

select avg(number)
from table12;

-- null 을 다른값으로바꾸기
select number
from table12;

select ifnull(number)
from table12;

select count(ifnull(number, 0))
from table12;

select avg(ifnull(number, 0))
from table12;

