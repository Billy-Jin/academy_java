package refactoring.ex01;

public class PuppyRobot {

	String _name;
	
	public PuppyRobot(String name){
		_name=name;
	}
	
	public void order(int order) {
		if(order==0) {
			System.out.println(_name+"로봇이 먹이를 먹어요.");
		}else if(order==1) {
			System.out.println(_name+"로봇이 동작을 멈춥니다.");
		}else if(order==2) {
			System.out.println(_name+"로봇이 점프를 합니다.");
		}else {
			System.out.println("유효한 값이 아닙니다.");
			return;
		}		
		
		
	}
	
}
