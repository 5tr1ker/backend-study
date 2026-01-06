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
