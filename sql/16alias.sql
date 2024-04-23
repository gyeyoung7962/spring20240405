use w3schools;

select *
from Products;

desc Products;

# AS : 컬럼(또는 테이블)에 별칭을 줌
SELECT ProductID AS id, ProductName AS name, Price AS 가격
from Products;

SELECT ProductID id, ProductName name, Price 가격
from Products;

select *
from Employees;

select *
from Products
where price >= 5
  and price <= 55;


select *
from Customers;