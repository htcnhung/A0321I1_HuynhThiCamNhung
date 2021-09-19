create database bai_tap;
create table student(
id int not null auto_increment primary key,
student_name varchar(45) not null,
age int,
khoa_hoc varchar(45),
so_tien double);

insert into student (student_name, age, khoa_hoc, so_tien)
values
("Hoang", 21, "CNTT", 400000),
("Viet", 19, "DTVT", 320000),
("Thanh", 18, "KTDN", 400000),
("Nhan", 19, "CK", 450000),
("Huong", 20, "TCNH", 500000),
("Huong", 20, "TCNH", 200000);

select * from student
where student_name = "Huong";

select sum(so_tien) from student
where student_name = "Huong";

select distinct * from student;