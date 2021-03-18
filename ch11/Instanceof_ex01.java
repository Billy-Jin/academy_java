package ch11;

public class Instanceof_ex01 {

	public static void main(String[] args) {
		Parent03 parentA = new Parent03();
	//	m1(parentA); //에러발생
		m2(parentA); //Child03으로 강제 형변환 실패
	}
	
	static void m1(Parent03 parent) {
		// java.lang.ClassCastException: ch11.Parent03 cannot be cast to ch11.Child03
		Child03 child=(Child03)parent;//ClassCastException발생할 가능성이 존재
		System.out.println("m1(): Child03으로 강제 형변환 성공");
	}
	static void m2(Parent03 parent) {
		if(parent instanceof Child03) { //강제형변환 하기전에 instanceof 연산자로 변환시킬 타입의 객체인지 확인해야 한다.
		Child03 child=(Child03)parent; 
		System.out.println("m2(): Child03으로 강제 형변환 성공");
		}else {
			System.out.println("m2(): Child03으로 강제 형변환 실패");
		}
	}
}	
class Parent03{ }
class Child03 extends Parent03{}	
	

