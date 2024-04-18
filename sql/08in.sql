use w3schools;

# in  하나라도 같으면

select *
from Customers
where country = 'germany'
   or 'uk';

select *
from Customers
where country in ('germany', 'uk');

select *
from Customers
where Country in ('germany', 'uk', 'sweden', 'france');


select *
from Products
where CategoryID in (2, 3, 6);

select *
from Suppliers
where country in ('brazil', 'japan', 'italy');

select *
from Categories;

select *
from Products;
where CategoryID in (select CategoryId from Categories);
