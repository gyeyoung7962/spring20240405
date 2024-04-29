use w3schools;

#group by : 집계함수(avg, sum, count, min, max)를 그룹별로 결과 내게 함

select categoryId, count(productId)
from Products
group by CategoryID;

select categoryId, (select c.CategoryName from Categories c where c.CategoryID = p.CategoryID), count(productId)
from Products p
group by CategoryID;

select c.CategoryID, count(p.ProductID)
from Products p
         join Categories c
              on p.CategoryID = c.CategoryID
group by c.CategoryID;

desc Orders;
desc OrderDetails;
desc Products;
desc Employees;

select e.EmployeeID, e.FirstName, e.LastName, sum(od.Quantity * p.Price) 매출
from Orders o
         join OrderDetails od
              on o.OrderID = od.OrderID
         join Products p
              on od.ProductID = p.ProductID
         join Employees e
              on e.EmployeeID = o.EmployeeID
where o.OrderDate between '1997-01-01' and '1997-01-31'
group by e.EmployeeID
order by 매출 desc;

#1997년 7월 기준 고객별 소비금액을 금액이 높은 순서로 조회
desc Customers;
desc OrderDetails;
desc Orders;
desc Products;

select c.CustomerName, sum(p.Price * od.Quantity) 소비정도
from Customers c
         join Orders o
              on c.CustomerID = o.CustomerID
         join OrderDetails od
              on o.OrderID = od.OrderID
         join Products p
              on p.ProductID = od.ProductID
where o.OrderDate between '1997-07-01' and '1997-07-31'
group by c.CustomerName
order by 소비정도 desc
limit 5;

select country, city, count(customerId)
from Customers
group by country, city;

# 고객별, 상품별 주문량
select c.CustomerID 고객번호, c.CustomerName, p.ProductName, sum(od.Quantity) 주문
from Orders o
         join OrderDetails od
              on o.OrderID = od.OrderID
         join Products p
              on p.ProductID = od.ProductID
         join Customers c
              on c.CustomerID = o.CustomerID
group by c.CustomerID, p.ProductID
order by 고객번호, 주문 desc;

# 국가별, 상품별 판매 갯수 조회(국가 asc, 상품 판매수 desc 순 정렬)
desc Orders;
desc OrderDetails;
desc Products;
desc Customers;

select c.country, p.ProductID, p.ProductName, sum(od.Quantity) 판매
from OrderDetails od
         join Orders o
              on od.OrderID = o.OrderID
         join Products p
              on od.ProductID = p.ProductID
         join Customers c
              on c.CustomerID = o.CustomerID
group by c.Country, p.ProductID -- 국가별로 상품이 몇개 팔리는지
#group by p.ProductId, c.country  -- 상품별로 나라에 얼마나 팔리는지
order by c.Country asc, 판매 desc;


