-- create database case_study_3_database;
-- drop database case_study_3_database;
create table customer_type(
customer_type_id int not null auto_increment primary key,
customer_type_name varchar(45));

create table customers(
customer_id int not null auto_increment primary key,
customer_type_id int,
constraint customers_pk foreign key(customer_type_id) references customer_type(customer_type_id),
customer_name varchar(45),
birthday date not null,
customer_identity_card_number varchar(45),
phone_number varchar(45),
mail varchar(45),
address varchar(45));

create table employee_position(
position_id int not null auto_increment primary key,
position_name varchar(45));

create table employee_level(
level_id int not null auto_increment primary key,
level_name varchar(45));

create table employee_department(
department_id int not null auto_increment primary key,
department_name varchar(45));

create table employees(
employee_id int not null auto_increment primary key,
employee_name varchar(45) not null,
position_id int not null,
level_id int not null,
department_id int not null,
employee_birthday date not null,	
employee_identity_card_number varchar(45),
salary varchar(45),
phone_number varchar(45),
email varchar(45),
address varchar(45),
constraint employees_pk_1 foreign key(position_id) references employee_position(position_id),
constraint employees_pk_2 foreign key(level_id) references employee_level(level_id),
constraint employees_pk_3 foreign key(department_id) references employee_department(department_id));

create table service_type(
service_type_id int not null auto_increment primary key,
service_name varchar(45) not null);

create table rent_type(
rent_type_id int not null auto_increment primary key,
rent_type_name varchar(45) not null,
rente_type_price int);

create table services(
service_id int not null auto_increment primary key,
service_name varchar(45) not null,
area int,
number_of_floor int,
maximum_number_of_people varchar(45),
service_price varchar(45),
rent_type_id int not null,
service_type_id int not null,
service_status varchar(45),
constraint services_pk_1 foreign key(rent_type_id) references rent_type(rent_type_id),
constraint services_pk_2 foreign key(service_type_id) references service_type(service_type_id));

create table ancillary_services(
ancillary_services_id int not null auto_increment primary key,
ancillary_services_fee varchar(45) not null,
ancillary_services_unit int,
ancillary_services_status varchar(45));

create table contracts(
contract_id int not null auto_increment primary key,
employee_id int not null,
customer_id int not null,
service_id int not null,
contract_create_date date,
contract_end_date date,
deposit int,
total_amount int,
constraint contracts_pk_1 foreign key(employee_id) references employees(employee_id),
constraint contracts_pk_2 foreign key(customer_id) references customers(customer_id),
constraint contracts_pk_3 foreign key(service_id) references services(service_id));

create table contract_details(
contract_details_id int not null auto_increment primary key,
contract_id int not null,
ancillary_services_id int not null,
quantity int,
constraint contract_details_pk_1 foreign key(contract_id) references contracts(contract_id),
constraint contract_details_pk_2 foreign key(ancillary_services_id) references ancillary_services(ancillary_services_id)
);






