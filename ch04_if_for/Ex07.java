package ch04_if_for;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*System.out.println("**구구단 2단 출력**");	
		int dan=0;
		System.out.println("dan="+dan);

	for(int i = 1;i<=10;i++) {
		dan = 2;//2로 덮어 씌움
		int result = 2*i;
		System.out.println(dan+" * "+ i +" = " + result );
		}
		 for(int i=5;i>=1;i--) {
				System.out.println("i="+i);
				System.out.println("dan="+dan);
		}*/
	//1+2+3+4+5 = ? 
	int sum = 0;
	int i =0;	
	for(; ;) { //0<=0 1<=5,2<=5,3<=5 // 슬라이드 16참고 
		if(i<=5) {
			sum +=i; // sum = sum+i ; //0+0 , 0+1 = 1 , 1+2=3 3+3=6 
			System.out.println(i);
			i++;
			System.out.println(i);
			
		}else {
			System.out.println("조건만족하지 않아요");
			break;//위처럼 했을때는 브레이크 걸어야 for문 밖의 문장 출력가능
		}

	System.out.println("sum="+(sum)); //1,2,3,4,5
	
	}
	
	//System.out.println("1부터"+(i-1)+"까지 총합="+sum);
	
		
		
		
		
	}

}
