use mydb2;

select *
from product;

select *
from category;


# 상품이 존재하지 않는 카테고리
select *
from category c
         left join product p
                   on c.id = p.category_id
where p.category_id is null;

use w3schools;

select *
from Customers;

select *
from Orders;

select c.CustomerName
from Customers c
         left join
     Orders o
     on o.CustomerID = c.CustomerID
where o.OrderID is null;

select distinct c.CustomerName 주문한사람, o.OrderDate 주문한날짜
from Orders o
         join Customers c
              on o.CustomerID = c.CustomerID
where o.OrderDate like '1996%';

delete
from Orders
where OrderDate >= '1997-01-01';

select c.CustomerName
from Orders o
         right join Customers c
                    on o.CustomerID = c.CustomerID
where o.OrderID is null;

insert into Employees(LastName, FirstName)
values ('흥민', '손'),
       ('강인', '이');

select e.FirstName 성, e.LastName 이름
from Orders o
         right join Employees e
                    on o.EmployeeID = e.EmployeeID
where o.OrderDate is null;




