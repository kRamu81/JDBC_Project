<<<<<<< HEAD
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
=======
CREATE DATABASE jdbcConnection;
USE jdbcConnection;

CREATE TABLE student(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
email VARCHAR(100),
course VARCHAR(50)
);

INSERT INTO student(name,email,course)
VALUES ('Ramu','ramu@gmail.com','Java');

SELECT * FROM student;
>>>>>>> eb7cf24b926811bb1f07dff5ec6a6bdfb82e10f8
