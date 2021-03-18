package ch11;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet이용 //TreeSet이용시에는 정렬의 기준을 제시해줘야 한다.

//PersonDTO에서 재정의된 compareTo()매서드를 이용하여
//나이 순으로 정렬하는 클래스이다.
public class PersonDTO_ex {

	public static void main(String[] args) {
		//TreeSet 준비
		TreeSet<PersonDTO> ts = new TreeSet<PersonDTO>();
		
		//PersonDTO객체 추가
		//저장할 때 나이순으로 정렬됨
		ts.add(new PersonDTO("홍백",100));
		ts.add(new PersonDTO("홍일",1));
		ts.add(new PersonDTO("홍이",2));
		ts.add(new PersonDTO("홍삼",3));
		ts.add(new PersonDTO("홍상삼",33));
		
		//왼쪽 첫번째노드에서부터 오른쪽마지막 노드 반복해서 가져온다 =>오름차순 
		//참고-이진 검색트리는 부모보다 작은값을 왼쪽에, 큰값은 오른쪽에 저장한다.
		Iterator<PersonDTO> iter= ts.iterator();
		while(iter.hasNext()) {
			PersonDTO person = iter.next();
			System.out.println(person.toString());
		}
	}

}
