package ch10;

import java.text.DecimalFormat;

//DecimalFormat - 교재p540
//	- 숫자의 형식화

public class DecimalFormat01 {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("#"); //1234568
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#"); //1234567.9
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.######"); //0000001234567.89000
		System.out.println(df.format(num));
		
		df = new DecimalFormat("###,###.000"); //0000001234567.89000
		System.out.println(df.format(num));
		
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		
		df = new DecimalFormat("0"); //1234568
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0"); //1234567.9
		System.out.println(df.format(num));
	
		df = new DecimalFormat("00000000000000.000000000"); //0000001234567.89000
		System.out.println(df.format(num));
		
		
	}
}
