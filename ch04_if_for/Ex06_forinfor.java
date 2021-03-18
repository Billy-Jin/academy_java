package ch04_if_for;

//중첩 for문 - 슬라이드 17참고

public class Ex06_forinfor {

	public static void main(String[] args) {
		//2~9출력
		//int num=0;
		
		System.out.println("구구단을 외우자~! 구구단을 외우자~!");
		
		for(int i=2;i<10;i++) {
			System.out.println("***"+i+"단***");
			//System.out.print("\t");
		//1~5
			for(int j=1;j<10;j++) {
			System.out.println(i+" * "+j+" = "+(i*j));
			
			}//내부 for 문
			//System.out.println();
		}//외부 for문
	}

}
