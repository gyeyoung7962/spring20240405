use w3schools;


# between 최소값 and 최대값
# 최소값 최대값의 사이이면 true

select *
from Products
where Price >= 10.00
  and price <= 20.00;

select *
from Products
where Price between 10.00 and 20.00;

select *
from Orders
where OrderDate between '1996-07-01' and '1996-07-31';

select *
from Employees
where BirthDate between '1960-01-01' and '1969-12-31';

show variables like "%max_connections%";

show status like "%connect%";