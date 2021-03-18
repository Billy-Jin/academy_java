package ch04_if_for;

//조건문
/* 90점 이상 A등금
 *  80점 이상 B등급
 *  70점 이상 C등급
 *  60점 이상 D등급
 *  60점 미만 F등급 출력
 */

/*Math.random() : 0.0이상 1.0미만의 난수발생
 * Returns a double value with a positive sign,
 *  greater than or equal to 0.0 and less than 1.0. 
 */
public class Ex02 {

	public static void main(String[] args) {
		// 임의 정수값을 변수에 저장
		double num = (double) Math.random();
		System.out.println("Math.random()="+num);
		System.out.println("(int)Math.random()="+(int)num);
		//0~5 0 1 2 3 4 5
		//Math.random()*(큰수-작은수+1)+작은수
		//(int)(Math.random()*(큰수-작은수+1)+작은수)
		System.out.println((int)(Math.random()*(5-0+1)+0));
		System.out.println((int)(Math.random()*(100-60+1)+60));
		System.out.println((int)(Math.random()*(100-0+1)+0));
		//전체 값 강제 형변환
		int score = (int)(Math.random()*(100-0+1)+0); 		//임의 점수값을 저장하기 위한 변수
		String grade=""; 	// 등급을 저장하기 위한 변수
//괄호 열고 닫고 직접하는 연습 필요		
	
		
			if(score >=90) {
				grade="A";
				
			}else if(score >=80) {
				grade="B";
			}else if(score >=70) {
				grade="C";
			}else if(score >=60) {
				grade="D";
			}else {
				grade="F";
			}
			System.out.println(score+"점 :"+grade+"등급");
	}
}
