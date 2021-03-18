package other;
//Myclass01에서 선언된 필드와 메소드에 접근이 가능한지 확인해 보자
public class MyClass02 {
	MyClass01 m=new MyClass01();
	
	void qqq() {
		m.pub = 100;
		m.pro = 200;
		m.pack= 300;
		//m.pri = 400;
		//pri필드는 동일클래스에서만 접근 가능. 외부클래스에서는 접근불가.
		// 컴파일에러
		//The field MyClass01.pri is not visible
		
		//메소드 접근 허용여부 체크
		m.pubMethod();
		m.proMethod();
		m.packMethod();
		//m.priMethod();
		//The method priMethod() from the type MyClass01 is not visible
	}
}
