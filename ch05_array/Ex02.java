package ch05_array;

//배열선언과 생성
public class Ex02 {
	public static void main(String[] args) {
		//점수 5개를 저장하기 위한 배열변수 jumsu선언과 생성
		//String타입 데이터3개를 저장하기 위한 names배열선언
		
		String[] names = new String[3];
		for(String k : names) {
			System.out.println(k); //자동초기화=> 여기서는 int타입은 0
		}
		
		System.out.println("---------------------------------");
		
		double[] height = new double[5];
		for(int i=0;i<height.length;i++) {
			System.out.println(height[i]); //자동초기화=> 여기서는 int타입은 0
		}
		System.out.println("---------------------------------");
		int[] jumsu = new int[5];
		for(int j=0;j<jumsu.length;j++) {
			System.out.println(jumsu[j]); //자동초기화=> 여기서는 int타입은 0
		}
		
		
	}
}
