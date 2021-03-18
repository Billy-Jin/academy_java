package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	
	//field
	
	//constructor
	JdbcTest(){System.out.println("JdbcTest()기본생성자야");}
	//method
	public static void main(String[] args)  {
		JdbcTest jt = new JdbcTest();
		String url="jdbc:oracle:thin:@localhost:1521:xe"; //대소문자 구분 중요
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		Statement stmt = null;
		//참조변수.필드
		//참조변수.함수();
		
		//1.JDBC 드라이버 로드
		/*JDBC 드라이버를 로드하기위해 드라이버 클래스 파일을 로드한다.
		 * 자바의 Class 클래스의 forName() 메소드를 이용하면 특정 클래스 파일을 익어 들일 수 있다.
		 */
		//mySql이면 Class.forName("com.mysql.jdbc.Driver");
		//Oracle
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}//Unhandled exception type ClassNotFoundException
		//try관련 교재p.414 예외처리
		//JDBC관련p.859 공부하고 외워야함
		
		//2.자바응용프로그램과 JDBC의 연결
		/*DriveraManager는 자바 응용프로그램을 JDBC 드라이버에 연결시켜주는 클래스이다
		 *DriverManager.getConnection() 메소드를 호출하여
		 *데이터베이스에 연결하고 Connection 객체를 반환한다.  
		 *DriverManager.getConnection(String url, String user, String password);*/
//		try {

		 conn = DriverManager.getConnection(url,user,password); // null값으로 그냥 두면 에러남. 값입력 주의~!
			System.out.println("Connection 얻기 성공");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		//3.실행할 객체를 생성
		/*자바에서 SQL문을 실행하기 위해서는 Statement 클래스*/
		//쿼리실행할 객를 생성
		//try {
			stmt=conn.createStatement();
			System.out.println("Statement 객체 생성 성공");
			stmt.executeQuery("select * from dept");
		//} catch (SQLException e) {
		//	e.printStackTrace();
		//}
		
		//try {
			//쿼리실행
			//쿼리문 주의사항, 문법, 데이터타입,;포함x,공백
//			int executeUpdate(String sql):INSERT, UPDATE,DELETE sql문을 실행하고, 
//			sql 문 실행으로 영향을 받은 행의 개수나 0을 반환
			
			//int cnt = stmt.executeQuery("INSERT INTO DEPT VALUES(90,'IT','서울')");
			//int cnt = stmt.executeUpdate("delete from DEPT where deptno=90");
			int cnt = stmt.executeUpdate("update DEPT set loc='독도'where deptno=90");
			if(cnt>0) {
				System.out.println("쿼리가 정상적으로 실행 cnt="+cnt);
			}else {
				System.out.println("쿼리가 정상적으로 x cnt="+cnt);
			}
			//다중 캐치절
			//주의할점! 	하위Excption클래스명부터 먼저 작성하고
			//			상위Excption클래스명을 작성한다.
			/*try {
					//코드
					//위험코드
					//위험코드
			}catch(하위Excption클래스명 참조변수){
			 		//예외발생 처리 코드
			}catch(상위Excption클래스명 참조변수){
			 		//예외발생 처리 코드
			}catch(Excption클래스명 참조변수){
			 		//예외발생 처리 코드	
			}finally{
						//finally 블럭에는
						//catch절에 들어가던 들어가지 않던
						//무조건 실행해야하는 코드를 작성한다.
						//코드
			}
			*/	 
					 
		}	catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드실패");
				e.printStackTrace();	
		} catch (SQLException e) {
			System.out.println("SQL 관련 에러");
			e.printStackTrace();
		}finally {		//try catch
			//자원반납을 반드시 하게 하려면 finally블럭안에 코드작성
			/* finally 블럭에는
			 * catch절에 들어가던 들어가지 않던
			 * 무조건 실행해야하는 코드를 작성한다
			 * 예)DB작업
			 */
			System.out.println("finally블럭안");
			try {
				if(stmt!=null) {
				stmt.close();//Unhandled exception type SQLException
				}
				if(conn!=null) {
					conn.close();	
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
		}	
	}//main
}//class
