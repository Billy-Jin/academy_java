package other;



public class MyClass01 {

	//field [접근제어자][속성] 데이터타입 변수[=초기값]);
	public		int pub = 10;
	protected	int pro = 20;
				int pack= 30;//defalut
	private		int pri = 40;
	//constructor [접근제어자] 클래스명([매개변수리스트]);
	
	//method [접근제어자] 리턴함수 매서드명(매개변수리스트);
	void test() {
		//아래 4개의 접근제어자의 접근이 모두 가능하다
		pub = 100;
		pro = 200;
		pack= 300;
		pri = 400;
		
		//메소드 접근 허용여부 체크
		pubMethod();
		proMethod();
		packMethod();
		priMethod();
	
	}
	
	public void pubMethod() {
		System.out.println("MyClass01의 pubMethod()다");
	}
	
	protected void proMethod() {
		System.out.println("MyClass01의 proMethod()다");
	}
	
	void packMethod() {
		System.out.println("MyClass01의 packMethod()다");
	}
	
	private void priMethod() {
		System.out.println("MyClass01의 priMethod()다");
	}
	
	
}