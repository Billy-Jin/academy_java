package ch04_if_for;


//교재 p150참고

	import java.util.*;//scanner클래스 사용위한 추가
	public class Mzb2{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가위(찌), 바위(묵), 보(빠) 중 하나를 입력해주세요." );
		String input = scan.nextLine();
		//int b = Integer.parseInt(input);
		
		int b=0;
		int a=(int)((Math.random()*3)+1);
		//int b=(int)((Math.random()*3)+1);
		
		String com = " ";
		String user = " ";
		
		switch(a) {
		case 1 : com="가위(찌)";
			break;
		case 2 : com="바위(묵)";
			break;
		default : com="보자기(빠)";
		}
			/*if(a==1) {
			com = "가위";
			}else if(a==2){
				com="바위";
			}else {
				com="보";
			}

		
			if(b==1) {
				user = "가위";
			}else if(b==2) {
				user="바위";
			}else if(b==3){
				user="보";
			}else {
				user="Error";
			}*/
		if(input.equals("가위")||input.equals("찌")) {
			b=1;
		}else if(input.equals("바위")||input.equals("묵")) {
			b=2;
		}else if(input.equals("보")||input.equals("빠")) {
			b=3;
		}else {
			b=4;
		}
		
		
		
		switch(b) {
		case 1 : user="가위(찌)";
			break;
		case 2 : user="바위(묵)";
			break;
		case 3 : user="보자기(빠)";
			break;
		default :  user="Error";
		
		}
			
			System.out.println("컴퓨터는 "+com+"를 내었습니다.");
			System.out.println("당신은 "+user+"를 내었습니다.");
		

			switch(b-a) {
			case 1 : case -2: //나:컴퓨터 보(3):바위(2)  , 가위(1):보(3), 바위(2):가위(1)
			System.out.println("귀하께서 이겼어요!!");
			break;
			case 2 : case -1://나:컴퓨터 가위(1):바위(2), 바위(2):보(3), 보(3):가위(1)
			System.out.println("귀하께서 졌어요ㅜㅜ");
			break;
			case 0:System.out.println("비겼어요.");
			break;
			default:System.out.println("다시 입력해 주세요.");
		
			}
	}
	
}

