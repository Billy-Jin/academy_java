package ch11;

import java.util.ArrayList;

public class ArrayList01 {

		public static void main(String[] args) {
			ArrayList list = new ArrayList();
			ArrayList test = new ArrayList();
			
			list.add("손흥민");
			list.add("박지성");
			list.add("이영표");
			list.add("이천수");
			list.add("이운재");
			list.add("손흥민"); //중복된 데이터 추가할 수 있다=>중복 허용
			
			test.add(1);
			test.add(2);
			test.add(3);
			test.add(4);
			test.add(5);
		
			System.out.println("----------");
			

			
			//데이터의 개수 조회
			int length = list.size();
			System.out.println("저장된 객체의 총 수="+length);
			System.out.println(list);
			//데이터 꺼내기(조회) Object get(int index)
			Object obj=list.get(0);
			System.out.println("list.get(0)="+obj);//손흥민
			System.out.println("list.get(0)="+(String)obj);//손흥민
			//클래스강제형변환 : (sub클래스명)
			//참조변수의 형변환 - 교재p357참고
			System.out.println();
			
			//모든 데이터 꺼내기 ==> 입력한 순서가 유지되어 출력된다
			for(int i=0;i<list.size() ;i++) {
				System.out.println("list.get("+i+")="+(String)list.get(i));
			}
			
			//특정 인덱스에 있는 객체 삭제 : remove(index)
			list.remove(2);
			list.remove(2);			
			

			//향상된 for문 이용
			//for(타입 변수 : 배열명 또는 컬렉션명){}
			for(Object a:list) {
				
				
				System.out.println((String)a); 
				//형변환 시키는 이유는 더 작은 객체로 형변환 하기 위해서이며
				//출력시에는 안 넣어도 되나 그외에는 넣어야 함
			}
			
			//System.out.println(test.get(0)+test.get(1));
			System.out.println((int)test.get(0)+(int)test.get(1));
		}
}
/*
*List - 순서유지, 중복허용 예)대기자 목록 병원 대기자
*Set - 순서유지x, 중복허용x 예)집합, 
*Map - key,value가 한쌍으로 구성
*		순서유지x, key는 중복허용x, value은 중복허용
*
*Collection 인터페이스 - 자손 인터페이스 List, Set 
*Collections클래스랑 혼동 주의
*
*Array - 타입이 동일 해야 한다, 크기를 한번 정하면 변경이 불가능 하다
*
*/

