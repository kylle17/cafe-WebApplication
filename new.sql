
/* Drop Tables */

DROP TABLE Board CASCADE CONSTRAINTS;
DROP TABLE order_product CASCADE CONSTRAINTS;
DROP TABLE order_reservation CASCADE CONSTRAINTS;
DROP TABLE Payment CASCADE CONSTRAINTS;
DROP TABLE product_order CASCADE CONSTRAINTS;
DROP TABLE delivery CASCADE CONSTRAINTS;
DROP TABLE FindStore CASCADE CONSTRAINTS;
DROP TABLE MemberInfo CASCADE CONSTRAINTS;
DROP TABLE Product CASCADE CONSTRAINTS;
DROP TABLE Reservation CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Board
(
	board_num number NOT NULL,
	board_title varchar2(20) NOT NULL,
	board_author varchar2(10) NOT NULL,
	board_pw number NOT NULL,
	board_context varchar2(500) NOT NULL,
	board_imgupload varchar2(100),
	product_num number NOT NULL,
	PRIMARY KEY (board_num)
);


CREATE TABLE delivery
(
	del_num number NOT NULL UNIQUE,
	del_request_day number NOT NULL,
	del_complete_day number,
	del_place varchar2(60) NOT NULL,
	del_drivePhone number NOT NULL,
	PRIMARY KEY (del_num)
);


CREATE TABLE FindStore
(
	Store_num number NOT NULL,
	Store_name varchar2(20) NOT NULL,
	Store_Phone number,
	Store_addr varchar2(30),
	PRIMARY KEY (Store_num)
);


CREATE TABLE MemberInfo
(
	-- 아이디
	memID varchar2(10 char) NOT NULL,
	memEmail varchar2(20 char) NOT NULL UNIQUE,
	-- 비밀번호
	memPW varchar2(16 char) NOT NULL,
	-- 이름
	memNAME varchar2(10) NOT NULL,
	-- 성별
	-- 
	memGender varchar2(3) NOT NULL,
	-- 생년월일
	memBirth number NOT NULL,
	-- 휴대폰번호
	memPhone number NOT NULL,
	-- 우편번호
	memZIP number NOT NULL,
	-- 적립금
	memPoint number,
	PRIMARY KEY (memID)
);


CREATE TABLE order_product
(
	orderNum number NOT NULL,
	product_num number NOT NULL
);


CREATE TABLE order_reservation
(
	orderNum number NOT NULL,
	reservation_num number NOT NULL
);


CREATE TABLE Payment
(
	order_account number NOT NULL,
	orderNum number NOT NULL,
	-- 아이디
	memID varchar2(10 char) NOT NULL,
	pay_method varchar2(10) NOT NULL,
	pay_date number NOT NULL,
	PRIMARY KEY (order_account, orderNum, memID)
);


CREATE TABLE Product
(
	product_num number NOT NULL,
	-- 제품명
	product_name varchar2(20 char) NOT NULL,
	product_cnt number NOT NULL,
	product_price number NOT NULL,
	product_date varchar2(20) NOT NULL,
	product_kind varchar2(10 char) NOT NULL,
	product_sel_cnt number,
	product_wrt_board_cnt number,
	product_imgpath varchar2(100),
	-- 제품 상세 정보
	product_detail_info varchar2(500),
	PRIMARY KEY (product_num)
);


CREATE TABLE product_order
(
	orderNum number NOT NULL,
	order_price number NOT NULL,
	order_cnt number NOT NULL,
	order_date number NOT NULL,
	order_account number NOT NULL,
	delivery_num number NOT NULL UNIQUE,
	-- 아이디
	memID varchar2(10 char) NOT NULL,
	del_num number NOT NULL UNIQUE,
	PRIMARY KEY (orderNum)
);


CREATE TABLE Reservation
(
	reservation_num number NOT NULL,
	reservation_date number NOT NULL,
	seat_use number NOT NULL,
	seat_time number NOT NULL,
	seat_adult number,
	seat_child number,
	PRIMARY KEY (reservation_num)
);



/* Create Foreign Keys */

ALTER TABLE product_order
	ADD FOREIGN KEY (del_num)
	REFERENCES delivery (del_num)
;


ALTER TABLE Payment
	ADD FOREIGN KEY (memID)
	REFERENCES MemberInfo (memID)
;


ALTER TABLE product_order
	ADD FOREIGN KEY (memID)
	REFERENCES MemberInfo (memID)
;


ALTER TABLE Board
	ADD FOREIGN KEY (product_num)
	REFERENCES Product (product_num)
;


ALTER TABLE order_product
	ADD FOREIGN KEY (product_num)
	REFERENCES Product (product_num)
;


ALTER TABLE order_product
	ADD FOREIGN KEY (orderNum)
	REFERENCES product_order (orderNum)
;


ALTER TABLE order_reservation
	ADD FOREIGN KEY (orderNum)
	REFERENCES product_order (orderNum)
;


ALTER TABLE Payment
	ADD FOREIGN KEY (orderNum)
	REFERENCES product_order (orderNum)
;


ALTER TABLE order_reservation
	ADD FOREIGN KEY (reservation_num)
	REFERENCES Reservation (reservation_num)
;



/* Comments */

COMMENT ON COLUMN MemberInfo.memID IS '아이디';
COMMENT ON COLUMN MemberInfo.memPW IS '비밀번호';
COMMENT ON COLUMN MemberInfo.memNAME IS '이름';
COMMENT ON COLUMN MemberInfo.memGender IS '성별
';
COMMENT ON COLUMN MemberInfo.memBirth IS '생년월일';
COMMENT ON COLUMN MemberInfo.memPhone IS '휴대폰번호';
COMMENT ON COLUMN MemberInfo.memZIP IS '우편번호';
COMMENT ON COLUMN MemberInfo.memPoint IS '적립금';
COMMENT ON COLUMN Payment.memID IS '아이디';
COMMENT ON COLUMN Product.product_name IS '제품명';
COMMENT ON COLUMN Product.product_detail_info IS '제품 상세 정보';
COMMENT ON COLUMN product_order.memID IS '아이디';



