package ch04_if_for;
//Java의 정석 
//break
//주의 자신이 속한 반복문 또는 switch문 만 종료
//주로 조건을 위해 if문 안에 넣어서 사용

public class Ex10_break2 {

	public static void main(String[] args) {
		
		int sum=0;
		int i =0;
		while(sum<110) {
			while(true) {
				if(sum>100) {
					break; //주의! break 속한 해당 반복문만 종료!!
				}
				i++;
				sum +=i; //sum = sum + i
				System.out.println("i 값이"+i+"일때의 sum="+sum);
			}
			System.out.println("내부 while문 밖");
			System.out.println("i="+i);
			System.out.println("누적 총합 sum="+sum);
			sum++;
		}
		System.out.println("외부 while문 밖");
		System.out.println("누적 총합 sum="+sum);
	}

}
