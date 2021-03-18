package polymorhism;

public class HankookTire extends Tire01{
	//field
	
	//	constructor
	public HankookTire() {}
	public HankookTire(String location,int maxRotation) {
		//super() 조상클래스의 생성자를 호출, 반드시 생성자의 첫번째 라인
		super(location, maxRotation);
		
//		this.location=location;
//		this.maxRotaion=maxRotation;
	}
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation;//호출될때마다 1씩 회전수 (누적)증가
		if(accumulatedRotation<maxRotation) {//누적회전수<최대회전수:정상적으로 타이어가 roll상태
			System.out.println(location+" HankookTire수명: "+(maxRotation-accumulatedRotation));
			return true;
		}else {//누적회전수==최대회전수: 펑크났어요
			System.out.println("** "+location+" HankookTire펑크");
			return false;	
		}
		
	}
}
