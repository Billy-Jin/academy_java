package ch04_if_for;
//[Java의 정석] ch4_조건문과 반복문- 22슬라이드 참고
//
public class Ex09_continue {

	public static void main(String[] args) {
		for(int i=1;i<11;i++) {
			
			if(i==5) {  //한줄이면 {}생략가능
				System.out.println("i==5일 때-continue");
				continue; //지금 진행 하던 것을 멈추고 다음 반복문을 진행해라, 0 1 2 3 4 5 6 7 8 9 10 for문 밖
				//System.out.println("====");//때문에 해당 continue 뒤에 문장은 실행 불가로 에러남
			}
				System.out.println("i="+i);
			}
			System.out.println("----------------------------");
			for(int i=1;i<11;i++) {
				
				if(i==5) {  //한줄이면 {}생략가능
					System.out.println("i==5일 때-continue");
					break; //0 1 2 3 4 5 for문 밖
				}
				System.out.println("i="+i);
		}
			
			System.out.println("for문 밖");
		
		
	}

}
