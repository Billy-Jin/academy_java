package ch06;

public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();//객체생성 
		//d에는 heap영역에 생성된 객체의 주소가 저장된상태
		System.out.println("d.x="+d.x); //d.x=0
		d.x=10;
		System.out.println("변경 후 d.x="+d.x);
	
		change(d.x);//static함수는 static 함수를 호출 할수 있다.
		System.out.println("한번 더 변경 후 d.x="+d.x);
	}

	//Data클래스의 인스변수 x의 값 변경
	//접근제어자 속성 리턴유형 메소드(매개체변수)
	static void change(int x) { //x=123
		x=1000;
		System.out.println("change() 호출성공 매개변수x=" + x);

	}
}
class Data{
	int x; //x=0;으로 자동초기화 //인스턴스 변수
}