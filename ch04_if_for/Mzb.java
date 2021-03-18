package ch04_if_for;

/*가위,바위,보 게임 구현
 *컴퓨터 : 임의값 
 *유저 : 임의값
 *예) 컴퓨터는 보를 내었습니다.
 *당신은 가위를 내었습니다.
 *귀하께서 이겼어요!!*/
//Math.random()*(큰수-작은수+1)+작은수

public class Mzb {

	public static void main(String[] args) {
	int a=(int)((Math.random()*3)+1);
	int b=(int)((Math.random()*3)+1);
	
	String com = " ";
	String user = " ";
	
	if(a==1) {
		com = "바위";
	}else if(a==2){
			com="가위";
	}else {
			com="보";
	}

	
	if(b==1) {
		user = "바위";
	}else if(b==2) {
			user="가위";
	}else {
			user="보";
	}
		
	System.out.println("컴퓨터는 "+com+"를 내었습니다.");
	System.out.println("당신은 "+user+"를 내었습니다.");
	


		if(a==1)	{
			switch(b) {
			case 1 : System.out.println("비겼어요.");
			break;
			case 2 : System.out.println("귀하께서 졌어요ㅜㅜ");
			break;
			default:System.out.println("귀하께서 이겼어요!!");
			}
		}else if(a==2)	{
			switch(b) {
			case 1 : System.out.println("귀하께서 이겼어요!!");
			break;
			case 2 : System.out.println("비겼어요.");
			break;
			default:System.out.println("귀하께서 졌어요ㅜㅜ");
			}
		}else {
			switch(b) {
			case 1 : System.out.println("귀하께서 졌어요ㅜㅜ");
			break;
			case 2 : System.out.println("귀하께서 이겼어요!!");
			break;
			default:System.out.println("비겼어요.");
			}
		}
	
		
	}

}
