create table contacts(
contact_id int not null auto_increment,
last_name varchar(30) not null,
first_name varchar(25),	
birthday date,
constraint contacts_pk primary key (contact_id));
CREATE TABLE suppliers
( supplier_id INT NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);
drop table suppliers;
ALTER TABLE contacts
  ADD address varchar(40) 
    AFTER first_name; -- tạo cột last_name ở sau cột contact_id 
    
ALTER TABLE contacts
  ADD gender varchar(10) NOT NULL
    AFTER contact_id,
  ADD age int
    AFTER gender;
    
    ALTER TABLE contacts
  MODIFY last_name varchar(50) NULL;
  
  ALTER TABLE contacts
  DROP COLUMN age;
  
  alter table contacts
  add contact_type varchar(25)
  after first_name ;
  
  ALTER TABLE contacts
  CHANGE COLUMN contact_type ctype
    varchar(20) NOT NULL;
    
ALTER TABLE contacts
  RENAME TO people;