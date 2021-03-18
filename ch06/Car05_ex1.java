package ch06;

public class Car05_ex1 {

	public static void main(String[] args) {
		
		Car05 mycar=new Car05();
		//가스 충전기능
		mycar.setGas(50); 
		
		//가스충전여부 확인 기능
		boolean gasState=mycar.isLeftGas();
		if(!gasState){
		//달리기 기능 
		mycar.run(); 
		}
		if(!gasState) {
			System.out.println("가스가 충분해요");
		}else {
			System.out.println("가스를 주입하세요");
		}
	}
}
