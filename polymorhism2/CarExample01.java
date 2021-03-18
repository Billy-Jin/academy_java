package polymorhism2;

//이 클래스는 실행클래스로서 필드의 다형성을 살펴보고자 한다
public class CarExample01 {

	public static void main(String[] args) {
		//Car01클래스의 객체생성
		Car01 car =new Car01();
		
		//Car01객체의 run()을 5번 반복실행
		
		for(int i=1;i<=5;i++) {
			int problemLocation=car.run();
			
			
			if(problemLocation==1) {
				System.out.println("앞왼쪽 HankookTire로 교체");//자동타입변환
				car.tire[0] = new HankookTire("앞왼쪽",15);
			}else if(problemLocation==2) {
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.tire[1] = new KumhoTire("앞오른쪽",13);
			}else if(problemLocation==3) {
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.tire[2] = new HankookTire("앞왼쪽",15);
			}else if(problemLocation==3) {
				System.out.println("앞왼쪽 KumhoTire로 교체");
				car.tire[3] = new KumhoTire("뒤왼쪽",17);
			}
			

			
			/*switch(problemLocation) {
			
			case 1:System.out.println("앞왼쪽 HankookTire로 교체");//자동타입변환
				car.tire[0] = new HankookTire("앞왼쪽",15);
				/*부모클래스 참조변수 = new 자식클래스명();
				 * Car01 car = new HankookTire("앞왼쪽",15);
				 * Car01필드에는 Tire클래스타입의 필드 flTire선언되어있다.
				 * 따라서Car01의 필드인 flTire에 HankookTire()객체가 들어갈수 있다.
				 	car.fltire로 선언하나, Tire01 fltire로 하나 직접 호출, 참조변수 
				 	선언후 호출의 차이만 있고, 큰 차이점은 없다. 
				 */
			/*	break;
			case 2:System.out.println("앞오른쪽 KumhoTire로 교체");
				car.tire[1] = new KumhoTire("앞오른쪽",13);
				break;
			case 3:System.out.println("뒤왼쪽 HankookTire로 교체");
				car.tire[2] = new HankookTire("앞왼쪽",15);
				break;
			
			case 4:System.out.println("앞왼쪽 KumhoTire로 교체");
				car.tire[3] = new KumhoTire("뒤왼쪽",17);
				break;
			}*/
			System.out.println("-------------------");//문제없이 잘 굴러간 경우
			
		}//for
	}

}
