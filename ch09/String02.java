package ch09;

import java.io.UnsupportedEncodingException;

//예) 네트워크로 문자열을 전송하거나, 문자열을 암호화 할 때 문자열을 바이트 배열로 변환한다.
//getBytes() : String을 bye배열로 변환 => 예) byte[] = "문자열".getBytes();
//getBytes(Charset charset) : String 을 byte에 


/*참고
 * 어떤 charset으로 인코딩하느냐에 따라서 바이트배열의 크기가 달라진다
 * EUC-KR의 알파벳은 1byte, 한글은 2byte로 변환
 * UTF-8의 알파벳은 1byte, 한글은 3byte로 변환
 */
public class String02 {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length="+bytes1.length);
		String str1 = new String(bytes1); //new String(byte[] bytes);
		System.out.println("bytes1->String str1으로 변환="+str1);
		
		byte[] bytes2;
		byte[] bytes3;
		
		try {
			//EUC-KR을 이용해서 인코딩
			bytes2=str.getBytes("EUC-KR");
			System.out.println(bytes2);
			System.out.println("bytes2.length="+bytes2.length); //10
		
			//EUC-KR을 이용해서 디코딩
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println("bytes2->String str2으로 변환="+str2); //안녕하세요
			
			//UTF-8을 이용해서 인코딩
			bytes3=str.getBytes("UTF-8");
			System.out.println(bytes3);
			System.out.println("bytes3.length="+bytes3.length); //15
		
			//UTF-8을 이용해서 디코딩
			String str3 = new String(bytes3,"UTF-8");
			System.out.println("bytes2->String str2으로 변환="+str2); //안녕하세요
		
		
		} catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
		
	}
}
