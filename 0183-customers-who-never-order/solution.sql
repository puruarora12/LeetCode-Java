# Write your MySQL query statement below
select c.name as Customers from Customers c where c.id not in (select DISTINCT customerId from Orders);

-- # Write your MySQL query statement below
-- SELECT c.name AS Customers
-- FROM Customers c
-- WHERE c.id NOT IN (
--     SELECT DISTINCT o.customerId
--     FROM Orders o
-- );

