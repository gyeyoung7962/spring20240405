use w3schools;

# insert into 테이블명 (컬럼명)
# values (데이터)

select *
from Employees
order by EmployeeID desc;

desc Employees;

insert into Employees (LastName)
values ('ironman');

insert into Employees (FirstName)
values ('tony');

# null : 값이 없음

insert into Employees(lastname, firstname, birthdate, photo, notes)
VALUES ('captain', 'steve', '1990-01-01', 'pic1', 'america');

insert into Employees(firstName, lastName)
values ('natasha', 'window');

desc Customers;

insert into Customers(customername, contactname, address, city, postalcode, country)
values ('아이셔', 'ice', '서울 강남', '강남', '1312', '대한민국');

insert into Customers(customername, contactname, address, city, postalcode, country)
values ('아이셔2', 'ice2', '서울 강남2', '강남 11', '1312-1', '대한민국');

select *
from Customers
order by CustomerID desc;

select *
from Employees
order by EmployeeID desc;
