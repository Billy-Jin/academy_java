package ch09_util;

import java.util.StringTokenizer;

public class StringTokenizer01 {

	public static void main(String[] args) {
		//java.lang.String클래스의 split()도 동일기능이지만 리턴유형은String[]
		String str = "김좌진,이순신 서희-김구~세종대왕&장영실";
		//split(String타입의 정규식
		String[] names= str.split(",|-|~|&| ");
		//for(데이터타입 변수명 : 배열명 컬렉션명) 
		for(String name : names) {
			System.out.println(name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("----------------------------");
		String text0 = "김좌진 이순신 서희";
		//구분자를 제시하지 않으면 공백을 기준으로 나눔
		
		
		
		//방법1:for문이용
		StringTokenizer st = new StringTokenizer(text0);
		int count = st.countTokens() ;//전체 토큰수
		System.out.println("countTokens()="+count);//3
		for(int i=0;i<count;i++) {
			String token = st.nextToken();
			System.out.println(token);
			
			/* 출력결과
			 * 김좌진
			 * 이순신
				서희
			 */
		}
		System.out.println();
		
		String text = "김좌진,이순신/서희";
		
		//방법2:while문이용
		st = new StringTokenizer(text,"/");
		int count1 = st.countTokens() ;
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		/* 출력결과
		 * 김좌진,이순신
			서희
		 */
		System.out.println();
		
		
		String text1 = "김좌진,이순신/서희";
		
		// while문에 적용
		//여러개의 구분자를 같이 사용할 수 있다. 
		st = new StringTokenizer(text1,"/,");
		while(st.hasMoreElements()) {
			//nextElement()의 리턴유형이 Object이므로 String으로 강제클래스형 변환
			String token = (String)st.nextElement();
			System.out.println(token);
			
			/* 출력결과
			 * 김좌진
			 * 이순신
				서희
			 */
			
		}
	}
}
