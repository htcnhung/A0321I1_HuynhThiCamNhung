create database luyen_tap;
use luyen_tap;

  CREATE TABLE luyen_tap.benhnhan (
  idBenhNhan VARCHAR(45) NOT NULL,
  tenBenhNhan VARCHAR(45) NULL,
  PRIMARY KEY (idBenhNhan));

CREATE TABLE luyen_tap.benhan (
  idBenhAn VARCHAR(45) NOT NULL,
  idBenhNhan VARCHAR(45),
  tenBenhNhan VARCHAR(45),
  ngayNhapVien DATE ,
  ngayRaVien DATE ,
  lyDoNhapVien VARCHAR(45) ,
  PRIMARY KEY (idBenhAn),
  constraint key_1 foreign key (idBenhNhan) references benhnhan(idBenhNhan)
  );
  


  
--   drop table benhnhan;
--   alter table benhan ;
--   drop database module3_exam;
--   
--   DELIMITER //
-- CREATE PROCEDURE search_customer(
-- in customer_name VARCHAR(45)
-- )
-- BEGIN
-- 	SELECT * FROM customer WHERE customer.customer_name LIKE concat('%' ,customer_name,'%') ;
-- END//
-- DELIMITER ;
--   
--   DROP PROCEDURE search_customer;
--   
--   call search_customer ('Ba');
--   
--   DELIMITER //
-- CREATE PROCEDURE search_employee(
-- in employee_name VARCHAR(45)
-- )
-- BEGIN
-- 	SELECT * FROM employee WHERE employee.employee_name LIKE concat('%' ,employee_name,'%') ;
-- END//
-- DELIMITER ;

--   DELIMITER //
-- CREATE PROCEDURE search_service(
-- in service_name VARCHAR(45)
-- )
-- BEGIN
-- 	SELECT * FROM service WHERE service.service_name LIKE concat('%' ,service_name,'%') ;
-- END//
-- DELIMITER ;
