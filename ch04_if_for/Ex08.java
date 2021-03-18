package ch04_if_for;


//while
public class Ex08 {

	public static void main(String[] args) {
		int i = 0;
		
		while(i<5) {
			//조건만족시 반복실행코드
		System.out.println("i="+i); //?? 0 1 2 3 4
		i++; // 
		
		}
	System.out.println("while 밖");	
	System.out.println("--------------------");
	
	i=0;
	while(i<5) {
		//조건만족시 반복실행코드
	i++; 
	System.out.println("i="+i);//1 2 3 4 5
	}
	}

}
