package ch06;


public class Computer_ex1 {

	public static void main(String[] args) {

		Computer01 c = new Computer01();
		
		//배열변수를 미리 준비해서 사용하는 방법
		int[] values = {1,2,3};//배열변수 선언
		int result = c.sum(values);//메소드 호출방법1
		
		System.out.println("c.sum(values)="+result);
		
		//----------------------------------------
		//배열을 미리 생성하지 않고, 메소드 호출시 넘겨준다
		//메소드 호출시 넘겨준 값의 수에 따라서 자동으로 배열이 생성되고 매개값으로 사용된다.
		
		int result1 = c.sum(new int[] {1,2,3}); // 메소드 호출방법2
		System.out.println("c.sum(new int[] {1,2,3})="+result1);
		
		int result2 = c.sum1(1,2,3); // 메소드 호출방법3
		System.out.println("c.sum1(1,2,3))="+result2);
		int result3 = c.sum1(new int[] {1,2,3}); // 메소드 호출방법4
		System.out.println("c.sum1(new int[] {1,2,3})="+result3);	
	
	}

}
