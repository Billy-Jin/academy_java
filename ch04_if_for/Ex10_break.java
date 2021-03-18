package ch04_if_for;

//21슬라이드 참고
//break

public class Ex10_break {

	public static void main(String[] args) {
		int count=0;//횟수를 저장하기 위한 변수 선언
		while(true){//true 또는 참된 값이면 됨 
			int num=(int)(Math.random()*6)+1;
			
			System.out.println("num="+num);
			count++; // 1번 반복할 때마다 횟수가 1씩 증가
			if(num==5){ 
				
				
				break;
			}
			
	}
		//int a= count(num);
		System.out.println(count+"번 만에 while문을 빠져나왔어요");
		System.out.println("while밖");//여기서는 프로그램 종료
	}//end of main

}
