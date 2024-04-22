use w3schools;

# update 테이블명
# set 컬럼명 = 바꿀값, 컬럼명 = 바꿀값
# where 레코드의 조건

# 주의 : update전에 where로 select 꼭 먼저하기

select *
from Customers
where CustomerID = 10;


update Customers
set ContactName = 'tony stark'
where CustomerID = 10;

update Customers
set Address    = 'start tower',
    city       = '맨하탄',
    PostalCode = '12345'
where CustomerID = 10;

select *
from Customers
where Country = 'uk';

update
    Customers
set Country = '영국'
where country = 'uk';

select *
from Customers;

update Customers
set country ='영국';

select *
from Employees
where EmployeeID = 3;

select *
from Products
where ProductID = 1;

update
    Products
set Price = Price * 2
where ProductID = 1;


select *
from Products
where ProductID = 2;

update
    Products
set price = price * 3
where productid = 2;

