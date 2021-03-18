package ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet01 {
	public static void main(String[] args) {
		//HashSet set = new HashSet();
		HashSet<String> set = new HashSet<String>();
		
		set.add("손흥민");
		set.add("박지성");
		set.add("이영표");
		set.add("이천수");
		set.add("이운재");
		set.add("손흥민");
		
	
		
		//저장된 객체의 총 수 조회 Returns the number of elements in this list.
		System.out.println("저장된 객체의 총 수="+set.size());//저장딘 객체의 총 수

		
		//데이터의 개수 조회
		int length = set.size();
		System.out.println("저장된 객체의 총 수="+length);
		System.out.println(set);
		//데이터 꺼내기(조회)-List에서는 Object get(int index)
		//					-Set에서는 Iteratoriterator()
		
		
		
		System.out.println();
		//클래스강제형변환 : (sub클래스명)
		//참조변수의 형변환 - 교재p357참고
		System.out.println();
		//모든 데이터 꺼내기
		Iterator iter=set.iterator();
		while(iter.hasNext()) {//Returns true if the iteration has more elements //다음꺼 꺼낼것 있으면 참, 없으면 거짓
			Object element = iter.next(); //Object next():다음 요소(객체) 가지고와        
			System.out.println((String)element);
		}
		//향상된 for문 이용
		//for(타입 변수 : 배열명 또는 컬렉션명){}
		
		//객체삭제 remove(Object)
		set.remove("이천수"); // 순서가 랜덤이라 객체 값으로 삭제
		set.remove("이운재");
		
		
		
		for(Object a:set) {
			
			
			System.out.println((String)a); 
			//형변환 시키는 이유는 더 작은 객체로 형변환 하기 위해서이며
			//출력시에는 안 넣어도 되나 그외에는 넣어야 함
		}
		
		//모든객체 제거하고 비운다.
		set.clear();
		System.out.println("저장된 객체의 총수="+set.size());//0
		if(set.isEmpty()) System.out.println("비어있어요");//is로 시작하면 boolean 형태로 참, 거짓으로만 나누어짐
	}//set.isEmpty():Returns true if this set contains no elements
}
