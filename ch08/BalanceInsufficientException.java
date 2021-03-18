package ch08;

//이 클래스는 잔고부족 예외를 처리하기위한 사용자정의 예외 클래스이다.
//예외클래스 선언
/*접근제어자 class xxxException extends Exception{
			//field
			//constructor
			//public default생성자(){}
	  		//String타입의 매개변수를 갖는 생성자는
			//public 생성자(String message){
			  		//상위 클래스의 생성자를 호출하여 예외메세지를 넘겨준다
			  		super(message);
			  		//이러한 예외메세지의 용도는 catch{}의 예외처리코드에서 사용된다
			  		//예) e.getMessage()  또는 e.printStackTrace()
			  }
			  
			//method
*/
public class BalanceInsufficientException extends Exception {
	//constructor
	public BalanceInsufficientException(){}
	public BalanceInsufficientException(String message){
	  		super(message);
	}
	  
	
	
}
