package ch06;

public class Car61 {
	//인스턴스 변수&인스턴스 메소드
	int field1;
	void method1() {}
	
	//정적 필드&메소드로 선언하세요
	static int field2;
	static void method2() {}
	
	//정적 블록
	static{
		 int field3=10;
		 String str;
		 method2();
		 //method1();//컴파일에러.Cannot make a static reference to the non-static method method1() from the type Car61
		 //field1 = 100;//컴파일에러.Cannot make a static reference to the non-static
		 //this.field1=100;//컴파일 에러. Cannot use this in a static context
	}
	//정적메소드 선언
	static void yayaya() {
		//field1 = 100;
		//this.field1 = 100;
		//method1();
		field2 = 100;
		method2();
		
		//but 가능하게 코드를 작성하세요
		//new로 변경
		Car61 c61= new Car61();
		
		c61.field1 = 100; 
		
		c61.method1();
	}
	
}
