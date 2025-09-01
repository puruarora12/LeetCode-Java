select d.name as Department , e.name as Employee, e.salary as Salary from
(select name, salary , departmentId, dense_rank() over (partition by departmentId order by salary desc) as rk from Employee ) e join Department d on d.id = e.departmentId where e.rk <=3;
