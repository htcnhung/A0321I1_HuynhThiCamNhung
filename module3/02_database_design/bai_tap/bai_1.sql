create database bank_database;
create table customers(
customer_number int not null auto_increment primary key,
fullname varchar(50) not null,
address varchar (255) not null,
email VARCHAR(255) not null,
phone int (10));

create table accounts(
account_number int not null auto_increment primary key,
customer_number int not null,
constraint accounts_pk foreign key(customer_number) references customers(customer_number),
account_type  varchar(50) not null,
acount_date date not null,
balance double not null);

create table transactions(
tran_number int not null auto_increment primary key,
account_number int not null,
constraint transactions_pk foreign key(account_number) references accounts(account_number),
transaction_date date not null,
amounts  double not null);


