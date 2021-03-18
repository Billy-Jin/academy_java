package refactoring.ex02.before;

import refactoring.ex01.PuppyRobot;

public class Main {

	public static void main(String[] args) {
		Puppybot puppy = new Puppybot("Darong"); 
		puppy.order(0); //먹이를 먹는다
		puppy.order(1); //동작을 멈춘다
		puppy.order(2); //점프를 한다
	}

}
