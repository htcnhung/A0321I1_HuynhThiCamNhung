create database case_study_module_3;
create table customer_type(
customer_type_id int not null auto_increment primary key,
customer_type_name varchar(45));

create table customer(
customer_id int not null auto_increment primary key,
customer_type_id int,
constraint customer_pk foreign key(customer_type_id) references customer_type(customer_type_id),
customer_name varchar(45),
customer_birthday date not null,
customer_gender BIT(1),
customer_id_card varchar(45),
customer_phone varchar(45),
customer_mail varchar(45),
customer_address varchar(45));

create table `position`(
position_id int not null auto_increment primary key,
position_name varchar(45));

create table education_degree(
education_degree_id int not null auto_increment primary key,
education_degree_name varchar(45));

create table division(
division_id int not null auto_increment primary key,
division_name varchar(45));

create table role(
role_id int not null auto_increment primary key,
role_name varchar(255));

create table user(
user_name varchar(255) primary key,
password varchar(255));

create table user_role(
role_id int not null,
constraint user_role_pk_1 foreign key(role_id) references role(role_id),
user_name varchar(255) not null,
constraint user_role_pk_2 foreign key(user_name) references user(user_name));

create table employee(
employee_id int not null auto_increment primary key,
employee_name varchar(45) not null,
employee_birthday date not null,
employee_id_card varchar(45),
employee_salary double,
employee_phone_number varchar(45),
employee_email varchar(45),
employee_address varchar(45),
position_id int not null,
constraint employee_pk_1 foreign key(position_id) references `position`(position_id),
education_degree_id int not null,
constraint employee_pk_2 foreign key(education_degree_id) references education_degree(education_degree_id),
division_id int not null,
constraint employee_pk_3 foreign key(division_id) references division(division_id),
user_name varchar(255) not null,
constraint employee_pk_4 foreign key(user_name) references user(user_name));

create table service_type(
service_type_id int not null auto_increment primary key,
service_type_name varchar(45) not null);

create table rent_type(
rent_type_id int not null auto_increment primary key,
rent_type_name varchar(45) not null,
rente_type_cost double);

create table service(
service_id int not null auto_increment primary key,
service_name varchar(45) not null,
service_area int,
service_cost varchar(45),
service_max_people int,
rent_type_id int not null,
constraint service_pk_1 foreign key(rent_type_id) references rent_type(rent_type_id),
service_type_id int not null,
constraint service_pk_2 foreign key(service_type_id) references service_type(service_type_id),
standar_room varchar(45),
description_other_convenience varchar(45),
pool_area double,
number_of_floors int);

create table attach_service(
attach_service_id int not null auto_increment primary key,
attach_service_name varchar(45) not null,
attach_service_cost double,
attach_service_unit int,
attach_service_status varchar(45));

create table contract(
contract_id int not null auto_increment primary key,
contract_start_date datetime,
contract_end_date datetime,
contract_deposit double,
contract_total_money double,
employee_id int not null,
customer_id int not null,
service_id int not null,
constraint contracts_pk_1 foreign key(employee_id) references employee(employee_id),
constraint contracts_pk_2 foreign key(customer_id) references customer(customer_id),
constraint contracts_pk_3 foreign key(service_id) references service(service_id));

create table contract_detail(
contract_detail_id int not null auto_increment primary key,
contract_id int not null,
attach_service_id int not null,
quantity int,
constraint contract_details_pk_1 foreign key(contract_id) references contract(contract_id),
constraint contract_details_pk_2 foreign key(attach_service_id) references attach_service(attach_service_id)
);

DELIMITER //
CREATE PROCEDURE search_customer(
in customer_name VARCHAR(45)
)
BEGIN
	SELECT * FROM customer WHERE customer.customer_name LIKE concat('%' ,customer_name,'%') ;
END//
DELIMITER ;
  
  DROP PROCEDURE search_customer;
  
  call search_customer ('Ba');
  
  DELIMITER //
CREATE PROCEDURE search_employee(
in employee_name VARCHAR(45)
)
BEGIN
	SELECT * FROM employee WHERE employee.employee_name LIKE concat('%' ,employee_name,'%') ;
END//
DELIMITER ;

  DELIMITER //
CREATE PROCEDURE search_service(
in service_name VARCHAR(45)
)
BEGIN
	SELECT * FROM service WHERE service.service_name LIKE concat('%' ,service_name,'%') ;
END//
DELIMITER ;