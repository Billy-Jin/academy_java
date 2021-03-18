package ch06;
class Data1{
int x; //x=0;으로 자동초기화 //인스턴스 변수
}
public class ReferenceParamEx {

	public static void main(String[] args) {

		Data1 d= new Data1();//d는 heap영역에 생성된 객체의 주소가 저장된 참조변수
		
		//참조변수 안에 저장된 주소를 참조(reference)하여 해당 클래스의 필드,
		//메소드
		System.out.println("참조변수d="+d);
		d.x=10;
		System.out.println("change() 호출 전 d.x= "+d.x);
		
		change(d);
		System.out.println("change() 호출 후 d.x = " + d.x);		
	
	}
	static void change(Data1 d) {//change(참조타입 참조매개변수){//d=change}
		d.x=1000;
		System.out.println("참조변수d="+d);
		System.out.println("change()호출성공 참조매개변수 d.x = "+d.x);
	}
	
}
