package ch09_util;
/* String클래스의 경우 문자열결합을 의미하는 +연산자를 많이 사용할 수록
 * String객체의 수가  늘어나기 때문에
 * => 프로그램 성능을  느리게 하는 요인이 된다.
 * 
 * 따라서, 문자열 변경 작업을 많이 하는 경우에는
 * StringBuilder 또는 StringBuffer클래스를 사용하는 것이 좋다
 * 
 * 이 2개의 클래스는  내부버퍼(buffer:데이터를 임시로 저장하는 메모리)에  문자열을 저장해두고
 * 그 안에서  추가, 수정, 삭제작업을 할 수 있도록 설계되어 있다
 * 따라서 String처럼  새로운 객체를 만들지 않고도 문자열을 조작할 수 있다
 * 
 */
public class StringBuilder01 {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println("sb="+sb.toString());
		
		//insert(int offset, ~~): 문자열을 중간에 주어진 offset위에 
		sb.insert(4,"2"); //4번째 인덱스에 값추가
		System.out.println("sb2="+sb.toString());
		
		sb.setCharAt(4, '6'); //4번째 인덱스 값 변경 한자리 변경시
		System.out.println("sb3="+sb.toString()); //Java6 Program Study
		
		sb.replace(6, 13, "Book"); //6번째 이상 13번째 미만을 book으로 변경 // end-1 
		System.out.println("sb4="+sb.toString()); //Java6 Book Study
		
		sb.delete(4, 5); //4번째 5번째 삭제
		System.out.println("sb5="+sb.toString()); //
		
		System.out.println("sb.length()="+sb.length());
		
		if(sb instanceof StringBuilder) {
			System.out.println("StringBuilder의 instansce이다");
		}
		
		//객체비교
		System.out.println(sb.append("하나") == sb.append("하나").append("둘"));//주소값이 같기 때문에 동일
		
		System.out.println();
		
		//StringBuilder를 String으로 변환
		String str = sb.toString(); 
		System.out.println("String str = "+str);
 		if(str instanceof String) {
			System.out.println("String의 instance이다");
		}
		System.out.println(str == (str+"하나"));//false //주소값이 변경된다.
		System.out.println((str+"하나" == (str+"하나"+"둘")));//false
	}
}
