package ch07;

public class Ex02 extends Object{ //extends Object숨겨져 있음

	public static void main(String[] args) {
		Father02 f= new Father02();
		Son02 s=new Son02();
		f.abc();
		s.qqq();
		s.abc();//Father02의 abc()함수야.
		//상속받은 Father02클래스의 메소드 abc()를 호출할 수 있다.
	}
}

//[접근제어자][속성]class 클래스명 [extends 부모클래스명]

final class Father022{ //final을 붙이면 더이상 자식 클래스 생성 불가
	void aaa() {
		System.out.println("Father022의 aaa()");
	}
		
}

/*class Son022 extends Father022{
	void bbb() {
		aaa();
		System.out.println("Son022의 bbb()");
	}

}*/

class Father02{
	int a= 10;
	void abc() {
		System.out.println("Father02의 abc()함수야");
	}
}

//Son02클래스는 부모클래스인 Father02의 필드와 매서드를 상속받았다.
class Son02 extends Father02{
	void qqq() {
		
		System.out.println("Son02의 qqq()함수야");
		abc();
	}
	
}