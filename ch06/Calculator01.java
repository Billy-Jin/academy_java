package ch06;

//계산기 클래스
//메소드 선언
public class Calculator01 {
	//field
	
	//숫자
	//연산자(+,-,*,%)
	//=
	//

	//constructor
	
	//method
	//[접근제어자] [속성] 리턴유형 메소드명(매개변수리스트){}
	
	
	//void를 넣으면 리턴 값이 없는 메소드 
	void plus(long x, long y) {
		long result = 0 ;
		result = x + y;
		//return result;
	}
	
	//리턴값이 있는 메소드 //더하기 //void를 넣으면 리턴 값이 없는 메소드 
	int plus(int x, int y) {
		int result = 0 ;
		result = x + y;
		return result;
	
	//return은 구한결과값을 함수를 호출한 자리에 되돌려준다.
	//return 자체가 해당 함수를 종료한다 의미.
		//System.out.println("함수의 끝");//Unreachable code
	}
	
	
	void a() {
		System.out.println("a()");
		b();
	}
	void b() {
		System.out.println("b()");
	}
	//전원켜기
	void powerOn(){ //리턴유형 없으면 void
		System.out.println("powerOn()호출성공-전원을 켭니다");
	}
	
	//전원끄기
	void powerOff(){ //리턴유형 없으면 void
		System.out.println("powerOn()호출성공-전원을 끕니다");
	}
	//더하기
	/*int plus(int x,int y){
		return 100; //return 값;
	*/	
		//return x + y; //return 계산식;
	/*	int result=0;
		result = x + y;
		return result; //return 변수명;
		
	}*/
	//실수 더하기
	double plus2(double x,double y) {
		double a = x+y;
		return a;
	}
	
	
	//나누기 divide 정수2개를 받아서 첫번째 파라미터 값을 2번째 파라미터값으로 나눈 몫을 리턴하는 함수정의
	//리턴유형 함수명 (타입변수,타입변수){} //리턴유형은 리턴 했을때의 함수의 유형
	
	double divide(int x,int y){ //divide(10,2) //divide(10,3)
		double result = 0.0;
		result = x/y;
		return result;
		
		//return x / y;
	
	}
	//method overloading
	//원칙적으로 동일 클래스내 메소드명이 동일할 수 없다
	//하지만 매개변수의 타입,개서, 순서가 다르면 선언가능하다.
	double divide(int x,double y){ 
		double result = 0.0;
		result = x/y;
		return result;
	}
	
	//method overloading
	//앞에서 선언한 divide와는 매개변수의 순서가 다르다
	double divide(double y, int x) {
		double result = 0.0;
		result = x/y;
		return result;
	}
	
	
}
