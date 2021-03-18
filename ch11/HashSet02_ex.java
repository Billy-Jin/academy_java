package ch11;

import java.util.HashSet;
import java.util.Set;

import ch06.Person01;

//MemberDTO_02객체를 중복없이 Set에 저장하는 클래스
public class HashSet02_ex {

	public static void main(String[] args) {
	
		MemberDTO_02 m1 = new MemberDTO_02 ("홍길동","811123-123456");
		MemberDTO_02 m2 = new MemberDTO_02 ("김길동","820123-222222");
		//Person01(String ssn, String name)
		//Person01 p2= new Person01("810123-2222222", "김길동");
		System.out.println("m1.equals(m2)="+m1.equals(m2));
		//기준이 되는 m1이 매개변수 m2와 동일하니?
		
		
		//조상클래스명 참조변수명 = new 자손 클래스();
		/*Set<MemberDTO_02> set = new HashSet<MemberDTO_02>();
		
		set.add(new MemberDTO_02 ("홍길동","811123-123456"));
		set.add(new MemberDTO_02 ("김길동","820123-222222"));
		set.add(new MemberDTO_02 ("홍길동","811123-123456"));
		//인스턴스는 다르지만 내부 데이터가 동일하면 동일 객체로 판단되어서
		//총 객체수는 2
		
		System.out.println("총 객체수="+set.size()); //값 2개 넣었으므로 2나와야함
	*/
	}

}
