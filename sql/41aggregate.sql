use w3schools;

# aggregate function : 집계함수
# 평균 합계 개수 최대값 최소값
# null 은 집계시 제외됨

#count : 개수
select count(EmployeeID)
from Employees;

select count(Notes)
from Employees;

select count(Country)
From Customers;

select count(distinct Country)
from Customers;

# min :최소값
# max :최대값

select max(Price)
from Products;

select min(price)
from Products;

select max(BirthDate)
from Employees;

select min(birthDate)
from Employees;

#sum : 합계

select sum(price)
from Products;

select avg(price)
from Products;





