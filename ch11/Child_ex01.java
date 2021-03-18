package ch11;



public class Child_ex01 {

	public static void main(String[] args) {
		
		Child01 child= new Child01();
		
		Parent01 parent=child;//
		//parent변수가 자식객체(child)를 참조하지만 
		parent.m1();
		
		//예외적으로 자식클래스에서 메소드가 오버라이딩되었다면
		//자식클래스의 메소드가 (부모클래스에 선언된 메소드
		parent.m2();//자식클래스 Child01에서 오버라이딩
		
		//parent.m3();//컴파일에러 자식클래스에서 선언한 변수이므로 안된다.
					//The method m3() is undefined for the type Parent01
		GrandChild01 grandChild = new GrandChild01();
		parent = grandChild;//계층추적. 자바는 단일상속만을 허용하므로 계층추적이 가능하다.
		
		parent.m1();
		parent.m2();
		//parent.m3(); Child01의 클래스로 불가
	}
}
