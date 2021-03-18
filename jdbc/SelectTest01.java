package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest01 {

	public static void main(String[] args) {
		
		
		//1.JDBC 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//2.자바응용프로그램과 JDBC연결
			String url="jdbc:oracle:thin:@localhost:1521:xe"; //대소문자 구분 중요
			String user = "scott";
			String password = "tiger";
			Connection conn = null;
			Statement stmt = null;
			String sql = null; //실행할 쿼리문을 저장할 변수 선언
			ResultSet rs = null; // 쿼리 실행 결과를 저장할 변수 
		 try {
			 conn = DriverManager.getConnection(url,user,password);
			 System.out.println("DBMS 정상접속완료");
			//3-1.쿼리실행할 객체를 생성
			  stmt=conn.createStatement();
			//3-2.쿼리실행
			  sql = "select deptno,dname,loc ";//공백주의 문장 맨뒤나, 맨앞에 공백 넣는 습관중요
			  sql +="from dept ";//절별로 나눠서 입력 +=하면 이어서 써짐
			  sql += "where deptno=99";
			  rs = stmt.executeQuery(sql);
			  
			  //콘솔출력
			  while(rs.next()) {
				  //rs.getXxx(string타입의 컬럼명):select문의 컬럼순서를 제시																						
//				  int deptno = rs.getInt("DEPTNO"); // 소문자로 써도 상관없으나, 대문자로 쓰는것을 선호
//				  String dname = rs.getString("DNAME");
//				  String loc = rs.getString("LOC");
//				  System.out.println(deptno+"\t"+dname+"\t"+loc);
				  //rs.getXxx(string타입의 컬럼명):select문의 컬럼순서를 제시	
				  int deptno = rs.getInt(1); // 여기에는 select문의 첫번째 컬럼인 DEPTNO
				  String dname = rs.getString(2);
				  String loc = rs.getString(3);
				  System.out.println(deptno+"\t"+dname+"\t"+loc);
			  }
		 } catch (SQLException e) {
			e.printStackTrace();
		 }finally {
		//4.자원반납 - 나중에 사용한 객체부터 close()
			 if(rs!=null) {
				 try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			 }
			 if(stmt!=null) {
				 try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			 }
			 if(conn!=null) {
				 try {
					 	conn.close();
				} catch (SQLException e) {
				 		e.printStackTrace();
				}
			 }//if			
			 
		 }//end of finally
	}
}

//랜덤함수//범위주고서 난수 발생하는것 써라
//스캐너클래스
//메인메소드
//코드주고 오류없이 실행되는데 그 이유를 찍어라
//코드를 빈칸주고 빈칸메꾸기 왜 그렇게 써야 하는지?
//출력값 예상및 이유
//반복문사용
//스위치문 이용해서 빈칸 메꾸기
//배열
//라운드함수
