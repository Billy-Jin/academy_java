package ch07;

public class DmbCellPhone_ex01 {

	public static void main(String[] args) {
		DmbCellPhone01 dcp = new DmbCellPhone01("최신폰","RoseGold",7);
		
		//필드출력
		//CellPhone01클래스로부터 상속받은 필드값 출력
		System.out.println("model="+dcp.model);
		System.out.println("color="+dcp.color);
		//DmbCellPhone01클래스에서 선언한 필드값 출력
		System.out.println("channel="+dcp.channel);
	
		dcp.powerOn();//전원키고
		dcp.bell();//벨소리 점검
		dcp.sendVoice("여보세요~~ 거기누구 없소?");//여보세요~~ 거기누구 없소? 물어보기
		dcp.receiveVoice("네~");//네~ 대답듣기
		
		dcp.turnOnDmb();//dmb켜기
		dcp.changeChannelDmb(11);//채널변경
		dcp.turnOffDmb();//dmb끄기
		dcp.powerOff();
	}
}
