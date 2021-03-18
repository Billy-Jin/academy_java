package ch04_if_for;

public class Ex09 {

/*do while 문
 * 
 * do{
 *  //반복실행코드
 * }while(조건);	
 */
	
	
	public static void main(String[] args) {
		
		int i=0;
		do {
			i++;
			System.out.println("i="+i);
			
		}while(i<5); // 조건 충족하지 않아도 1번은 실행된다.
		

	}

}
