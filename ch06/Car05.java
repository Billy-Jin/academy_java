package ch06;

public class Car05 {

	
	//field [접근제어자][속성] 데이터타입 변수명;
	int gas;
	int speed;
	
	//constructor [접근제어자] 클래스명(매개변수 리스트){}
	
	//methed [접근제어자][속성] 리턴함수 변수명(매개변수 리스트)
	void setGas(int gas) {
		this.gas=gas;
	}
	
	void setSpeed(int speed) {
		this.speed=speed;
	}
	//가스충전여부 확인 기능
	boolean isLeftGas() {
		if(gas==0){//가스가 존재하지 않음
			System.out.println("gas가 없어요.");
		return true;
		}
		
		//가스가 남아있는 경우
			System.out.println("gas가 남아있어요.");
		return false;
		//조건이 2가지 뿐이기에 if를 한번만 사용해도 됨
		
		
	}
	
	
	void run(){
		while(true) {
		if(gas>0) {
			
			
			System.out.println("달립니다(gas잔량:"+this.gas+")");	
			gas--;
			
		}else {
			System.out.println("멈춥니다(gas잔량:"+this.gas+")");	
			break;
		}
		
		}//while
		
	}//run
	
	
}
