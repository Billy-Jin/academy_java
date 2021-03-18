package fibo;

//소스코드
//비밀번호 8자리 이상.
//문자와 숫자가 적어도 한 개씩은 있어야 함
public class ValidPW {
	private String pwd;
	private boolean isValid;

	
	//유효성 체크 qwertasdf
	public boolean isValid(String pwd) {
		boolean result = false;
		int letterCnt = 0; //문자의 글자수를 저장하기 위한 변수
		int digitCnt = 0; //숫바의 글자수를 저장하기 위한 변수
		for(int i=0; i<pwd.length(); i++) {//글자수의 길이만큼 반복하면서
			char ch = pwd.charAt(i);//한글자식 추출

			
			if(Character.isLetter(ch)){//Character.isLetter(캐릭터) :
				 letterCnt++; //문자 일때마다 letterCnt값을 1씩증가
			}
			
			else if(Character.isDigit(ch)){ //Character.isDigit(숫자) : 
					digitCnt++;
			}
		}
		//유효성검사를 통과시.. 즉 8자리이상, 문자숫자 각 한 개 이상
		if((pwd.length()>=8)&& letterCnt>=1&&digitCnt>=1) { //비밀번호는 8자리 이상 && 문자 한개 이상 && 숫자한개이상
			return true;
		}
		return result;
	}
}
