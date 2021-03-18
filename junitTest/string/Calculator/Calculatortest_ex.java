package junitTest.string.Calculator;

import java.util.Scanner;

	

public class Calculatortest_ex {
	
	public static void main(String[] args) {

	

	Calculatortest c= new Calculatortest();
	
	
	
	
		while(true) {
		if(c.z==0) {
		System.out.println("더할 두 값을 입력해주세요");
		c.x=Integer.parseInt(c.sc.nextLine());
		c.y=Integer.parseInt(c.sc.nextLine());
		c.add(c.x, c.y);
		}else {
		System.out.println("추가로 더할 값을 입력해주세요");
		c.x=Integer.parseInt(c.sc.nextLine());
		c.add(c.x);
		}
		}
	
	
	
	}
}
