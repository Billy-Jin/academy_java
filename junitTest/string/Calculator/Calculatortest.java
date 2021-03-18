package junitTest.string.Calculator;

import java.util.Scanner;

public class Calculatortest {
	
	public Scanner sc = new Scanner(System.in);
	
	int x;  
	int y;  
	int z;
	
	Calculatortest(){
	 this.x=0;  
	 this.y=0;  
	 this.z=0;
	}

	
	Calculatortest(int x, int y){
		this.x=x;
		this.y=y;		
	}
	Calculatortest(int x){
		this.x=x;
	}
	
	public int add(int x) {
		this.z=this.z+x;
		System.out.println("결과값="+z);
		return this.z;
	}
	
	public int add(int x, int y) {
		
		z=x+y;
		System.out.println("결과값="+z);
	
		this.z = z;
		
		return z;
	}



	
	
	
}
