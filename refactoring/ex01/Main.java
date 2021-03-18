package refactoring.ex01;

public class Main {

	public static void main(String[] args) {

		PuppyRobot puppy=new PuppyRobot("아롱이");
		PuppyRobot_refactoring pr = new PuppyRobot_refactoring("다롱이");
		
		puppy.order(0);
		puppy.order(1);
		puppy.order(2);
		puppy.order(3);
		System.out.println("-----------------------------------------------------");
		pr.order(pr.EAT);
		pr.order(pr.STOP);
		pr.order(pr.JUMP);
		pr.order(3);
		
	}

}
