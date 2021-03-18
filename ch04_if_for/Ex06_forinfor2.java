package ch04_if_for;

public class Ex06_forinfor2 {

	public static void main(String[] args) {
	
		for(int i=0;i<5;i++) {
		
				for(int j=0;j<3;j++) {
					//System.out.print("\t["+i+" , "+j+"]");
					//printf: 가변인자를 가지고 있는 메소드
					System.out.printf("[%d , %d]\t%s",i,j,"님");//%d 정수형 숫자,%s문자
		
				}//내부 for 문
		System.out.println();
			}//외부 for문
	}
}
