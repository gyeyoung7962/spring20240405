use w3schools;

# limit : 조회 결과 수를 제한

select *
from Customers
limit 5;



select *
from Products
order by price desc
limit 5;

select *
from Employees
order by BirthDate desc
limit 2;

select *
from Products
where CategoryID = 1
order by Price
limit 3;

select *
from Orders
order by orderdate
limit 1;

select *
from Orders
order by orderdate desc
limit 5;

select *
from Employees
order by birthdate
limit 1;

select *
from Products
where CategoryID = 3
order by price desc
limit 2;

# limit OFFSET, 5
# OFFSET 부터 5개
select *
from Products
order by Price
limit 1,5;

# paging

# 한 페이지에 10개씩 조회할 때
# 1페이지 : limit 0, 10
select CustomerID, CustomerName
from Customers
order by CustomerID
limit 0, 10;

# 2페이지 :limit 10, 10
select CustomerID, CustomerName
from Customers
order by CustomerID
limit 10, 10;

# 3페이지 : limit 20, 10
select CustomerID, CustomerName
from Customers
order by CustomerID
limit 20, 10;

# n폐이지: limit  (n-1) * 한페이지의 게시물 수 , 한페이지의 게시물 수



