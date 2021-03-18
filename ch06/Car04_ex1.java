package ch06;

public class Car04_ex1 {

	public static void main(String[] args) {

		Car04 myCar=new Car04("삼지창");
		Car04 yourCar=new Car04("국산자동차");
		
		System.out.println("myCar="+myCar);
		System.out.println("yourCar="+yourCar);		
		
		myCar.run();
		yourCar.run();
		
	}

}
