package ch08;

/*다중catch
 * try 블럭 내부에는 다양한 종류의 예외가 발생할 수 있다.
 * 예외별로 예외처리코드를 다르게 하려면 어떻게 해야 될까?
 * 답은 다중 catch를 이용하자~!
 */
public class CatchException01 {

	public static void main(String[] args) {
		try {
			String data0= args[0]; //에러발생
			String data1= args[1];
			System.out.println("args[0]="+data0);
			System.out.println("args[1]="+data1);				
		
		
			String data11="100";
			String data12="a100";
			int value1 = Integer.parseInt(data11);
			int value2 = Integer.parseInt(data12); //런타임에러발생
			int result = value1+value2;
			System.out.println(value1+"+"+value2+"="+result);
			}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("배열관련에러 발생");
				//e.printStackTrace(); 
			//}catch(NumberFormatException e) {
				System.out.println("NumberFormatException관련에러");
			
				
			}catch(Exception e) {
				System.out.println("Exception e");
			}
	}
}
