use w3schools;


select *
from Products;

select *
from Categories
where CategoryID = 1;

select *
from Products p
         join Categories c
              on p.CategoryID = c.CategoryID
where p.ProductID = 1;

select *
from Suppliers;

select p.ProductID 상품번호, p.ProductName 상품, s.SupplierName 공급자, s.Country
from Products p
         join Suppliers s
              on p.SupplierID = s.SupplierID
where p.ProductID = 10;


select *
from Orders;

select *
from Customers;

select o.OrderID 주문번호, c.CustomerName '이름'
from Customers c
         join
     Orders o
     on c.CustomerID = o.CustomerID
where o.OrderID = 10249;

select *
from Employees;

select *
from Orders;

select o.OrderID 주문번호, e.FirstName 성, e.LastName 이름
from Orders o
         join Employees e
              on o.EmployeeID = e.EmployeeID
where o.OrderID = 10249;



select *
from Shippers;

select *
from Orders;


select o.OrderID 주문번호, s.ShipperName 배달하는사람
from Orders o
         join Shippers s
              on o.ShipperID = s.ShipperID
where o.OrderID = 10249;

select *
from Customers;

select *
from Orders;

select o.OrderID 번호, o.OrderDate 주문일, c.CustomerName 고객이름
from Customers c
         join Orders o
              on c.CustomerID = o.CustomerID
where c.CustomerID = 90
order by o.OrderDate;

select *
from Employees;

select *
from Orders;

select e.FirstName 성, e.LastName 이름, o.OrderDate 주문날짜
from Employees e
         join Orders o
              on e.EmployeeID = o.EmployeeID
where e.EmployeeID = 3
order by o.OrderDate;
