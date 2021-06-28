drop database BusReservationSystem;
create database BusReservationSystem;
USE BusReservationSystem;

CREATE TABLE Bus (BusNo varchar(10) primary key, BusSource varchar(20), Destination varchar (20));
insert into Bus values('TS01', 'Hyderabad', 'Vijayawada'), ('TS02', 'Delhi', 'Vijayawada'), ('TS03', 'Vijayawada', 'vizag'), ('TS04', 'Hyderabad', 'Rajahmundry');
update Bus set BusSource = "Kazipet" where BusNo = 'TS02';
alter TABLE Bus add Driv_name varchar(15);
Select * from Bus;

CREATE TABLE Passenger(P_No int primary key, P_Name varchar (15), P_Age int ,P_Sex Char(6), P_seatno int, P_mobileno varchar(20));
insert into Passenger values(1207, 'Nikhitha', 19, 'Female', 1, '9390888959'), (1216, 'Pooja', 20, 'Female', 2, '93918888959'), (1218, 'Pavithra', 23, 'Female', 3, '9396888959'), (1246, 'Meghana', 32, 'Female', 4, '9000888959');
update Passenger set P_Name = 'Nikhitha Jilla' where P_No = 1207;
alter table Passenger modify P_Name varchar(25);
alter table Passenger drop P_seatno;
select * from Passenger;

CREATE TABLE Ticket(Ticket_No int Primary Key, Journey_date Date, Age int, Sex char(6), T_Source Varchar(10), Arrival_time varchar(6), Destination Varchar(10), Dept_time varchar(6));
insert into Ticket values(1, '2021-05-12', 35, 'F', 'HYD', '8:35', 'VIZ', '6:05'), (2, '2021-06-15', 45, 'M', 'SEC', '6:35', 'KHM', '8:40');
update Ticket set Destination = 'Warangal' where Ticket_No = 1;
delete from Ticket where Ticket_No = 1;
select * from Ticket;

CREATE TABLE Reservation(PNo int, foreign key(PNo) references passenger(P_No),Journey_date date, No_of_seats int, Address Varchar(40),Contact_No int,Status Char(2));
insert into Reservation values(1207, '2021-05-12', 2, 'gandhi nagar', 89765, 'R'), (1216, '2021-06-15', 2, 'Dilsukh nagar', 89432, 'R');
select * from Reservation;

show tables;