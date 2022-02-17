use Ananiyal;

create table worker(
Id int primary key not null,
First_Name varchar(30) not null,
Last_Name varchar(30) not null,
Salary varchar(30) not null,
Joining_date datetime,
Department varchar(50) not null);

select * from worker;

insert into worker values(01, 'Peter', 'Paul', '200000', '2000-05-02 10:00:00', 'IT' );
insert into worker values(02, 'Alex', 'John', '300000', '2000-02-15 11:00:00', 'HR' );
insert into worker values(03, 'Johnny', 'Thomson', '100000', '2015-05-26 09:00:00', 'Medical' );
insert into worker values(04, 'Thomas', 'Gomes', '200000', '2003-10-02 10:00:00', 'Accounts' );
insert into worker values(05, 'Stephen', 'Costa', '400000', '2004-08-11 10:00:00', 'IT' );
insert into worker values(06, 'William', 'James', '100000', '2000-05-02 10:00:00', 'Education' );

select * from worker;