# Write your MySQL query statement below
Select p.firstName, p.lastName, a.city, a.state from Person as p left join Address as a on a.personId=p.personId;
