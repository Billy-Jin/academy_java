package test.jinwooram;

public class MemberService {

	private final String id = "hong";
	private final String password= "12345" ;
	
	
	public void login(String id,String password){
		boolean result = false;
		
		if(id=="hong"&&password=="12345") {
		
		result = true;
		}
		//return result;
		if(result==true) {
			System.out.println("로그인이 되었습니다.");	
		}else {
			System.out.println("id또는 password가 올바르지 않습니다");
		}
		
	}
	
	public void logout() {
		
		System.out.println("로그아웃 완료하였습니다.");
	}
	
}
