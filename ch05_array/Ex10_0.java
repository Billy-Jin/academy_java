package ch05_array;

public class Ex10_0 {

	public static void main(String[] args) {
		int[] score = {100,90,10,88,99};
		int s0 = score[0];	//int s0=100;
		int s1 = score[1];	//int s1=90;
		System.out.println("s0 = "+s0); //100
		System.out.println("s1 = "+s1); //90
		
		//s0의 값과 s1의 값 교환
		
		System.out.println("변경후----------------------");
		
		int s2=s0;
		s0=s1;
		s1=s2;
		
		System.out.println("s0 = "+s0); //100
		System.out.println("s1 = "+s1); //90
		
		
	
	}

}
