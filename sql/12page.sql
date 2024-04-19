use w3schools;

select *
from Customers;

insert into Customers
    (CustomerName, ContactName, Address, City, PostalCode, Country)
select CustomerName, ContactName, Address, City, PostalCode, Country
from Customers;

select count(*)
from Customers;


select *
from Employees
limit 0 ,10;

#직원 테이블 데이터 추가
insert into Employees
    (LastName, FirstName, BirthDate, Photo, Notes)
select LastName, FirstName, BirthDate, Photo, Notes
from Employees;

delete
from Employees
where EmployeeID > 580;

select count(*)
from Employees;