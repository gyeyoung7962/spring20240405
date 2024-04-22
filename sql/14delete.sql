use w3schools;

select *
from Employees
order by EmployeeID desc;

# 지우기 전에 꼭 같은 where로 select 해보기
# delete from Employees
delete
from Employees
where EmployeeID = 1018;

select *
from Employees
where LastName = '블랙';

# 모든 레코드 지우기 : where 안쓰면 됨
select *
from Employees;

delete
from Employees;

select *
from Customers;

select *
from Customers;
insert into Customers(customername, contactname, address, city, postalcode, country)
values ('ㅁㅁ', 'ㅁㅁ', 'ㅁㅁ', 'ㅁㅁ', 'ㅁㅁ', 'ㅁㅁ');
