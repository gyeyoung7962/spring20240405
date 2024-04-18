use w3schools;


# order by : 조회 순서 결정
# order by 컬럼명
# asc 오름차순 desc 내림차순

select *
from Products
order by categoryId asc;

select *
from Products
order by categoryId desc;

select *
from Products
order by CategoryID asc, price desc;

select *
from Products
order by CategoryID, price desc;

select *
from Products
order by 4, 6;

#select에 명시한 컬럼명의 순서를 따라야 함
select Products.ProductName, Products.CategoryID, Products.Price, Products.Unit
from Products
order by 2;

select *
from Employees
order by BirthDate desc;

select *
from Customers
order by country, city;

select *
from Suppliers
order by city;

select *
from Employees
order by FirstName desc;
