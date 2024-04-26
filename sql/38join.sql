use mydb2;

create table table7
(
    col1 int,
    col2 varchar(3)

);

create table table8
(
    cola int,
    colb varchar(3)
);

create table table9
(
    col3 int,
    colc int,
    info varchar(3)
);

insert into table7
values (1, 'abc'),
       (2, 'def');

INSERT INTO table8
VALUES (1, 'ghi'),
       (2, 'jkl'),
       (3, 'mno');

INSERT INTO table9
VALUES (1, 2, 'pqr'),
       (1, 3, 'stu'),
       (2, 1, 'vwx'),
       (2, 2, 'yza');

select *
from table7 t7
         join table9 t9
              on t7.col1 = t9.col3
         join table8 t8
              on t8.cola = t9.colc;

use w3schools;

select o.OrderID,
       o.OrderDate,
       c.CustomerID,
       c.CustomerName,
       e.EmployeeID,
       e.FirstName,
       e.LastName,
       s.ShipperName
from Orders o
         join Customers c
              on o.CustomerID = c.CustomerID
         join Employees e
              on o.EmployeeID = e.EmployeeID
         join Shippers s
              on o.ShipperID = s.ShipperID
where o.OrderDate between '1996-07-01' and '1996-07-31'
order by o.OrderDate;

select distinct p.ProductName, OrderDate
from Orders o
         join OrderDetails od
              on o.OrderID = od.OrderID
         join Products p
              on p.ProductID = od.ProductID
where o.OrderDate = '1996-07-08'
order by p.ProductName;

select *
from Products
where ProductID = 71;

select *
from Customers;

select *
from Orders;

select *
from OrderDetails;

select *
from Products;


select c.CustomerName, c.Address, o.OrderDate, p.ProductName
from Customers c
         join Orders o
              on c.CustomerID = o.CustomerID
         join OrderDetails od
              on o.OrderID = od.OrderID
         join Products p
              on od.ProductID = p.ProductID
where p.ProductName = 'Fløtemysost'
order by c.CustomerName, o.OrderDate;





