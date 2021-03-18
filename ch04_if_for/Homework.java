package ch04_if_for;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  grade = "한국";
		
		switch(grade){
		case "한국" : 
			System.out.println("한국사람 입니다");
			break;
		case "중국" :
			System.out.println("중국사람 입니다");
			break; //switch문을 벗어나라
		case "미국" : 
			System.out.println("미국사람 입니다");
			break;
		case "일본" :
			System.out.println("일본사람 입니다");
			break;
		default:System.out.println("국적확인이 불가능합니다");
		}
	}

}
