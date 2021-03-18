package ch06;

//Car03클래스로부터 객체를 생성하여 실행하는 클래스

public class Car03_ex01 {

	public static void main(String[] args) {
		
		Car03 c1= new Car03();
		System.out.println(c1.company);
		System.out.println("----------------------");
		
		Car03 c2= new Car03("우라칸");
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println(c2.maxSpeed);
		System.out.println("----------------------");
		
		Car03 c3= new Car03("우르스","파랑색");
		System.out.println(c3.model); // 우르스
		System.out.println(c3.color); // 파랑색
		System.out.println(c3.maxSpeed); // 0
		System.out.println("----------------------");
		Car03 c4= new Car03("아벤타도르","황금색",350);
		System.out.println(c4.model);
		System.out.println(c4.color);
		System.out.println(c4.maxSpeed);
	}

}
