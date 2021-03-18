package ch07;

//상속
//조상클래스가 자동으로 호출된다
//
public class Ex03 {

	public static void main(String[] args) {
		Son03 s = new Son03(123);
		
		
		
	}
}
class GrandFather03{
	GrandFather03(){System.out.println("GrandFather03의 기본생성자");};
};

class Father03 extends GrandFather03{
	String name;
	String ssn;
	Father03() {System.out.println("Father03의 기본생성자");}
	Father03(int a) {System.out.println("Father03의 int1개 생성자");}
	Father03(double a){System.out.println("Father03의 double생성자");}
	}
	class Son03 extends Father03{
	Son03() {
		super(100);
		System.out.println("Son03의 기본생성자");
		//super();//컴파일에러
		//Constructor call must be the first statement in a constructor
	}
	Son03(int x){
		super(x);
		System.out.println("Son03의 int x 생성자");
	}
	
}