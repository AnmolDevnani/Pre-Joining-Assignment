select * from customers 
where id in (select id from customers where salary > 4500);

select * from customers 
where salary between 2000 AND 8000;