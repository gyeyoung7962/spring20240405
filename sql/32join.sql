CREATE DATABASE mydb2;
USE mydb2;

CREATE TABLE table1
(
    col_a INT
);
CREATE TABLE table2
(
    col_b INT
);

INSERT INTO table1
    (col_a)
VALUES (1),
       (2),
       (3),
       (4);

INSERT INTO table2
    (col_b)
VALUES (2),
       (2),
       (3),
       (4),
       (5);

SELECT *
FROM table1;

SELECT *
FROM table2;

# JOIN : 두 개(이상)의 테이블을 결합
# 컬럼수 : 두 테이블의 컬럼 수의 합
# 행(레코드)수 : 두 테이블의 행의 수의 곱
#  -> cartesian product

SELECT *
FROM table1
         JOIN table2
ORDER BY col_a, col_b;


# INNER JOIN : 두 테이블에 모두 있는 값만
SELECT *
FROM table1
         JOIN table2 ON col_a = col_b;

SELECT *
FROM table1
         JOIN table2
WHERE col_a = col_b;

create table table3
(
    col_a int
);

create table table4
(
    col_b int
);

insert into table3(col_a)
values (5),
       (6),
       (7);

insert into table4(col_b)
values (7),
       (6),
       (7),
       (8);


select *
from table3
         join table4
order by col_a, col_b;



select *
from table3
         join table4
              on col_a = col_b;









