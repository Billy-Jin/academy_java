package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteTest01 {
	public static void main(String[] args) {
		//각종 필요한 변수선언 - 예)conn, stmt, pstmt, rs, sql	
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe"; //대소문자 구분 중요
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {	
			//1.드라이버 로딩
				Class.forName(driver);
			//2.Connection객체얻기
				conn = DriverManager.getConnection(url,user,password); // null값으로 그냥 두면 에러남. 값입력 주의~!
				System.out.println("Connection 얻기 성공");
			//3-1.실행객체-	PreparedStatement객체 : conn.prepareStatement(sql);
				//			Statement객체		  :	conn.createStatement()
				String sql = "delete from emp "
							+ "where empno>8000"; 
						
				pstmt = conn.prepareStatement(sql);
			//3-2.쿼리문실행 - executeUpdate() insert,update,delete
			//					excuteUpdate()의 리턴형태는 int
			//				  	excuteQuery() : select
			//					excuteQuery() : ResultSet
			int cnt = pstmt.executeUpdate();
			System.out.println("확인용 delete 실행결과 row수="+cnt);
				
			//4. 추가작업
			if(cnt>0) {
				System.out.println("삭제되었습니다");
			}else {
				System.out.println("삭제x");
			}
			
			
		}catch(Exception e) {
			System.out.println("쿼리실행관련 에러발생="+e);
		}finally { 
			/*5. 사용한 객체는 반납: 객체.close();*/
			try {
			if(pstmt!=null) {pstmt.close();}
			if(conn!=null) {conn.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
