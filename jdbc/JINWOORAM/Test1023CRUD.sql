CREATE TABLE company(
	cno number CONSTRAINT company_cno_pk primary key,  
	cname varchar2(30) CONSTRAINT company_cname_n not null,
	ceo varchar2(30),
	tel varchar2(20),
	dam varchar2(30) 
);

INSERT INTO company VALUES(cno,cname,ceo,tel,dam);

INSERT INTO company VALUES(1,'맛있닭','김닭','111-1111','홍일');
INSERT INTO company VALUES(2,'옷피자','이치즈','222-2222','홍일');
INSERT INTO company VALUES(3,'중식','박짜장','333-3333','홍삼');
INSERT INTO company VALUES(4,'회식','최생선','444-4444','홍삼');
INSERT INTO company VALUES(5,'일식','정니폰','555-5555','홍삼');

select * from company