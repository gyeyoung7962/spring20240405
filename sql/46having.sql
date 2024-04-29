use w3schools;

# having :집계함수의 조건절
select CategoryID, count(ProductID) 상품수
from Products
group by CategoryID;

# 상품수가 10개 이상인 카테고리

select *
from (select CategoryID, count(ProductID) 상품수
      from Products
      group by CategoryID) c
where 상품수 >= 10;

select categoryId, count(productId) 상품수
from Products
group by categoryId
having 상품수 >= 10;

#고객이 5명 이상 있는 국가들 조회
select country, count(CustomerID) 고객수
from Customers
group by Country
having 고객수 >= 5
order by 고객수 desc;

#97년 7월 매출액(sum(상품가격 * 개수))이 10000달러 이상인 직원들 조회
desc Employees;
desc Products;
desc Orders;
desc OrderDetails;

select e.firstname, e.LastName, sum(p.price * od.Quantity) 매출
from Employees e
         join Orders o
              on e.EmployeeID = o.EmployeeID
         join OrderDetails od
              on o.OrderID = od.OrderID
         join Products p
              on p.ProductID = od.ProductID
where o.OrderDate like '1997-07%'
group by e.EmployeeID
having 매출 >= 10000
order by 매출 desc;


--
select o.OrderDate, sum(p.price * od.Quantity) 매출
from Employees e
         join Orders o
              on e.EmployeeID = o.EmployeeID
         join OrderDetails od
              on o.OrderID = od.OrderID
         join Products p
              on p.ProductID = od.ProductID
where o.OrderDate like '1997%'
# group by o.OrderDate
group by date_format(o.OrderDate, '%Y-%m')
having 매출 >= 10000
order by OrderDate;


desc Products;
select c.CustomerName, sum(od.Quantity * p.Price) sumPrice
from Customers c
         join Orders o
              on c.CustomerID = o.CustomerID
         join OrderDetails od
              on o.OrderID = od.OrderID
         join Products p
              on p.ProductID = od.ProductID
where o.OrderDate between '1997-03-01' and '1997-03-31'
group by c.CustomerID
order by sumPrice desc;

