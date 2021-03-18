package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
	public class Test1023 {

		public static void main(String[] arg) {	
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:xe"; //대소문자 구분 중요
			String user = "scott";
			String password = "tiger";
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
		try {	
			//1.드라이버 로딩
			Class.forName(driver);
			//2.Connection객체얻기
			conn=DriverManager.getConnection(url, user, password);
			//3-1.실행객체-PreparedStatement,Statement객체
			String sql="SELECT CNO,CNAME,CEO,TEL,DAM "
					+"FROM COMPANY ";
			pstmt=conn.prepareStatement(sql);
			//3-2.쿼리문실행 - executeUpdate() insert,update,delete
			//				  	excuteQuery() : select
			//					excuteQuery() : ResultSet
			rs= pstmt.executeQuery();
			if(rs!=null) {//안전장치//아래 while문과 동일
			while(rs.next()) {//while이용하여 다음 문장 실행 되도록
			//4. 추가작업
				Test1023DTO test = new Test1023DTO();
				
				test.setCno(rs.getInt(1));
				test.setCname(rs.getString(2));
				test.setCeo(rs.getString(3));
				test.setTel(rs.getString(4));
				test.setDam(rs.getString(5));
				System.out.println(test.toString());
				}
			}
		}catch(Exception 객체) {/*~~~~~*/
		}finally { //5. 사용한 객체는 반납: 객체.close();

		}
	}
	
}