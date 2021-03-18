package ch05_array;

//가변배열-[Java의 정석]ch5_배열-슬라이드12,교제 p214?? 참고
public class Ex05 {

	public static void main(String[] args) {
		// 5개반 학생들의 몸무게를 저장하세요(인원수는 자유)
		double [][] weight = {	{48.2,52,49},
														{60,62.3},
														{88},
														{51.2,54.5,49.6,47.2},
														{77.7,71.2},
				
		};
		for(int i=0;i<weight.length;i++) {
				for(int j=0;j<weight[i].length;j++) {	
					System.out.print(weight[i][j]+" ");
			}
		System.out.println( );
		}
	}

}
