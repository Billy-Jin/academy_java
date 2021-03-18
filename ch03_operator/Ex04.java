package ch03_operator;

public class Ex04 {
//연결연산자+
//문자열과 숫자가 혼합된 +연산식은 왼쪽에서 오른쪽으로 연산이 진행이 된다. 문자열이 먼저 오면 문자화가 된다.
	public static void main(String[] args) {
		System.out.print("JDK ");
		System.out.println(8.0);
		System.out.println("JDK  " +8.0); //"JDK " +" 8.0" 8.0을 숫자가 아닌 문자로 인식

		String str = "JDK  " +3.0+5.0; //"JDK "+"3.0"+"5.0" -> "JDK 3.05.0"
		System.out.println(str);// JDK 3.05.0
		System.out.println("JDK  " +(3.0+5.0));
		System.out.println( 3.0+5.0+"JDK  ");
	}

}
