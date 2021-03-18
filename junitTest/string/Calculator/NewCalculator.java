package junitTest.string.Calculator;

import java.util.Scanner;

public class NewCalculator {

	public static void main(String[] args) {

		Cal c = new Cal();
		Scanner sc = new Scanner(System.in);
		while(true) {
		
			System.out.println("계산을 하시려면 1번,종료 하시려면 2번을 눌러주세요.");
			c.x=Integer.parseInt(sc.nextLine());	
		
		if(c.x==1) {	
		while(true) {
			if(c.z==0) {
			
			System.out.println("더할 두값을 입력해주세요");
			c.x=Integer.parseInt(sc.nextLine());
			c.y=Integer.parseInt(sc.nextLine());
			c.z=c.x+c.y;
			System.out.println("결과값은="+c.z);
			}else {
			System.out.println("추가로 더하시려면 값을 입력해주세요. 초기화 하시려면 0번을 눌러주세요.");
			c.x=Integer.parseInt(sc.nextLine());
			c.z+=c.x;
			if(c.x==0) {
				System.out.println("값을 초기화 합니다.");
				c.z=0;
				break;
			}
			System.out.println("결과값은="+c.z);

				}
			}	
		}else {
			System.out.println("계산을 종료 하였습니다.");	
			break;
		}
		}
	}
	
}
class Cal{
		int x;
		int y;
		int z;
	
		Cal(){
			int x=0;
			int y=0;
			int z=0;
		}
}