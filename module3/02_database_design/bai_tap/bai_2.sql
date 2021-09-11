-- create database car_shop_management_system;
-- use car_shop_management_system;
-- drop database car_shop_management_system;
create table product_line(
product_line_code varchar(50) not null primary key,
text_description text,
image varchar (255) default null);

create table products(
product_code varchar(15) not null primary key,
product_line_code varchar(50) not null,
constraint products_pk foreign key(product_line_code) references product_line(product_line_code),
product_name varchar(70) not null,
product_scale varchar(10) not null,
product_vendor text not null,
quantity_inStock  int not null,
buy_price double not null,
msrp  double not null);

create table offices(
office_code varchar(10) not null primary key,
city varchar(50) not null,
phone varchar(50) not null,
address_Line_1 varchar(50) not null,
address_Line_2 varchar(50) default null,
state varchar(50) default null,
country varchar(50) not null,
postal_code varchar(15) not null);

create table employees(
employee_number int not null auto_increment primary key,
last_name varchar(50) not null,
first_name varchar(50) not null,
email varchar(100) not null,
job_title varchar(50) not null,
report_to int default null,
office_code varchar(10) not null,	
constraint employees_pk_1 foreign key(report_to) references employees(employee_number),
constraint employees_pk foreign key(office_code) references offices(office_code));

create table customers(
customer_number int not null auto_increment primary key,
customer_name varchar(50) not null,
contact_lastName varchar(50) not null,
contact_firstName varchar(50) not null,
phone_number varchar(50) not null,
address_line_1  varchar(50) not null,
address_line_2 varchar(50) default null,
city varchar(50) not null,
state varchar(50) not null,
postal_code varchar(15) not null,
country varchar(50) not null,
credit_limit double default null,
sales_rep_employee_number int not null,
constraint customers_pk foreign key(sales_rep_employee_number) references employees(employee_number));

create table orders(
order_number int not null auto_increment primary key,
order_date date not null,
customer_number int not null,
constraint orders_pk foreign key(customer_number) references customers(customer_number),
required_date date not null,
shippedDate date default null,
`status` varchar(15) not null,
comments text default null,
quantity_ordered int not null,
price_each double not null);
 
create table order_details(
order_detail_id int not null auto_increment primary key,
order_number int not null,
constraint order_details_1_pk foreign key(order_number) references orders(order_number),
product_code varchar(15) not null,
constraint order_details_2_pk foreign key(product_code) references products(product_code));

create table payments(
customer_number int not null,
constraint payments_pk foreign key(customer_number) references customers(customer_number),
check_number varchar(50) not null,
payment_date date not null,
amount double not null);




