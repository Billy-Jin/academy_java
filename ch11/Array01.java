package ch11;

//배열(Array) - 하나의 변수에 여러개의 데이터를 연속적으로 모아 놓았다\
//단점 - 한가지 타입만 입력가능 및 갯수를 정해 놓아야 한다. 
public class Array01 {

		public static void main(String[] args) {
			//문자열 5개를 저장하는 배열생성
			String[] a = new String[5];
			//문자열데이터를 추가
			a[0] = "가";
			a[1] = "나";
			a[2] = "다";
			a[3] = "라";
			a[4] = "마";
					
			//데이터의 개수 조회
			System.out.println("저장된 데이터의 총개수="+a.length);
			//데이터 꺼내기(조회)
			for(int i=0;i<a.length;i++) {
				
			
			System.out.println("a["+i+"]="+a[i]);
			}
			
			//향상된 for문 이용 - 모든 데이터 꺼내기
			//for(타입 변수 : 배열명 또는 컬렉션명){}*시험 문제 나옴
			for(String i:a) {
				System.out.println(i);
			}
		
		}
}
