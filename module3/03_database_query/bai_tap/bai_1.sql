-- create database library;

create table category(
cate_number varchar(50) not null primary key,
text_description text,
image varchar (255) default null);

create table book(
book_id varchar(15) not null primary key,
cate_number varchar(50) not null,
constraint book_pk foreign key(cate_number) references category(cate_number),
book_name varchar(70) not null,
book_author varchar(10),
quantity_inStock  int,
book_price double);

create table student(
student_id varchar(15) not null primary key,
student_name varchar(50),
address varchar(500),
mail varchar(50),
image binary);

create table borrow_order(
order_id int not null auto_increment primary key,
order_date date not null,
student_id varchar(15) not null,
constraint borrow_order_pk1 foreign key(student_id) references student(student_id),
book_id varchar(15) not null,
constraint borrow_order_pk2 foreign key(book_id) references book(book_id),
quantity_ordered int not null,
`status` varchar(15) not null,
comments text default null);

ALTER TABLE book
MODIFY COLUMN book_author varchar(250);

ALTER TABLE borrow_order
  ADD return_date date
  after order_date ;

INSERT INTO category (cate_number, text_description,mail )
VALUES
("01", "Sách ngoại văn"),
 ("02", "Tiểu thuyết"),
  ("03", "Khoa học"),
   ("04", "Lịch sử"),
    ("05", "Địa lý");
    
INSERT INTO book (book_id, cate_number,book_name, book_author, quantity_inStock,book_price)
VALUES
 ("01", "01", "Nhà giả kim", "Paulo Coelho", 10, 92000),
  ("02","03", "Vũ trụ", "Carl Sagan", 20, 200000),
   ("03","04", "Lược sử loài người", "Yuval Noah Harar", 19, 290000),
    ("04","02", "Giết con chim nhại", "Harper Lee", 25, 67000),
   ("05","02", "Cuốn theo chiều gió", "Margaret Mitchell", 10, 181000);
    
INSERT INTO student (student_id, student_name, address)
VALUES
 ("0001", "Huỳnh Thị Cẩm Nhung", "Hội An"),
 ("0002", "Trần Hồng Quyên", "Đà Nẵng"),
  ("0003", "Huỳnh Thị Yến Nhi", "Hội An"),
   ("0004", "Dương Thị Nở", "Huế"),
    ("0005", "Lê Thị Yến", "Quảng Bình");
    
INSERT INTO borrow_order (order_id, order_date, return_date, student_id,book_id,quantity_ordered,`status`)
VALUES
 ("01", "2021-03-12", null, "0001", "01", 1, "chưa trả" ),
 ("02", "2021-03-20", "2021-03-30", "0005", "03", 3, "đã trả" ),
  ("03", "2021-03-10", null, "0002", "02", 2, "chưa trả" ),
  ("04", "2021-02-12", "2021-02-15", "0003", "04", 3, "đã trả" ),
   ("05", "2021-04-02", null, "0005", "05", 1, "chưa trả" );
    
    

