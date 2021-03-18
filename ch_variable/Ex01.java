package ch_variable;

public class Ex01 {

// 변수선언과 초기화
// 번수란? 어떤 데이터가 저장이 되는 메모리상의 이름
	public static void main(String[] args) {
		// 커서있는 줄 line삭제 단축키 : ctrl+D
		// 변수선언 데이터타입 변수명;
		// 정수 10을 변수 value의 최값으로 저장
	
		
		// 변수에 초기값 할당 => 변수명=값;
		int value ;
		value= 10;

		// 정수 10을 변수 value1의 초기값으로 저장
		//변수를 선언하면서 초기값을 할당할 수 있다
		int value1 = 10;

		System.out.println(value + 100); //10+100
		
		//데이터타입 변수명 = value + 100;
		//System.out.println(변수명);
		//value변수값을 읽고 100과 123을 더한 연산을 한다.
		//연산의 결과를 변수 result에 할당
		int result = value + 100+123;
				System.out.println(result); //result변수의 값을 출력
	
	
	}

	
	

}
