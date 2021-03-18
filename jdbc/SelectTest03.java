package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class SelectTest03 {

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
			String sql="SELECT mno,mname,mid,mpw,mdate "
					+"FROM MEMBER "
					+" WHERE mno>=8000"
					+" ORDER BY mno desc";
			pstmt=conn.prepareStatement(sql);
			//3-2.쿼리문실행 - executeUpdate() insert,update,delete
			//				  	excuteQuery() : select
			//					excuteQuery() : ResultSet
			rs= pstmt.executeQuery();
			if(rs!=null) {//안전장치//아래 while문과 동일
			while(rs.next()) {//while이용하여 다음 문장 실행 되도록
			//4. 추가작업
				MEMBERDTO mDTO = new MEMBERDTO();
				
				//여기에서는 member테이블의 mno컬럼의 값을 가져와서
				//MemberDTO클래스의 setmNo()메서드 파라미터로 저장하면
				//memberDTO클래스의 필드에 데이터가 세팅된다.
				mDTO.setmNo(rs.getInt("MNO"));
				mDTO.setmName(rs.getString("MNAME"));
				mDTO.setmId(rs.getString("MID"));
				mDTO.setmPw(rs.getString("MPW"));
				mDTO.setmDate(rs.getDate("MDATE"));
				System.out.println(mDTO.toString());
				//mDTO로 입력하면 주소가 온다.
				}
			}
		}catch(Exception 객체) {/*~~~~~*/
		}finally { //5. 사용한 객체는 반납: 객체.close();
		}
	}
}
