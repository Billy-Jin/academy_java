package ch06;

public class Calculator01_ex01 {

	public static void main(String[] args) {
		//Calculator01클래스의 객체생성 및 변수에 할당
		Calculator01 c1 = new Calculator01();
		
		c1.a();
		//계산기의 전원을 켜세요
		c1.powerOn();
		
		
		//Calculator01 클래스의 divide()호출하여
		//메소드의 리턴값을 받아 z에 저장
		double z= c1.divide(10,3);
		//int형끼리 계산이여서 소수점 이하 삭제되었으나 z가 더블형이라 3.0으로 출력
		System.out.println("z="+z);//출력

		byte x = 10;
		byte y = 90;
		int result=0; // 지역변수 선언시 초기값 넣어야함
		result=c1.plus(x, y);
		System.out.println(result);
		
		//실수 끼리의 더하기 연산 수행
		//result = (int)c1.plus2(10.9, Math.random())
		double result1 = c1.plus2(10.9, Math.random());
		
		c1.powerOff();//전원을 끄세요
	}

}
