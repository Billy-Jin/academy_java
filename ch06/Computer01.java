package ch06;

//매개변수의 개수를 모를 때

public class Computer01 {

	//field [][속성]
	
	//constructor
	
	//method [접근제한자][속성] 리턴함수 메소드명(타입[] 매개변수명){}
	
	int sum(int[] values) { //1,2,3
		
		int result = 0;//결과를 저장하는 변수선언
		//매개변수에 입력된 데이터를 이용 더하기 계산 //데이터를 입력받기 input
		//구현~~
		//결과출력 output
		
		for(int i=0;i<values.length;i++) {
			result += values[i]; //0+1
			}
		return result;
		}
		//접근제어자	속성 	리턴유형 	메소드명(타입··· 매개변수){}
		int sum1(int ... values ) {
			int result = 0;//결과를 저장하는 변수선언
			//매개변수에 입력된 데이터를 이용 더하기 계산 //데이터를 입력받기 input
			//구현~~
			//결과출력 output
			
			for(int i=0;i<values.length;i++) {
				result += values[i]; //0+1
			}
			return result;
		}
		
	
	
}
