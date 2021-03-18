select * from DEPT;

select * from tab;

*delete 문법
delete from tablename 
	[where 조건];

*update 문법
update tablename set column = ''
	[where 조건];

*insert 문법
insert into tablename values('','','');

*select 문법
select columnname from tablename
	[where 조건]
	[group by 그룹기준]
	[having 그룹조건]
	[order by 정렬기준 정렬방식]
정렬방식
-오름차순(기본, asc) : 숫자-12345, 문자-abcdef, 예전->최근
-내림차순(desc)


*TABLE 생성
CREATE TABLE 테이블명(
	컬럼명 타입(크기),
	컬럼명 타입(크기) [제약조건],
	컬럼명 타입(크기) [CONSTRAINT 제약조건명 제약조건],
	컬럼명 타입(크기) [CONSTRAINT 제약조건명 제약조건 DEFAULT 기본값]
);


--DEPT 테이블에 90, IT, 서울 입력
insert into dept values(90,'IT','서울');
select * from dept;

select * from dept where deptno=90;
	
--90번 부서의 지역을 독도로 수정
update dept set loc='독도'
	where deptno=90;
	
--90번 부서 지역을 삭제
delete from dept
	where deptno=90;

--sequence생성
CREATE SEQUENCE eno_seq
START WITH 8000
INCREMENT BY 1
MAXVALUE 9999
NOCYCLE;

--sequentce사용 시퀀스명.nectval()
INSERT INTO EMP(empno,ename,sal,hiredate)
VALUES(eno_seq.nextval,'홍1',3000,SYSDATE);

SELECT empno,ename,sal,hiredate
FROM EMP
WHERE empno>=7900
ORDER BY empno desc;

update emp
SET sal=sal+100
WHERE EMPNO=8000;

DELETE FROM EMP WHERE EMPNO=8000;

SELECT empno,ename,sal,hiredate
FROM EMP
WHERE empno>=7900
ORDER BY empno desc;

CREATE SEQUENCE 시퀀스명
START WITH 시작값
INCREMENT BY 증감값
MAXVALUE 최대값
MINVALUE 최소값
CYCLE | NOCTCLE

rollback;
INSERT INTO TEST 

SELECT * 
  FROM emp 
 AS OF TIMESTAMP(SYSTIMESTAMP-INTERVAL '15' MINUTE) 
WHERE USER_ID = 'scott';
