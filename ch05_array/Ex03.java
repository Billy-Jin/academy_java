package ch05_array;

//배열변수 생성과 값 할당
//방법1. 생성 후 값을 할당
//방법2. 생성하면서  값을 할당
public class Ex03 {

	public static void main(String[] args) {
		//방법1. 생성 후 값을 할당
		int[] nums = new int[3]; // 생성
		nums[0] = 10;//배열nums의 인덱스번호 0에 10을 할당
		nums[1] = 20;//배열nums의 인덱스번호 1에 20을 할당
		nums[2] = 30;//배열nums의 인덱스번호 2에 30을 할당
		
		for(int num : nums) {
			System.out.println(num);
		}
		
		//방법2. 생성하면서  값을 할당
		//문법 데이터타입[] 배열변수명={초기값1,...,초기값n};
		char[] c = {'A','B','C'} ;
		//문법 데이터타입[] 배열변수명 = new 데이터타입[] {초기값1, ... ,초기값n} ; 
		//char[] c = new char[] {'A','B','C'} ; 
		//char[] c = new char[3] {'A','B','C'} ;//컴파일에러 발생
		//Cannot define(표현하다) dimension(크기) expressions()
		//when an array initializer(초기내용설정) is provided =>초기값을 제공하면서 배열크기를 명시하면x
		
		
		for(char temp : c) {
			System.out.println(temp);
		}
	}

}
