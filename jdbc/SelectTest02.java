package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class SelectTest02 {

	public static void main(String[] args) {
		//각종 필요한 변수선언 - 예)conn, stmt, pstmt, rs, sql
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
			String sql="SELECT empno,ename,sal,hiredate "
					+"FROM EMP "
					+" WHERE empno>=7900"
					+" ORDER BY empno desc";
			pstmt=conn.prepareStatement(sql);
			//3-2.쿼리문실행 - executeUpdate() insert,update,delete
			//				  	excuteQuery() : select
			//					excuteQuery() : ResultSet
			rs= pstmt.executeQuery();
			if(rs!=null) {//안전장치//아래 while문과 동일
			while(rs.next()) {//while이용하여 다음 문장 실행 되도록
			//4. 추가작업
			int empno = rs.getInt("EMPNO");
			String ename = rs.getString("ENAME");
			double sal = rs.getDouble("SAL");
			Date hiredate=rs.getDate("HIREDATE");
			System.out.printf("%5d %s %7.2f %s\n",empno,ename,sal,hiredate);
			}}
		}catch(Exception 객체) {/*~~~~~*/
		}finally { //5. 사용한 객체는 반납: 객체.close();
		}
	}
}
