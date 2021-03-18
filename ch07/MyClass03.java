package ch07;

import other.MyClass01;

//other.MyClass01에서 선언된 필드에 접근허용여부 체크하자

public class MyClass03 {
	void qwer() {
		MyClass01 m = new MyClass01();
		m.pub = 100;
		//m.pro = 200;//The field MyClass01.pack is not visible
		//m.pack= 300;
		//m.pri = 400;
		
		//메소드 접근 허용여부 체크
		m.pubMethod();
		//m.proMethod();
		//The method proMethod() from the type MyClass01 is not visible
		//m.packMethod();
		//The method packMethod() from the type MyClass01 is not visible
		//m.priMethod();
		//The method priMethod() from the type MyClass01 is not visible
	}
}
