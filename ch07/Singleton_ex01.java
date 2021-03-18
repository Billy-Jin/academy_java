package ch07;

public class Singleton_ex01 {

	public static void main(String[] args) {
		//Singleton s = new Singleton();
		//Singleton s = getInstance();
	
		Singleton s = Singleton.getInstance();
						
		s.test();
		
	}
}
