package ch11;



public class Castring {
	public static void main(String[] args) {
		//자식타입->부모타입->자식타입
		Parent02 parent = new Child02(); // 자식타입 -> 부모티입//자동형변환
		parent.field="새값"; //부모클래스의 멤버에만 접근가능
		parent.m1();
		parent.m2();
		//parent.m3();//컴파일에러 The method m3() is undefined for the type Parent02
		
		//부모타입 -> 자식타입
		//자식클래스 변수=(자식클래스)parent;
		Child02 child1 = (Child02)parent;
		child1.m3();//가능
//		Child002 child1 = (Child002)parent;
//		child1.m4();//가능
		child1.field2="차일드";
		
		child1.m1();//가능 Parent02의 m1()
		child1.field="이자식이";
	}
	
}

class Parent02{
	public String field;
	public void m1() {System.out.println("Parent02의 m1()");}
	public void m2() {System.out.println("Parent02의 m2()");}
}

class Child02 extends Parent02{
	public String field2;
	public void m3() {System.out.println("Child02의 m3()");}
}

class Child002 extends Parent02{
	public String field2;
	public void m4() {System.out.println("Child002의 m4()");}
}