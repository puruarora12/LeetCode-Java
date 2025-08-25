# Write your MySQL query statement below
select today.id as Id from Weather today join Weather yesterday on  datediff(today.recordDate, yesterday.recordDate)=1 and today.temperature>yesterday.temperature; 
