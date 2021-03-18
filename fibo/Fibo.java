package fibo;

/*갓 태어난 토끼 함수 한 쌍이 있다.
 * 이토끼 한쌍은 태어난지 두달이 되는 달부터 매달 함수 한 쌍의 토끼를 낳으며
 * 새로 태어난 토끼 한 쌍도 태어난지 두달이 되는 달부터 매달 암수 한 쌍의 토끼를 낳ㄴ느다
 * 일년후 토끼는 모두 몇 쌍이 될까? 단, 토끼는 중간에 죽지 않는다.
 */
public class Fibo {

	public static void main(String[] args) {
		Fibo f1= new Fibo();
		System.out.println("0="+f1.fibo1(0));
		System.out.println("1="+f1.fibo1(1));
		System.out.println("2="+f1.fibo1(2));
		System.out.println("3="+f1.fibo1(3));
		System.out.println("5="+f1.fibo1(5));
		System.out.println("55="+f1.fibo1(55));
		System.out.println("-------------------");
		System.out.println("0="+f1.fibo2(0));
		System.out.println("1="+f1.fibo2(1));
		System.out.println("2="+f1.fibo2(2));
		System.out.println("3="+f1.fibo2(3));
		System.out.println("5="+f1.fibo2(5));
		System.out.println("55="+f1.fibo2(55));
		}//main
	public int fibo1(int n) {
		//1, 1,2,3 5, 8, 13,21, 34, 55, 89,144,233,...
		//1. 반복문 이용
		if(n==0) {
			return 0;
		}else if(n==1){
			return 1;
		}else {
			int result = 0;
			int a=0; int b=1;
			for(int i=2; i<=n; i++) {
				result=a+b;
				a=b;
				b=result;
			}
			return result;
		}
			
	}
	//2. 재귀함수 이용
	public int fibo2(int n) {
		if(n==0) {
			return 0;
		}else if(n==1|n==2)
			return 1;
		
		return fibo2(n-2)+fibo2(n-1); 
	}
}
