#LIKE : 와일드카드로 조회
# _:한글자아무거나
# %:글자 아무거나

select *
from Products
where ProductName like 'cha__';

select *
from Orders
where OrderDate like '1996-07-1_';

select *
from Orders
where OrderDate like '____-07-__';

select *
from Products
where ProductName like 'cha%';

select *
from Products
where ProductName like '%ng';

select *
from Products
where ProductName like 's%s';

select *
from Products
where ProductName like '%anton%';

select *
from Customers
where CustomerName like 'b%';

select *
from Customers
where Country like '%a';

select *
from Orders
where OrderDate like '____-__-01';

select *
from Products;

show processlist;