drop database exp7;
create database exp7;
use exp7;

create table transport_student(htnum int primary key, name char(10), cgpa real, busnum int);
insert into transport_student values (1, 'Nikhitha', 6.2, 1), (2, 'Chandana', 7, 1), (3, 'Siri', 8.7, 3), (4, 'Meghana', 9.5, 4), (5, 'Pavithra', 9.2, 3), (6, 'Pooja', 8.1, 2);

select busnum, count(*) as student_count_bus from transport_student group by busnum;
select busnum, count(*) as merit_student_in_bus from transport_student group by busnum having avg(cgpa)>7;