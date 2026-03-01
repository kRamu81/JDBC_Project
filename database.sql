create database jdbcConnection;
use jdbcConnection;

create table student(
id int primary key auto_increment,
name varchar(50),
email varchar(100),
course varchar(50)
);

DESC student;

INSERT INTO student(name,email,course)
VALUES ('Ramu','ramu@gmail.com','Java');

select * from student;