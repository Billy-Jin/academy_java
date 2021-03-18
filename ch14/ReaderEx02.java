package ch14;

import java.io.FileReader;
import java.io.Reader;

/*read() : 입력스트림으로 부터 매개값으로 제시한 byte배열의 길이만큼	
 *				바이트를 읽고 배열에 저장한다
 *				읽은 바이트 수를 리턴한다
 *				바이트를 더 읽을 수 없다면 -1을 리턴
 */

public class ReaderEx02 {
	public static void main(String[] args) throws Exception{
		 Reader rd = new FileReader("C:\\Temp\\test.txt");
		 char[] cbuf = new char[2];
		 int readCharNum;//읽어들인 바이트 배열을 저장할 변수
		 String str=""; //콘솔에 출력할 때 사용할 변수
		 
		 
		 while(true) {
			 readCharNum=rd.read(cbuf);//매개값으로 제시한 byte배열의 길이 (3)만큼 바이트를 읽고
			 if(readCharNum==-1) break;
			//String(byte[] bytes, int offset바이트배열에서 읽어들일 시작인덱스번호, int length글자수)
			 str+= new String(cbuf,0,readCharNum); //문자열로 만들어서 누적
			//System.out.println(str);
		 }
		 System.out.println(str);
		 rd.close();
	}
}
