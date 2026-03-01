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
