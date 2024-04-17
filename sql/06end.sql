use w3schools;

#and 여러 조건 만족
#or 하나의 조건만 만족

select *
from Products
where ProductName like 'a%'
   or ProductName like 'c%';

select *
from Products
where CategoryID = 1
   or CategoryID = 3
   or CategoryID = 5;

select *
from Products
where SupplierID = 1
  and CategoryID = 1;

select *
from Products
where SupplierID = 2
  and CategoryID = 2
  and price > 20;

#where의 조건의 ()사용해서 우선순위 결정
select *
from Products
where (SupplierID = 2
    and CategoryID = 2)
   or price > 20;

select Customers.CustomerName
from Customers
where country = 'uk'
   or 'usa';

select Customers.CustomerName
from Customers
where city = 'madrid'
   or 'london';

select CustomerID, OrderDate
from Orders
where OrderDate like '1997-05%';

select *
from Customers
where CustomerName like '%be%'
   or ContactName like '%be%';

select *
from Customers;

select *
from Employees;




