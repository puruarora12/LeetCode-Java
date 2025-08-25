# Write your MySQL query statement b
select email from Person group by email having count(email)>1;
