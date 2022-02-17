use Ananiyal;

create table student(
Id int primary key not null,
Name varchar(30) not null,
Address varchar(50) not null );

select * from student;

insert into student values(01, 'Ananiyal', 'Kolkata');
insert into student values(02, 'Pushpa', 'Seshachalam');
insert into student values(03, 'Garuda', 'Bangalore');
insert into student values(04, 'Jaykant', 'Goa');
insert into student values(05, 'Rocky', 'Bombay');
