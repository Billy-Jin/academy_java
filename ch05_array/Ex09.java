package ch05_array;
//배열의 활용
//5명 학생의 총점수와 평균점수를 또 다른 배열에 저장한 후 출력하세요
/*출력결과
* 총점 : ~
* 평균 : ~
*/
public class Ex09 {

	public static void main(String[] args) {
		int[] score = {100,95,90,85,80};
		float [] sa= new float[2];
		int j=0;
		int sum = 0;
		
		System.out.print("학생의 점수 : ");
		for(int i : score) {
			System.out.print(i+" ");
				sum += i;
				j++;
		
		}
		float avg=(float)sum/j;
		sa[0]=sum;	
		sa[1]=avg;
		System.out.println();
		System.out.print("총점과 평균점수 : ");
		for(int k=0;k<2;k++) {
			System.out.print(sa[k]+" ");
		}
	}

}
