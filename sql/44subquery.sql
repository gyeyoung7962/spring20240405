use w3schools;

#1행1열결과(scalar)

# 여러행 1열 결과

#여러행 여러열 결과
select avg(price)
from Products;

select *
from Products
where price >= (select avg(price)
                from Products);

desc Categories;
desc Products;

select ProductName
from Products
where CategoryID = 2
  and Price >= (select avg(price) from Products where CategoryID = 1);

select customerId
from Customers
where country = 'mexico';

#mexico 고객이 주문한건들 조회
select *
from Orders
where CustomerID in (2, 3, 13, 58, 80);

select *
from Orders
where CustomerID in (select customerId
                     from Customers
                     where country = 'mexico');

select *
from Orders o
         join Customers c
              on o.CustomerID = c.CustomerID
where c.Country = 'mexico';


desc Products;
desc Categories;
desc Orders;
desc OrderDetails;
#1번 카테고리 상품들이 주문된 날짜들 조회
select distinct o.OrderDate
from Products p
         join Categories c
              on p.CategoryID = c.CategoryID
         join OrderDetails od
              on p.ProductID = od.ProductID
         join Orders o
              on o.OrderID = od.OrderID
where c.CategoryID = 1;

select city, country
from Customers
where customerid in (1, 2);

select customerName
from Customers
where (city, country) in (('berlin', 'germany'), ('mexico D.F.', 'Mexico'));


select customerName
from Customers
where (city, country) in (select city, country
                          from Customers
                          where customerid in (1, 2));

select CustomerID, CustomerName, city, country
from Customers;

#상관서브쿼리 : 외부쿼리의 값이 내부쿼리에 사용될 때(속도가 좀 느린편, 조인으로 해결 할수 있는지)

# 각 고객의 주문 횟수
select customerName, country, (select count(OrderID) from Orders where Customers.CustomerID = Orders.CustomerID)
from Customers;

select c.CustomerName, country, count(OrderID)
from Customers c
         left join Orders o
                   on c.CustomerID = o.CustomerID
group by c.CustomerID;

# 각 상품별 총 매출금액
desc OrderDetails;
desc Products;
select p.ProductID, p.ProductName, sum(o.Quantity * p.Price)
from OrderDetails o
         join Products p
              on o.ProductID = p.ProductID
group by p.ProductName
order by o.ProductID desc;


select p.ProductID,
       p.ProductName,
       (select sum(od.Quantity) from OrderDetails od where od.ProductID = p.ProductId) * p.price
from Products p
order by p.ProductID desc;


