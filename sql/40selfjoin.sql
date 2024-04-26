use mydb2;

create table employee
(
    id         int primary key,
    name       varchar(10) not null,
    info       varchar(10) not null,
    manager_id int
);

insert into employee
values (1, '손흥민', '과장', 6),
       (2, '이강인', '대리', 1),
       (3, '이정후', '사원', 1),
       (4, '황희찬', '대리', 1),
       (5, '차범근', '사장', null),
       (6, '박지성', '차장', 5);


#손흥민의 직속 상사
select *
from employee e1
         join employee e2
              on e1.manager_id = e2.id
where e1.name = '손흥민';


#이정후의 직속 상사
select e.name
from employee e
         join employee m
              on e.id = m.manager_id
where m.name = '이정후';

select *
from employee;

select e.name 선배, m.name 후배
from employee e
         join employee m
              on e.id = m.manager_id
where e.name = '손흥민';

select name
from employee
where id = (select manager_id
            from employee
            where name = '이정후');

select id
from employee
where name = '손흥민';

select *
from employee
where manager_id = (select id
                    from employee
                    where name = '손흥민');



