package ch05_array;

//배열(Array)
/* - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
 * 
 */

/*향상된 for문을 이용하여 출력-교재p166참고
 * for( int index=0 ; index<배열의길이; index++ ){}
 * 와 같은 의미로	배열의 첫번째 요소부터 배열의 마지막 요소까지 접근한다.
 * 
 * for(데이터타입 변수명:배열명 또는 컬렉션명){
 * 반복실행코드
 * }
 */

public class Ex01 {

	public static void main(String[] args) {
		// 데이터 타입 변수명 ; 	//배열변수선언 방법1
		// 데이터타입	변수명[ ]; //배열변수선언 방법2
		//변수명 = new 데이터타입[크기]; 				//배열변수타입에 따라 자동 초기화
		
		int[] score;//선언
		score = new int[3] ;	//heap영역에 int 타입의 데이터가 들어갈 공간을 확보해줘
		int[] score2 = new int[3] ; //데이터타입에 따라 자동으로 초기화
													//heap영역의 생긴 주소지를 score변수에 할당
		System.out.println("score[0]="+score+","+score2);
		//값 출력 : 배열변수명[인덱스번호] => index번호는 0부터 1씩 증가
			
		System.out.println("score[0]="+score[0]);//score=[I@15db9742
		System.out.println("score[1]="+score[1]);
		System.out.println("score[2]="+score[2]);
		System.out.println("배열의크기 = "+score.length); //배열의 크기(길이) = 배열명.length

		for(int i=0;i<score.length;i++) { //배열의 길이를 모를때 사용가능
		System.out.println("score["+i+"]="+score[i]); 
		}
		System.out.println("향상된 for문을 이용하여 출력 - 교재p166참고");
		
		for(int j : score) { 	//score배열의 길이만큼 반복하면서
												//score[0]의 값을 가져와서 j변수에 할당
												//score[1]의 값을 가져와서 j변수에 할당
												//score[2]의 값을 가져와서 j변수에 할당
			System.out.print(j+"\t");
			System.out.println("score["+j+"]="+score[j]); 	
		}
	
	
	}	
	
}
