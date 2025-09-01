-- # Write your MySQL query statement below
--  select t.request_at as Day, t.cancelled_driver, t.cancelled_client, t.total_trips, 
--  Round(SUM(t.cancelled_driver + t.cancelled_client)/SUM(t.total_trips),2) as Cancellation_Rate
--  from 
--  (select * , count(*) as total_trips, 
--  sum(status='cancelled by_driver') as cancelled_driver , 
--  sum(status="cancelled_by_client") as cancelled_client 
--  from Trips t where request_at between '2013-10-01' and  '2013-10-03' 
--  group by request_at, client_id, driver_id   ) as t 
--   join Users u on t.driver_id = u.users_id and u.banned = 'No' 
--   join Users uu on t.client_id =uu.users_id and uu.banned= 'No'
--  group by t.request_at;
 

SELECT 
    t.request_at AS Day,
    ROUND(SUM(t.cancelled_driver + t.cancelled_client) / SUM(t.total_trips), 2) AS "Cancellation Rate"
FROM (
    SELECT 
        request_at,
        driver_id,
        client_id,
        COUNT(*) AS total_trips,
        SUM(status = 'cancelled_by_driver') AS cancelled_driver,
        SUM(status = 'cancelled_by_client') AS cancelled_client
    FROM Trips
    WHERE request_at BETWEEN '2013-10-01' AND '2013-10-03'
    GROUP BY request_at, client_id, driver_id
) t
JOIN Users u ON t.driver_id = u.users_id AND u.banned = 'No'
JOIN Users uu ON t.client_id = uu.users_id AND uu.banned = 'No'
GROUP BY t.request_at;

