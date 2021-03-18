package ch06;

public class Korean_ex01 {

	public static void main(String[] args) {
		//Korean01 클래스로부터 객체생성
		Korean01 k1 =new Korean01();
		
		//필드값을 출력
		System.out.println(k1.nation);
		System.out.println(k1.age);
		
		//매개변수 1개짜리 생성자 호출
		//클래스명 변수 = new 클래스명();
		Korean01 k2=new Korean01("홍길동1");
		Korean01 k3=new Korean01(1);
		//매개변수 2개짜리 생성자 호출
		Korean01 k4=new Korean01("홍길동2","911111-1111111");
		//매개변수 3개짜리 생성자 호출
		Korean01 k5=new Korean01("홍길동3","811111-2222222",30);
		
		//k2객체의 이름개명하기 
		k2.setName("임꺽정1");
		
		
		//k2객체의 이름 가져오기
		String n=k2.getName();
		System.out.println(n);
	}

}
