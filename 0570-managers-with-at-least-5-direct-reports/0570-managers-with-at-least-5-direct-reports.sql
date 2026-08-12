# Write your MySQL query statement below
select e1.name
from employee e1
join (
    select e2.managerId
    from employee e2
    group by e2.managerId
    having count(*) >= 5
) mgr on e1.id = mgr.managerId;