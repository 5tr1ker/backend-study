use employees;

select * from salaries;
select count(*) from salaries;

INSERT INTO buytbl (`index`, name, amount, team) VALUES
(1, 'alice', 100, 'A'),
(2, 'alice', 150, 'B'),

(3, 'bob', 200, 'A'),
(4, 'bob', 180, 'C'),

(5, 'charlie', 120, 'B'),
(6, 'charlie', 130, 'D'),

(7, 'david', 300, 'C'),
(8, 'david', 310, 'A'),

(9, 'emma', 90, 'D'),
(10, 'emma', 110, 'B'),

(11, 'frank', 220, 'A'),
(12, 'frank', 210, 'C'),

(13, 'grace', 160, 'B'),
(14, 'grace', 170, 'D'),

(15, 'henry', 400, 'A'),
(16, 'henry', 390, 'C');


select name , team from buytbl group by team, name;


WITH abc(name, amount)
AS 
(
	select name , sum(amount) from buytbl group by name
)
select * from abc;

CREATE TABLE tab_myisam(fdpk int not null, primary key (fdpk) ) engine=MyISAM;
INSERT INTO tab_myisam values (3);
CREATE TABLE tab_innodb(fdpk int not null, primary key (fdpk) ) engine=innoDB;
INSERT INTO tab_innodb values (3);

INSERT INTO tab_myisam values (1),(2),(3),(4),(5);
INSERT INTO tab_innodb values (1),(2),(3),(4),(5);

select * from tab_myisam;
select * from tab_innodb;

SELECT GET_LOCK('mylock', 2000);

SELECT GET_LOCK('mylock', 20000);
select IS_FREE_LOCK('mylock');
select RELEASE_LOCK('mylock');


select * from buytbl;

show processlist;

select * from 

update employees set birth_date=now() where emp_no=100001;

update employees set hire_date=now() where emp_no=100001;

update employees set birth_date=now() , hire_date=now() where emp_no=100001;