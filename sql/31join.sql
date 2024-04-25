use w3schools;

# join : 여러 테이블을 묶어서 조회하는 법
select *
from Products;

select *
from Categories;

select ProductName, CategoryName
from Products
         join Categories
              on Products.CategoryID = Categories.CategoryID
where ProductName = 'chais';

desc Products;
desc Categories;