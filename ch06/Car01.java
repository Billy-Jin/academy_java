package ch06;

import java.util.Date;

//자동차에 대한 속성(과 기능)을 가진 클래스

//클래스 - 속성(Field), 기능(method)
//byte,short,int -> 0
//double ->0.0
//String,Date같은 클래스 ->null


public class Car01 {

	
		
		//속성=>필드(field)=> 변수선언
		//[접근제한자] [속성] 데이터타입 변수명;
		//고유 데이터 //색상-빨주 red,제조사-현대 기아, 최고속력 350, 제조날짜 년월일
		String color = "white"; 	//색상
		String brand = "현대" ; 	//제조사
		int maxSpeed; 			//최고속력
		Date makeDate = new Date(); 	//제조날짜
		double maxKGM;
		int price=3000;
		
		//상태데이터
		int speed;//현재속도
		
		
		//부품 - 또 다른 클래스도 필드로 사용할 수 있다
		//(재정의 해서 사용)
		//Engine engine;
		//Tire tire;
		
		
		//기능=>method
		//움직이다 0 1 2 3 4 5
		//멈추다5 4 3 2 1 0  
		
		//void 함수명() {
		//	System.out.println("함수명()호출성공!");
		//}
		
		void move() {
			System.out.println("move()호출성공!");
		}
		
		void stop() {
			System.out.println("stop()호출성공!");
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public int getMaxSpeed() {
			return maxSpeed;
		}

		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}

		public Date getMakeDate() {
			return makeDate;
		}

		public void setMakeDate(Date makeDate) {
			this.makeDate = makeDate;
		}

		public double getMaxKGM() {
			return maxKGM;
		}

		public void setMaxKGM(double maxKGM) {
			this.maxKGM = maxKGM;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

	

}
