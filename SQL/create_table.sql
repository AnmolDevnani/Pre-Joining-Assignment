create table if not exists customers(
id int not null auto_increment,
name varchar(30),
age int,
address char(25),
salary decimal(18,2),
PRIMARY KEY(id)
);
