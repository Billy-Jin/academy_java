package ch05_array;

import java.util.Arrays;

//System.arraycopy()를 이용한 배열의 복사
//[Java의 정석]ch_배열- 슬라이드13, 교재
public class Ex07_2 {
	
	public static void main(String[] args) {
		int[] oldArr1 = {11,12,13,14,15};
		int[] newArr1 = new int[10];
		
		/*newArr1[0]= 10;		//newArr1[0]= newArr1[0];
		newArr1[1]= 11;		//newArr1[1]= newArr1[0];
		newArr1[2]= 12;		//newArr1[2]= newArr1[0];
		newArr1[3]= 13;
		newArr1[4]= 14;
		newArr1[5]= 15;*/
		
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
		/*//for 문을 이용한 배열의 복사
		for(int i = 0;i<oldArr1.length;i++) {
			newArr1[i] = oldArr1[i];
			System.out.print(newArr1[i]);
		}*/
		//System.arraycopy()를 이용하면 원본배열의 일부데이터를 원하는 새배열위치부터 넣을수 있다.
		System.arraycopy(oldArr1, 2, newArr1,5,3);
		
		System.out.println();
		System.out.println("배열복사 후의 newArr1--------");
		//Arrays클래스 java.util패키지안에 존재하면서
		//배열과 관련된 여러 기능을 제공하는 클래스이다.
		//Arrays.toString(배열명) : 파라미터로 던진 배열안의 데이터를 문자열형태로 가져온다.
		//Arrays 클래스에 대한 자세한 내용은 고재 p624참고
		System.out.println(Arrays.toString(newArr1));//[0, 0, 0, 0, 0, 13, 14, 15, 0, 0]
		
		for(int temp:newArr1) {
			System.out.print(temp+" ");
		}
		
		//arraycopy(원본배열명Object src,원본배열의 시작인덱스 번호int srcPos,
		//새배열병Object dest, 새배열명 시작인덱스 번호 int destPos,길이 int length)를 이용한 배열의 복사
		//출력결과 1 2 3 0 0 0 0 0 0 0
		/*
		System.out.println();		
		System.arraycopy(oldArr1, 0, newArr1,0,oldArr1.length);
		System.out.println("배열복사 후의 newArr1--------");
		for(int temp:newArr1) {
			System.out.print(temp+" ");
		}*/
	}

}
