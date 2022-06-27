-- Joins

-- cross join
select * from customers cross join orders;

-- inner join
select * from customers inner join orders on customers.id = orders.customer_id ;

-- outer join
select * from customers left outer join orders on customers.id = orders.customer_id;

-- natural join
select * from customers natural join orders;

-- union
SELECT  CUSTOMERS.ID, NAME, AMOUNT, DATE
   FROM CUSTOMERS
   LEFT JOIN ORDERS
   ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID
UNION
   SELECT  CUSTOMERS.ID, NAME, AMOUNT, DATE
   FROM CUSTOMERS
   RIGHT JOIN ORDERS
   ON CUSTOMERS.ID = ORDERS.CUSTOMER_ID;