package ch07;

public abstract class Phone01 {
	//field
	public String owner;
		
	//constructor
	public Phone01(String owner) {
		this.owner = owner;
	}
	//추상메서드 body {} 몸체가 없는 메서드
	//method.. 추상클래스는 일반 method를 가질 수 있다.
	public abstract void a();//https://hangouts.google.com/call/UUMmRm-Mv6Arhs2So6ljACEM
	public void turnOn() {
		System.out.println("Phone의 전원ON");
	}
	public void turnOff() {
		System.out.println("Phone의 전원Off");
	}


}
