package lianxi;

import java.util.Scanner;

public class Lianxi01 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("당신의 평균점수를 입력해 주세요 :");
//		String str=sc.nextLine();
//		int n = Integer.parseInt(str); 
//		
//		char a;
//		
//		if(n>=90) {
//			a='A';
//		}else if(n>=80) {
//			a='B';
//		}else if(n>=70) {
//			a='C';
//		}else if(n>=60) {
//			a='D';
//		}else {
//			a='F';
//		}
//		
//		int b= (int)(Math.random()*6)+1;
//		
//		System.out.println(b);
//		System.out.println("당신의 등급은 " + a + "입니다");
		int[] lotto = new int[45];
		
		int a = 0;
		int b = 0;
		System.out.println(++a);
		a += 5;
		System.out.println(a);
		for(int i = 0;i<lotto.length;i++) 
			lotto[i]=i+1;
		
		
		for(int i = 0;i<6;i++) {
			b = (int)(Math.random()*45); //b=11
			a = lotto[i]; // a=> lotto[0] = 1
			System.out.println(b);
			lotto[i] = lotto[b]; //lotto[0] = 12
			lotto[b] = a;
			
			// 1~45 
			// a b c  
		}
		System.out.println("--------------------");
		
		for(int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
			
		for(int k=0;k<10;k++) {
			System.out.println(k+1);
		}
		int[] nums={10,20,30};
		for(int m:nums) {
			System.out.println(m);
		}
		double d = 234.4561;
		double result = Math.round(d*100)/100.0;
				
		System.out.println(result);
		System.out.println(Math.round(d));
		
		}
		
		

		
		
	}
}
