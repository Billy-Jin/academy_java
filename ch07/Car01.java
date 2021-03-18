package ch07;

//프로그램에서 가장 중요한 요소중에 하나는 데이터이다.
/*즉 변수가 프로그램에서 핵심적인 요소가 된다.
 * 무결성 데이터를 유지할 수 있는 것이 중요하다.
 * 
 * 무결성(결점이 없는 성질)을 유지할 수 있도록
 * 접근제어자를 통해 직접적인 접근을 제한하거나
 * setter함수에서 검증코드를 추가한다.
 * 편의성 제공목적으로 getter함수에서는 필요시 변환 코드를 추가하여 제시할 수 있다.
 */

public class Car01 {

	//field [접근제어자][속성] 데이터타입 변수명[=초기값];
	private int speed;
	private boolean stop;
	
	//constructor [접근제어자] 클래스명([매개변수리스트]){}

	//method [접근제어자][속성] 리턴타입 메소드명(매개변수리스트){}
	//위에서 선언된 필드에 접근할 수 있는 메소드를 제공해줌으로서
	//필드에 함부로 접근하지 못하도록 하면서
	//해당 메소드를 통해서만 필드값을 안전하게 변경(Setter)/사용(Getter)하도록 한다.
	
	//Setter
	//[접근제어자][속성]리턴유형 set+필드명(){}
	public void setSpeed(int speed) {
		this.speed = speed; 
	}
	
	//Getter
	//[접근제어자][속성]리턴유형 get+필드명(){}
	public int getSpeed(){
		return speed; //speed앞에 this. 생략
	}
	
	public double getKMSpeed() {
		//편의성 제공
		//여기에서는 마일단위를 km단위로 환산하여 외부로 리턴하고자 한다.
		double km = speed*1.609;
		return km;		
	}
	
	//[접근제어자][속성]리턴유형 get+필드명(){}
	//필드의 타입이 boolean인 경우에는
	//Getter함수는 get으로 시작하지 않고 is로 시작하는것이 관례
	//Getter
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		//무결성 체크
		if(speed<0) { //음수값이 들어오면
		
	
		this.speed = 0; //값 초기화
		return;//메소드 강제종료
		}else {
			
		}

	}
}