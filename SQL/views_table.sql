create view customers_info as
select name,age from customers
where age is NOT NULL
WITH CHECK OPTION;