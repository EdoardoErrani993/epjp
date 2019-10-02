
drop table items;
create table items (

item_id integer primary key,

status char,

name varchar2(20),

coder_id integer);


drop table coders;
create table coders

as

select employee_id as coder_id, first_name, last_name, hire_date, salary

from hr.employees

where department_id = 60;


insert into coders(coder_id, first_name, last_name, hire_date, salary) 
VALUES (201, 'Maria', 'Rossi', sysdate,  5000);

insert into coders(coder_id, first_name, last_name, hire_date, salary) 
VALUES (202, 'Franco', 'Bianchi', sysdate,  4500);

update coders
set first_name ='Mariangela'
where first_name='Maria';


update coders
set salary = salary + 500
where salary < 6000;

delete 
from coders
where coder_id > 201;

select*


from coders;



--alter table items add counter number(38, 0);

--alter table items drop column counter;



--alter table items add constraint items_status_ck check(status in ('A', 'B', 'X'));

--alter table coders add constraint coders_name_uq unique(first_name, last_name);



--alter table items modify name constraint items_name_nn not null;





--alter table coders add constraint coders_pk primary key(coder_id);



--alter table items drop constraint items_name_nn;
---------------------------------------------------------------
drop table trainees;
drop table courses;
drop sequence c_seq;
drop sequence t_seq;

create table courses(
    course_id integer
        constraint course_pk primary key,
    course_name varchar2(20)
        constraint course_name_nn not null,
        
    prof_name varchar2(20)
        constraint prof_name_nn not null,
        
    uni_name varchar2(20)
        constraint uni_name_nn not null);
        
        create sequence c_seq start with 200 increment by 2;

insert into courses(course_id, course_name, prof_name, uni_name) 
VALUES (c_seq.nextval, 'Math', 'Lercio', 'Università di Ed');

insert into courses(course_id, course_name, prof_name, uni_name) 
VALUES (c_seq.nextval, 'Music', 'Sporco', 'Università di Ed');

insert into courses(course_id, course_name, prof_name, uni_name)
VALUES (c_seq.nextval, 'Geometry', 'Marcio', 'Università di Ed');

insert into courses(course_id, course_name, prof_name, uni_name)
VALUES (c_seq.nextval, 'Physics', 'Lurido', 'Università di Ed');

insert into courses(course_id, course_name, prof_name, uni_name) 
VALUES (c_seq.nextval, 'Java', 'Putrido', 'Università di Ed');

insert into courses(course_id, course_name, prof_name, uni_name) 
VALUES (c_seq.nextval, 'Chemistry', 'Putrefatto', 'Universidad de Pueb');




create table trainees (
    trainee_id integer 
        constraint trainee_pk primary key,
    first_name varchar2(20)
        constraint first_name_nn not null,
    last_name varchar2(20)
        constraint last_name_nn not null,
    course_id integer
        constraint trainee_course_id_fk references courses(course_id)
        on delete set null,
        constraint trainee_first_n_last_n_uq unique(first_name, last_name));
--coder_id integer
create sequence t_seq start with 1 increment by 100;

INSERT INTO trainees(trainee_id, first_name, last_name, course_id) 
VALUES (t_seq.nextval, 'Edoardo', 'Errani', null);

INSERT INTO trainees(trainee_id, first_name, last_name, course_id) 
VALUES (t_seq.nextval, 'Marco', 'Pancaldi', (select course_id from courses where course_name = 'Math'));

INSERT INTO trainees(trainee_id, first_name, last_name, course_id) 
VALUES (t_seq.nextval, 'Giovanni', 'Zanini', (select course_id from courses where course_name = 'Music'));

INSERT INTO trainees(trainee_id, first_name, last_name, course_id) 
VALUES (t_seq.nextval, 'Enrico', 'Prosperi', (select course_id from courses where course_name = 'Geometry'));

INSERT INTO trainees(trainee_id, first_name, last_name, course_id) 
VALUES (t_seq.nextval, 'Alessandro', 'Gazzotti', (select course_id from courses where course_name = 'Physics'));

INSERT INTO trainees(trainee_id, first_name, last_name, course_id)
VALUES (t_seq.nextval, 'Elias', 'Romano', (select course_id from courses where course_name = 'Java'));

INSERT INTO trainees(trainee_id, first_name, last_name, course_id) 
VALUES (t_seq.nextval, 'Luca', 'Pozzati', (select course_id from courses where course_name = 'Chemistry'));

select t.first_name, t.last_name, c.course_name, c.prof_name, c.uni_name
from trainees t join courses c using (course_id);

--constraint course_name_uq unique)

--alter table trainees add constraint trainees_course_id_fk course_id references 
--courses(course_id) on delete set null;

drop view fl_n_ph_employee_view;

--create or replace view fl_n_ph_employee_view as
    select first_name, last_name, phone_number 
    from HR.employees
    where employee_id not in (select nvl (manager_id,0) from hr.employees);

    --with read only;

declare
cursor v_employee_cursor is
select first_name, last_name, phone_number 
from HR.employees
where first_name like ('A%') OR last_name like ('A%') 
order by 1;
begin
for v_cur in v_employee_cursor loop
dbms_output.put_line(
'[' || v_cur.first_name || ', ' || v_cur.last_name || ', ' || v_cur.phone_number || ']');
end loop;
end;
/


create or replace procedure get_coder_salary(
p_coder_id in coders.coder_id%type,
p_salary out coders.salary%type) is
begin
select salary
into p_salary
from coders
where coder_id = p_coder_id;
end get_coder_salary;
/

declare
v_id coders.coder_id%type := 105;
v_salary coders.salary%type;
begin
get_coder_salary(v_id, v_salary);
dbms_output.put_line('Salary is ' || v_salary);
exception
when others then
dbms_output.put_line('Can''t get salary for ' || v_id);
end;
/








set serveroutput on
begin
dbms_output.put_line('Hello PL/SQL');
end;
/

declare
v_width integer;
v_height integer := 2;
v_area integer := 6;
begin
v_width := v_area / v_height;
dbms_output.put_line(
'v_width = ' || v_width);
end;
/

begin
dbms_output.put_line(1 / 0);
exception
when others then
dbms_output.put_line('Exception!');
end;
/

declare
v_a float := 9;
begin
if v_a > 0 then
dbms_output.put_line('v_a is positive');
elsif v_a = 0 then
dbms_output.put_line('v_a is zero');
else
dbms_output.put_line('v_a is negative');
end if;
end;
/


declare
v_first_name coders.first_name%type;
v_last_name coders.last_name%type;
begin
select first_name, last_name
into v_first_name, v_last_name
from coders
where coder_id = 103;
dbms_output.put_line('[' || v_first_name || ' ' || v_last_name || ']');
end;
/