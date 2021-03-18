package ch05_array;

//배열의 활용
//5명 학생의 최고점수와 최저점수를 출력하세요
/*출력결과
* 최고점수 : ~
* 최저점수 : ~
*/
public class Ex10 {

	public static void main(String[] args) {
		int[] score = {100,95,90,85,80};
		int max=0;
		int min=100;
		System.out.print("학생의 점수 : ");
		for(int i:score) {
			
			System.out.print(i+" ");
			
			if(i>=max) {
				max=i;
			}
			if(i<=min) {
				min=i;
			}
		}	
		/*for(int i=0;i<score.length;i++){
		 * for()int j= i+1;j<score.length;j++){
		 * if(score[i]>score[j]){
		 * int temp = score[i];
		 * int 
		 * 
		 * 
		 * system array.length 
		 */
		
		System.out.println();
		System.out.println("최고점수 : " + max );
		System.out.println("최저점수 : " + min );

	}

}
