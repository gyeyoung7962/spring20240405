use w3schools;

select avg(price)
from Products
where CategoryID = 1;

select sum(Quantity)
from OrderDetails
where ProductID = 1;

select sum(Quantity)
from OrderDetails od
         join Orders o
              on od.OrderID = o.OrderID
where ProductID = 2
  and o.OrderDate like '1997%';



select *
from Customers;

#1번 고객이 1997년에 소비한 금액
select sum(p.Price * od.Quantity)
from Orders o
         join OrderDetails od
              on o.OrderID = od.OrderID
         join Products p
              on p.ProductID = od.OrderID
where o.CustomerID = 1
  and o.OrderDate between '1997-01-01' and '1997-12-31';

desc Customers;
desc OrderDetails;
desc Products;
desc Orders;

select country
from Customers;

# 멕시코 고객들이 1997년에 소비한 금액은?
select sum(od.Quantity * p.Price)
from Customers c
         join Orders o
              on c.CustomerID = o.CustomerID
         join OrderDetails od
              on od.OrderID = o.OrderID
         join Products p
              on od.ProductID = p.ProductID
where c.Country = 'mexico'
  and o.OrderDate like '1997%';
