package refactoring.ex02.after2;

import refactoring.ex01.PuppyRobot;

public class Main {

	public static void main(String[] args) {
		Puppybot puppy = new Puppybot("Darong"); 
		puppy.order(Puppybot.Order.EAT); //먹이를 먹는다
		puppy.order(Puppybot.Order.STOP); //동작을 멈춘다
		puppy.order(Puppybot.Order.JUMP); //점프를 한다
//		puppy.order(12);
	}

}
