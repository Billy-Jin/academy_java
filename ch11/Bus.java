package ch11;

//이 클래스의 super클래스는 Vehiche
public class Bus extends Vehicle {

	@Override
	public void run() {
		System.out.println("Bus가 움직여요");
	}
}
