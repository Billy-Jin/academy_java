package ch05_array;

//배열의 활용
//5명 학생의 총점수와 평균점수를 출력하세요
/*출력결과
 * 총점 : ~
 * 평균 : ~
 */
public class Ex08 {
	public static void main(String[] args) {
		
	int[] score = {100,95,90,85,80};
	int sum =0;
	int j=0;
	for(int i : score) {
		System.out.print(i+" ");
	 		sum += i;
	 		j++;
	 		
	}
	
	//float aver=sum/(float)score.length;
	
	float avg = (float)sum/j;
	System.out.println();
	System.out.println("총점 : "+sum);	
	System.out.println("평균 : "+avg);	
	}
}
