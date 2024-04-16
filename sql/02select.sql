use w3schools;


#데이터조회
select *
from Customers;

select *
from Suppliers;

#특정 컬럼만 조회
#select 컬럼명 , 컬럼명 from 테이블명
select customerName, city
from Customers;

#모든 컬럼 조회
select *
from Customers;

#테이블 컬럼 조회
desc Customers;

desc Employees;
select firstname as f, LastName as l
from Employees;

select FirstName
from Employees;

select CustomerName
from Customers;