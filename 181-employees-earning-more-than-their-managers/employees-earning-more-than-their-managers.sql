# Write your MySQL query statement below
select e.name as Employee from Employee m inner join employee e on m.id=e.managerId where m.salary<e.salary   ;