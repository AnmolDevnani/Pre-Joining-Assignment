-- mysql program to take two numbers as input and output sum and difference

delimiter $$

drop procedure if exists sp1 $$

create procedure sp1(in n1 int,in n2 int, out res1 int, out res2 int)
begin
set res1 = n1 + n2;
set res2 = n1 - n2;

end $$

delimiter ;