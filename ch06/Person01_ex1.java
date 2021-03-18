package ch06;
//Person01클래스로 부터 객체를 생성해야 실행하는 클래스
public class Person01_ex1 {

	public static void main(String[] args) {
		
		//객체생성 
		Person01 p1=new Person01("890123-1234123","홍길동");
		//Person01클래스에는 String타입 2개를 파라미터로 가진 생성자
	
		
		//필드3개의 값 출력
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		//필드3개의 값 변경
		//여기에서 nation은 변서를 선언하면서 초기값이 저장되었고,
		//여기에서 ssn은 객체를 생성하면서 생성자의 argument값으로 초기값이 저장되었으므로
		//프로그램을 실행하는 도중에 변경x
		//p1.nation="대한민국";
		//p1.ssn="890123-2345678";
		p1.name="임꺽정";
		System.out.println(p1.name);
	}
}
