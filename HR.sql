describe regions;

select *
FROM regions;

select sysdate 
from dual;

select 4 * 5 
from dual;

SELECT region_name 
FROM regions; --commenti

SELECT ROWID, ROWNUM, region_name
FROM regions;

select to_date('30-NOV-2019') + 2, to_date('02-NOV-2019') - 3 
from dual;

select to_date('02-NOV-2019') - to_date('25-MAR-2019') as "How many days"
from dual;

select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000
from jobs;

select first_name || ' ' || last_name as "Employee's name"
from employees;

select first_name, last_name, 12 * salary * commission_pct
from employees;

select first_name, last_name, 12 * salary * nvl(commission_pct, 0) as "annual commission"
from employees;

select first_name, last_name, 12 * salary * nvl(commission_pct, 0)
from employees
where first_name = 'John' and last_name = 'Russell';

select count(ROWID)
from employees;

SELECT manager_id
  FROM employees;
  
  SELECT DISTINCT manager_id
  FROM employees;
  
  SELECT *
  FROM regions
  WHERE region_id != 1;
  
  SELECT *
  FROM regions
  WHERE region_id = 1;
  
  select last_name 
  from employees 
  where last_name like '_ul%';
  
   select last_name 
  from employees 
  where last_name like 'S%';
  
     select last_name 
  from employees 
  where last_name like 'S%h';
  
      select last_name 
  from employees 
  where last_name like '___';
  
  
  select * 
  from regions 
  where region_id not in (2, 3);
  
  select * 
  from regions 
  where region_id not in (2, 3, null); -- !! NOT IN(…, NULL) ? FALSE !!
  
  select * 
  from regions 
  where region_id between 2 and 3;

select * 
from employees
where salary < 3000 and employee_id > 195;

select * 
from employees
where salary > 20000 or last_name = 'King';

select * 
from employees
order by last_name;

select * 
from employees
order by last_name desc, first_name asc;--le istruzioni sql le legge da sx a dx


select  first_name, last_name, email, phone_number, hire_date 
from employees
order by last_name desc, first_name asc;


 select first_name 
  from employees 
  where first_name= 'David' or first_name= 'Peter';

select *
from employees
where department_id=60;

SELECT *
FROM employees
WHERE  department_id=30 or department_id=50;

SELECT *
from employees
where salary > 10000;

SELECT *
from employees
where (department_id=80 or department_id=50) and (salary < 4000 or salary > 15000);

SELECT *
from employees
where hire_date like '%05';

SELECT job_id
FROM employees
ORDER BY job_id asc;


SELECT *
FROM employees
where commission_pct is not null;

SELECT *
FROM employees
WHERE first_name like '%a%' or last_name like '%a%' or first_name like '%A%' or last_name like '%A%';

SELECT *
FROM departments
ORDER BY department_id asc;

SELECT street_address
FROM locations
where country_id = 'IT';

SELECT job_id, job_title
from jobs
WHERE job_title like '%Clerk';

SELECT *
from locations
where postal_code not like '0%' or postal_code is null;

select region_name 
from regions 
where region_id = 1;

select country_name 
from countries 
where region_id = 1;


select country_name, region_name
from regions, countries
where regions.region_id = countries.region_id
order by countries.country_name;

select r.region_name, c.country_name
from regions r, countries c
where r.region_id = c.region_id;

select country_name, region_name
from regions join countries -- join è “inner” per default
using(region_id)
order by 1;

select country_name, region_name
from regions natural join countries
order by 1;

select e.last_name, e.salary, j.min_salary
from employees e join jobs j
on(e.salary between j.min_salary and j.min_salary + 100)
where(e.job_id = j.job_id);

select e.last_name, e.salary, j.min_salary
from employees e, jobs j
where e.job_id = j.job_id
and e.salary between j.min_salary and j.min_salary + 100;

select first_name, department_name
from employees left outer join departments
using(department_id)
where last_name = 'Grant';

select first_name, last_name, department_name
from employees right outer join departments
using(department_id)
where department_id between 110 and 120;

SELECT first_name, last_name, department_id
FROM employees
where department_id between 110 and 120;

select first_name, last_name, department_name
from employees right outer join departments
using(department_id);
--where department_id between 110 and 120;

select first_name, last_name, job_title
from employees right outer join jobs
using(job_id);

select e.last_name, e.salary, j.min_salary, j.max_salary
from employees e, jobs j
where e.job_id = j.job_id;

--and e.salary between j.min_salary and j.min_salary + 100;

select e.first_name, e.last_name, j.country_ID
from employees e join departments k using(department_id)
join locations j using(location_id)
where  j.country_id = 'UK';

 
select e.first_name, d.department_name
FROM employees e right outer join departments d on (e.employee_id=d.manager_id);

select e.first_name, d.department_name
FROM employees e join departments d on (e.employee_id=d.manager_id);


select*
FROM departments 
where manager_id is null;

select e.first_name,e.last_name, m.first_name, m.last_name
from employees e join employees m on(e.employee_id = m.manager_id);



select initcap('a new thing') as initcap, lower('NEW') low, upper('old') up 
from dual;

select length('name'), length(42000)+20 
from dual;

select employee_id, nvl(commission_pct, 0)
from employees;

select employee_id, nvl2(commission_pct, 'value', 'no value') 
from employees;


select replace('Begin here', 'Begin', 'End'), substr('ABCDEFG',3,4) 
from dual;



select abs(10), abs(-10), ceil(5.8), ceil(-5.2), floor(5.8), floor(-5.2), mod(8, 3), mod(8, 4),
power(2, 1), power(2, 3), exp(1), sqrt(25), sqrt(5), log(10, 100), ln(exp(1)),
round(5.75), round(5.75, 1), round(5.75, -1), trunc(5.75), trunc(5.75, 1), trunc(5.75, -1)
from dual;

select to_char(12345.67), to_char(12345.67, '99,999.99'),
to_char(2019, 'RN'), to_number('970,13') * 2,
cast('05-APR-19' as date) + 2, cast(12345.678 as number(10,2))
from dual;

select add_months(sysdate, 3), months_between(sysdate, '01-FEB-2019'),
last_day(sysdate), next_day(sysdate, 'lun'),
round(sysdate, 'year'), round(sysdate, 'month'),
trunc(sysdate, 'year'), trunc(sysdate, 'month')
from dual;

select*
FROM employees
where trunc(hire_date, 'year') = '01-GEN-05';

select first_name, last_name
from employees
where regexp_like(last_name, '[Aa].*') or regexp_like(first_name, '[Aa].*');


select job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000
from jobs;

select first_name, last_name, salary, salary + (8.5*salary)/100, 
(salary + (8.5*salary)/100) - salary
FROM employees;

select first_name, months_between(sysdate, hire_date)
from employees;

select first_name, employee_id, nvl(to_char(commission_pct), 'no value') 
from employees;


select employee_id, nvl2(commission_pct, 'value', 'no value') 
from employees;

select first_name, employee_id, nvl(to_char(salary), '*') 
from employees;

select replace(replace(to_char(salary),1,'*'),0, '*')
from employees;