drop database ex7;
create database ex7;
use ex7;

create table student(htnum int primary key, name char(10), cgpa real);
insert into student values (1, 'Nikhitha', 8.2), (2, 'Chandana', 9), (3, 'Siri', 8.7), (4, 'Vinnesha', 9.5);

select * from student;

select min(cgpa) as MINIMUM_CGPA from student;
select max(cgpa) as MAXIMUM_CGPA from student;
select avg(cgpa) as AVERAGE_CGPA from student;
select sum(cgpa) as TOTAL_CGPA from student;
select count(*) from student;

select * from student where cgpa<(select max(cgpa) from student);
select count(*) from student where cgpa<(select avg(cgpa) from student);

select * from student order by cgpa desc;