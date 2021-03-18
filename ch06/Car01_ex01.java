package ch06;

public class Car01_ex01 {

//자동차클래스를 사용하게 되느 ㄴ실해 ㅇ클래스	
	public static void main(String[] args) {
		// 자동차클래스로 부터 객체생성
		//클래스명타입 참조변수명=new 클래스명();
		
		//new키워드를 사용해서 생성되는 것은 heap영역에 저장되고
		//heap영역에 접근하려면 변수가 필요하다
		//이러한 변수를 담즌다 해서 참조변수라고 하고
		//타입부분은 heap영역에 생기는 것을 기본적으로 나타내므로 heap타입이라고도 한다
		
		//자동차클래스(Car01)로 부터 객체생성
		Car01 car01 = new Car01();//주소변수=new Car01();
		System.out.println("car01="+car01);
				
		//필드값 가져와서 출력
		System.out.println("변경 전 기본car01.color="+car01.color);
		System.out.println("car01.brand="+car01.brand);
		System.out.println("car01.maxSpeed="+car01.maxSpeed);
		System.out.println("car01.makeDate="+car01.makeDate);
		System.out.println("car01.price="+car01.price);
		System.out.println("car01.maxKGM="+car01.maxKGM);
		System.out.println("car01.speed="+car01.speed);
		System.out.println();
		
		//색상변경 
		//필드값 변경.. 객체에 접근 할때는 반드시 주소를 참조해야 한다
		//참조변수.필드명=새값; //주소지
		car01.color="Black";
		System.out.println("변경 후 기본car01.color="+car01.color);
		
		
		//메소드호출
		//메소드명();
		car01.move(); //ctrl 누르고 클릭하면 바로 감 
		car01.stop();
		
		System.out.println("-----------------------------------");
		
		Car01 car02 =new Car01();
		System.out.println("car02="+car02);
		System.out.println("car02.color="+car02.color);
		System.out.println("car02.brand="+car02.brand);
		System.out.println("car02.maxSpeed="+car02.maxSpeed);
		System.out.println("car02.makeDate="+car02.makeDate);
		System.out.println("car02.price="+car02.price);
		System.out.println("car02.maxKGM="+car02.maxKGM);
		System.out.println("car02.speed="+car02.speed);
		
	}

}
