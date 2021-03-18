package ch05_array;

//다차원배열
//5명 학생의 3과목 시험 점수슬 저장한 후 출력
public class Ex04 {

	public static void main(String[] args) {
		//int[][] score = new int[5][3] 
		int[][] score = {
										{100,90,80},
										{90,80,70},
										{33,66,99},
										{50,60,70},
										{80,90,100}
										};
		

		for(int i=0;i<score.length;i++) {
			//for(int j=0;i<score[0].length;j++) {
			//for(int j=0;j<score[1].length;j++) {
			//for(int j=0;j<score[2].length;j++) {
			//for(int j=0;j<score[3].length;j++) {
			//for(int j=0;j<score[4].length;j++) {
			for(int j=0;j<score[i].length;j++) {	
			//for(int j=0;j<score.length-1;j++) {			
			
				//		for(int j=0;j<3;j++) {
				System.out.print(score[i][j]+",");
				
			
			}//내부 for 문
	System.out.println();
		}//외부 for문
	}

}
