package ch11;


//MemberDTO_02 : 회원에 대한 정보를 다루는 순수클래스
public class MemberDTO_02 {
	//field
	private String name;
	private String ssn;

	
	//constructor
	public MemberDTO_02() {}
	public MemberDTO_02(String name,String ssn){
		this.name=name;
		this.ssn=ssn;
	}
	
	//method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	//Object클래스의 equals(Object obj)는 객체 자신과 주어진 
	//객체(obj)를 비교한다. 같으면 true, 다르면 false
	//여기에서는 회원명과 주민번호가 동일하면 동일객체라고 함
	//그렇지 않으면 동일객체x
	@Override
	public boolean equals(Object obj) {
		//매개변수obj의 타입은 Object이므로.. Object를 상속받은 클래스는 다 들어올수 있다.
		//따라서 
		//매개변수obj에 들어온 value가 MemberDTO_02클래스의 객체이니? 부터 확인해야함
		//매개변수obj가 MemberDTO_02클래스의 instance이니?
		//A instanceof B : A가 B의 instance이면 true, 그렇지 않으면 false
		if(obj instanceof MemberDTO_02) {
			//MemberDTO_02 member = (MemberDTO_02)obj{//2-1비교객체가 동일한 타입이라면 기준 객체타입으로 강제타입 변환해서 특정 필드값이 동일한지 비교
			//(name==Member.name)&&(ssn==.);
					return true; //회원명과 주민번호가 동일하면 동일객체이므로 true
			//}
		}else {
		return false; //그렇지 않으면 동일객체x 이므로 false;
		}
	}
	@Override
	public int hashCode() {
		//name와 ssn값이 같으면 동일한 hashCode가 리턴
		return name.hashCode()+ssn.hashCode();
		//여기에서는 name이 String이므로 name.hashCode()는 String클래스의 hashCode()를 이용
	}
	
	/* equals(Object obj) 메소드 재정의시
	 * 1.Object타입의 매개변수 obj에는 모든 객체가 매개값으로 제공될 수 있으므로
	 * 	 instanceof 연산자를 기준 객체와 동일타입인지 먼저 확인을 해야 한다.
	 * 	 동일타입이면 true를 반환
	 * 2.비교객체가 동일한 타입이라면 기준 객체타입으로 강제타입 변환해서
	 * 	 특정 필드값이 동일한지 비교
	 */
	
}
