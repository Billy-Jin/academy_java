package junitTest.string.Calculator;

import java.util.Scanner;

public class LastCalculator {

	public static void main(String[] args) {
	
		Calculator cal=new Calculator();
		
		
		while(cal.flag) {
			cal.input();
		}
		
	}
}
	class Calculator{
	public boolean flag = true;
	public Scanner sc = new Scanner(System.in);
	
	int x,y,z;  
	String m;
	String msg;
	String[] str;

	
	Calculator(){
	 this.x=0;  
	 this.y=0;  
	 this.z=0;

	}

	
	
	//입력받는 기능
	public void input() {
		System.out.println("원하는 계산식을 입력해주세요.\n ex) 첫계산시 a + b, 추가 계산시 + c, reset(r),close(c)");
		Scanner sc = new Scanner(System.in);
		String msg= sc.nextLine();
		if (msg.length() == 0) {
			System.out.println("잘못된 형식 입니다");
			return;
		}else if(msg.contains("c")) { //c입력시 예외처리
			splitString(msg);
		}else if(msg.contains("r")) { //r입력시 예외처리
			splitString(msg);
		}else if(!msg.contains(" ")) { //공백 없을시 리턴
			System.out.println("잘못된 형식 입니다");
			return;
		}else {
			splitString(msg);
		}
		
	}
	
	//"10 + 90"오면 문자열분해  "10" "+" "90"
	public String[] splitString(String msg) {
		
	if(msg.equals("r")) {
			reset(msg);
	}else if(msg.equals("c")) {
			close(msg);
	}else {
		String[] str = msg.split(" ");
//		if (str.length == 0) {
//			System.out.println("잘못된 형식입니다");
//			return str;
//		}
		
		if(str[1].equals("+")) {
			calculate1(str);
		}else if(str[1].equals("-")) {
			calculate2(str);
		}else if(str[0].equals("+")) { 
			calculate11(str);
		}else if(str[0].equals("-")) { 
			calculate22(str);
		}else if(str[1].equals("*")) {
			calculate3(str);
		}else if(str[0].equals("*")) {
			calculate33(str);
		}else{
			System.out.println("잘못입력하셨습니다.");
			input();
		}
	}
		return str;
}
	
	public int calculate1( String[] str) {
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[2]);
		int z = add(x,y);
		System.out.println(x+"+"+y+"="+z);
		this.z=z;
		return this.z;
	}
	public int calculate11( String[] str) {
		int x = Integer.parseInt(str[1]);
		int z = add(this.z,x);
		System.out.println(this.z+"+"+x+"="+z);
		this.z=z;
		return this.z;
	}
	
	public int calculate2( String[] str) {
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[2]);
		int z = minus(x,y);
		System.out.println(x+"-"+y+"="+z);
		this.z=z;
		return this.z;
	}
	public int calculate22( String[] str) {
		int x = Integer.parseInt(str[1]);
		int z = minus(this.z,x);
		System.out.println(this.z+"-"+x+"="+z);
		this.z=z;
		return this.z;
	}
	public int calculate3( String[] str) {
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[2]);
		int z =  multi(x,y);
		System.out.println(x+"x"+y+"="+z);
		this.z=z;
		return this.z;
	}
	public int calculate33( String[] str) {
		int x = Integer.parseInt(str[1]);
		int z = multi(this.z,x);
		System.out.println(this.z+"x"+x+"="+z);
		this.z=z;
		return this.z;
	}
	
	public int calculate4( String[] str) {
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[2]);
		int z = divide(x,y);
		System.out.println(this.z+"x"+x+"="+z);
		this.z=z;
		return this.z;
	}
	
	public int calculate44( String[] str) {
		int x = Integer.parseInt(str[1]);
		int z = divide(this.z,x);
		System.out.println(this.z+"x"+x+"="+z);
		this.z=z;
		return this.z;
	}
	
	public int add(int x, int y) {
		return x+y;
	}
	
	
	
	public int minus(int x, int y) {
		return x-y;
	}

	public int multi(int x, int y) {
		return x*y;
	}
	
	public int divide(int x, int y) {
		return x/y;
	}

	
	public String reset(String msg) {
		System.out.println("값을 리셋합니다.");
		this.z=0;
		this.msg=msg;
		return msg;
	}
	public String close(String msg) {
		flag= false;
		System.out.println("계산기를 종료합니다.");
		this.msg=msg;
		return msg;
	}
	
}
