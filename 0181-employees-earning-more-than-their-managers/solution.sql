# Write your MySQL query statement below
select name as Employee from Employee a where salary>(select salary from Employee b where b.id = a.managerId )
