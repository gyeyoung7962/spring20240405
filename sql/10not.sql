use w3schools;

# not : 조건을 만족하지 않으면 true
select *
from Employees
where not BirthDate >= '1960-01-01';

select *
from Customers
where country not in ('france', 'uk', 'spain')
order by country;

select *
from Products
where not price between 100 and 200
order by Price;

# 여러 조건 사용시 괄호 잘 사용하기
select *
from Products
where not (CategoryID = 1)
  and price > 50
order by CategoryID, price;


select *
from Orders
where not OrderDate like '1997%';

select *
from Suppliers
where not Country in ('uk', 'usa');


select *
from Customers;