package ch03_operator;

// A학점 : 91~100
// B학점 : 81~90 

//3항연산자
//조건? 참값: 거짓값 -> if(조건){참값}else{거짓값}
//

public class Ex08 {

	public static void main(String[] args) {
		//임의 숫자를 score변수에 저장
		//100~91이면 A학점
		//90~81이면 B학점이라고 출력하세요
		
		
		
		float score1 = (float) Math.random()*100;
		int score2 = 80;
		System.out.println(score1);
		float i;
		
		for(i=score1; i<=50; i+=30)  {
		}
	
		if(i >=91 & i <=100) { //91<=score<=100 은 안되며, 기준되는 것을 무조건 왼쪽에 넣어야 함.
			System.out.println("당신은 A학점입니다.");
		}
		else if(i >=81 & i <=90) {
			System.out.println("당신은 B학점입니다.");
		}
		else if(i >=71 & i <81) {
			System.out.println("당신은 C학점입니다.");
		}
		else {
			System.out.println("당신은 그외입니다.");
		}
		
		String result= i >=91 & i <=100? "A학점":(i >=81 & i <=90?"B학점":(score1 >=71 & score1 <=80?"C학점":"그외")); //변수형태 변수=기존변수>=비교값:A:B //참이면 A 거짓이면 B
		System.out.println(i+"점은 "+result+"입니다.");
		
	

	}

	
	

}
