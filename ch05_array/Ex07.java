package ch05_array;

//배열의 복사
//-[Java의 정석]ch5_배열 - 슬라이드13, 교재 p192참고

public class Ex07 {

	public static void main(String[] args) {
		int[] oldArr1 = {1,2,3};
		int[] newArr1 = new int[10];
		newArr1[0]= 10;		//newArr1[0]= newArr1[0];
		newArr1[1]= 11;		//newArr1[1]= newArr1[0];
		newArr1[2]= 12;		//newArr1[2]= newArr1[0];
		newArr1[3]= 13;
		newArr1[4]= 14;
		newArr1[5]= 15;
		
		//배열복사 전의 oldArr1
		System.out.println("배열복사 전의 oldArr1--------");
		for(int i = 0;i<oldArr1.length;i++) {
			System.out.print(oldArr1[i]+" ");
		}
		System.out.println();
		System.out.println("배열복사 전의 newArr1--------");
		for(int i = 0;i<newArr1.length;i++) {
		//배열복사 전의 newArr1
			System.out.print(newArr1[i]+" ");
			
		}
		//for 문을 이용한 배열의 복사
		for(int i = 0;i<oldArr1.length;i++) {
			newArr1[i] = oldArr1[i];
			System.out.print(newArr1[i]);
		}
		System.out.println();
		System.out.println("배열복사 후의 newArr1--------");
		for(int temp:newArr1) {
			System.out.print(temp+" ");
		}
		
		
	}

}
