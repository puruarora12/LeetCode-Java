# Write your MySQL query statement below
 select t.request_at as Day, 
 Round(SUM(t.cancelled_driver + t.cancelled_client)/SUM(t.total_trips),2) as "Cancellation Rate"
 from 
 (select * , count(*) as total_trips, 
 sum(status='cancelled_by_driver') as cancelled_driver , 
 sum(status="cancelled_by_client") as cancelled_client 
 from Trips t where request_at between '2013-10-01' and  '2013-10-03' 
 group by request_at, client_id, driver_id   ) as t 
  join Users u on t.driver_id = u.users_id and u.banned = 'No' 
  join Users uu on t.client_id =uu.users_id and uu.banned= 'No'
 group by t.request_at;
 
