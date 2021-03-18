package ch03_operator;

//논리연산자 
//연산자 우선순위 산술>비교>논리>대입
// T & T => 결과 T
// F & T => 결과 F
// T && T => 결과 T
// F && T => 결과 F
//&&앞의 결과가 false이면 결과는 무조건 false이므로 뒤의 결과를 보지x =>더 효율적
//& 앞의 결과가 false이더라도 뒤의 결과를 살펴본다
public class Ex07 {

	public static void main(String[] args) {
		int charCode= 'S';
		
		if(charCode>=65 & charCode<=90) { //&&논리연산자로 비교 , &하나만하면 비트연산자로 비교 결과는 동일
			System.out.println("대문자야~");
		}
		if(charCode>=97 & charCode<=122) {
			System.out.println("소문자야~");
		}
		if(charCode>=48 & charCode<=57) {
			System.out.println("숫자야~");
		}
		
		int num = 33;
		
		if(num%2==0 | num%3==0) {
			System.out.println(num+"은 2 또는 3의 배수이군요");
		}
		
		if(num%2==0 || num%3==0) { //앞에가 True면 뒤에 볼것 없이 바로 True값 출력
			System.out.println(num+"은 2 또는 3의 배수이군요");
		}
			
			/*}else {
			System.out.println("조건만족x");
		}*/
		
	}
}
