drop database Employee_Details;
create database Employee_Details;
USE Employee_Details;

create TABLE Employee(ssn int primary key, emp_name varchar(15), age int default 20);
insert into Employee values(1207, 'Nikhitha', 19), (1216, 'Pooja', 20), (1218, 'Pavithra', null);
insert into Employee(ssn, emp_name) values (1246, 'Meghana');

create TABLE Student(roll_num int, Sname varchar(20), check(roll_num>0));
insert into Student values(1, 'Mrunalini');
select * from Student;
select * from Employee;

create TABLE Student1(ht_num int primary key, Sname varchar(20));
insert into Student1 values(1270, 'Chandana'), (1279, 'Vineesha'), (1293, 'Siri');

create TABLE Event(event_id int primary key, event_name varchar(15), coord_id int, foreign key(coord_id) references Student1(ht_num));
insert into Event values(101, 'Toastmasters', 1293), (102, 'dance', 1279), (103, 'singing', 1270);
select * from Event;

select * from Student1;
show tables;