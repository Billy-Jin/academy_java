package ch04_if_for;

/*if(조건 i 와 5가 동일)
 * 	반복문종료// 빠져나와라
 */


public class Ex09_do_while2 {

	public static void main(String[] args) {
		
		int i=1;
		do {
			
			System.out.println("i="+i);

		if(i==5) {
			break;
		}
		i++; // ++을 뒤에다 써야 한다.
		}while(i<11); // 조건 충족하지 않아도 1번은 실행된다.
		System.out.println("do while문 밖");

	}

}
