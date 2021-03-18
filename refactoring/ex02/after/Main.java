package refactoring.ex02.after;

import refactoring.ex01.PuppyRobot;

public class Main {

	public static void main(String[] args) {
		Puppybot puppy = new Puppybot("Darong"); 
		puppy.order(Puppybot.ORDER_EATS); //먹이를 먹는다
		puppy.order(Puppybot.ORDER_STOP); //동작을 멈춘다
		puppy.order(Puppybot.ORDER_JUMP); //점프를 한다
		puppy.order(12);
	}

}
