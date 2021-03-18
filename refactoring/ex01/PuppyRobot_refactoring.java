package refactoring.ex01;

public class PuppyRobot_refactoring {

	String _name;
	static final int EAT =0;
	static final int STOP =1;
	static final int JUMP =2;
	
	PuppyRobot_refactoring(String name){
		_name=name;
	}
	
	public void order(int order) {
		if(order==EAT) {
			System.out.println(_name+"로봇이 먹이를 먹어요.");
		}else if(order==STOP) {
			System.out.println(_name+"로봇이 동작을 멈춥니다.");
		}else if(order==JUMP) {
			System.out.println(_name+"로봇이 점프를 합니다.");
		}else {
			System.out.println("유효한 값이 아닙니다.");
		}		
	}
	
}
