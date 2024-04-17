use w3schools;

#SELECT 에 컬럼명
#FROM 테이블명
#Where 솎아낼 레코드 조건
select CustomerName, city, Country
from Customers
where city = 'berlin';

select CustomerName, city, Country
from Customers
where country = 'germany';


#컬럼명 비교연산자 값
#값에 ''로 감싸기 ( 숫자형식은 생략)
select *
from Customers
where CustomerID = 1;

#비교 연산자 : 같다 =, 작다<, 작거나 같다 <=, 크다 >, 크거나 같다 >=
#같지읺다 !=, <>
select *
from Customers
where CustomerID = 3;

select *
from Customers
where CustomerID < 3;

select *
from Customers
where CustomerID > 89;

select *
from Customers
where CustomerID <= 3;

select *
from Customers
where CustomerID != 3;

select *
from Customers
where CustomerID <> 1;

#문자열 형식(대소문자 구분 없음)
select *
from Customers
where CustomerName >= 'S';

#날짜형식
select *
from Employees
where BirthDate = '1968-12-08';

select *
from Employees
where BirthDate > '1955-01-01'
order by BirthDate asc;

select *
from Suppliers;

select *
from Suppliers;

select *
from Employees
where LastName = 'Fuller';


select *
from Products;

select *
from Products
where Price >= 20.00;

select *
from Orders
where OrderDate < '1997-01-01'
order by CustomerID desc;


select *
from Products;

select *
from Customers;
