package ch07;

public class Computer_ex01 {

	public static void main(String[] args) {
		Calculator01 cal = new Calculator01();
		double r=10;
		
		System.out.println("원면적="+cal.areaCircle(r));
		System.out.println();
		
		Computer01 com=new Computer01();
		System.out.println("원면적="+com.areaCircle(r));
		System.out.println("---------------------");
		
		//다형성
		//원 is a 도형
		//삼각형 is a 도형
		//도형 = 원
		//도형 = 삼각형
		// Computer is a Calculator
		// Calculator = Computer
		//부모클래스 참조변수 = new 자식 클래스
		
		Calculator01 obj = new Computer01();
		System.out.println("원면적="+obj.areaCircle(r));
	}
}
