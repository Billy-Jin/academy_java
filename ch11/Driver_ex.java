package ch11;

public class Driver_ex {

	public static void main(String[] args) {
	Driver driver=new Driver();
	//driver.drive(new Vehicle());//탈것이 움직여요.
	
	//버스가 움직여요
	
	Bus bus=new Bus();
	driver.drive(bus); // = driver.drive(new Bus()); //버스가 움직여요
	//drive()메소드가 호출되면서 들어간 매개변수의 타입이 
	//자동타입변환 되었다. Vehicle vehicle- new Bus();
	//자동클래스인 Bus에서 부뫀믈래스인 Vehicle의 run()을 오버라이딩하였으므로
	//Bus의 오버라이딩된 run()이 실행되었다.
	
	//택시가 달립니다.
	
	Taxi taxi=new Taxi();
	driver.drive(taxi); // 택시가 달립니다
	//drive()메소드가 호출되면서 Vehicle vehicle=taxi;
	}

}
