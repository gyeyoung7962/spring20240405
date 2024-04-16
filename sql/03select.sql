use w3schools;

select CustomerName, city -- 컬럼명 나열
from Customers;

select country
from Customers;

-- distinct 중복 제거
select distinct Customers.Country
from Customers;

select distinct city, country
from Customers;

-- count :레코드 수
select count(distinct city) as city
from Customers;



