package jdbc;

import java.util.Scanner;

public class Amugena {
	public static void main(String[] args) {
		double pi = Math.PI;
		System.out.println("pi="+pi); //3.141592653589793
		
		System.out.println(Math.round(pi)); //3
		System.out.println(Math.round(pi*100)/100.0);//100으로 하면 정수로 인식되기에 나눌때 뒤에.0을 붙여야 실수로 인식 
		//소수점 3번째 자리에서 반올림하여 2째자리 까지 출력
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000.0);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");
		String str=sc.nextLine();
		int n = Integer.parseInt(str); // String을 int로 변환 //중요
		//System.out.println((str+1));
		System.out.println("---------------------------");
		System.out.println("입력:");
		int s = sc.nextInt();//입력받은 String을 int로 변환
		System.out.println((s+1));
	}
}
