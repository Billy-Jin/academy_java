package ch03_operator;

//문자열비교 **********
//== 주소비교
public class Ex06_star {

	
	public static void main(String[] args) {
	
		
		Ex06_star obj1 = new Ex06_star();
		Ex06_star obj2 = new Ex06_star();
		System.out.println("obj1="+obj1);//new Ex06의 주소지 형태;
		System.out.println("obj2="+obj2);//new로 저장하면 참조변수로 해당부분을 참조
		
		String str1 = "홍길동"; //new String이 정석이나, 자바에서는 간단하게 사용하기위해 생략하는게 정석임
		String str2 = "홍길동";
		String str3 = new String("홍길동"); //새로운 객체를 만듬 , 쌍둥이가 외형은 같아도 주민번호는 다른것 처럼 같아보여도 엄연히 다른 걕체
		String str4 = new String("홍길동");//Heap(힙)부분에 저장되는 번지가 다르기에 str3은 str4은 다름
		//Stack(스택) 부분에는 Heap주소로 저장되며, 비교할때는 스택부분을 비교함
		//같은 종류의 차라고 해도 차량 번호가 다르고,주인이 다르듯 둘은 다른 객체이다.

		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		
		if(str1==str2) { //조건충족하면 실행
			System.out.println("str1과 str2는 일치한다");
		}else { //if조건이 참이 아닌경우
			System.out.println("str1과 str2는 일치x");
		}
		System.out.println("---------------------------------------------");
		
		System.out.println("str3="+str3);
		System.out.println("str4="+str4);
		
		if(str3==str4) { //조건충족하면 실행//메모리주소를 비교하므로 다르다고 나옴
			System.out.println("str3과 str4는 주소가 일치한다");
		}else { //if조건이 참이 아닌경우
			System.out.println("str3과 str4는 주소가 일치x");
		}
		
		
		//문자열.equals(비교문자열) 값비교
		if(str3.equals(str4)) {//주소비교가 아닌 외형만 비교할때는 해당 함수 사용 //ex)로그인 창에서 아이디,비밀번호 비교
			System.out.println("str3과 str4는 값이 일치한다");
		}else { 
			System.out.println("str3과 str4는 값이 일치x");
		}
	}
}
