--회원테이블삭제
DROP TABLE MEMBER;

--회원테이블
이름,전번,ID,비번,age,email,nick
CREATE TABLE MEMBER(
	mno number(5) CONSTRAINT member_mno_pk primary key, /*회원번호*/ 
	mname varchar2(30),/*이름*/
	mid varchar2(20),/*id*/
	mpw varchar2(20),/*비번*/
	mdate date DEFAULT SYSDATE /*회원가입일*/
);

select mno,mname,mid,mpw,mdate from member;
	
--INSERT INTO MEMBER VALUES(mno,mname,mid,mpw,mdate);
INSERT INTO MEMBER VALUES(eno_seq.nextval,'홍1','hid','1234',SYSDATE);
INSERT INTO MEMBER VALUES(eno_seq.nextval,'홍2','kid','1234',SYSDATE);
INSERT INTO MEMBER VALUES(eno_seq.nextval,'홍3','qid','1234',SYSDATE);
INSERT INTO MEMBER VALUES(eno_seq.nextval,'홍4','lid','1234',SYSDATE);



UPDATE MEMBER
set mname='홍new1', mpw='111'
where mno=8002;

DELETE MEMBER WHERE mno=8002;

CREATE TABLE 테이블명(
	컬럼명 타입(크기),
	컬럼명 타입(크기) [제약조건],
	컬럼명 타입(크기) [CONSTRAINT 제약조건명 제약조건],
	컬럼명 타입(크기) [CONSTRAINT 제약조건명 제약조건 DEFAULT 기본값]
);