package ch14;

import java.io.FileOutputStream;
import java.io.OutputStream;

//OutputStram
//write(int b) : 매개변수로 제시한 int 값에서 끝에 있는 1byte만 출력스트림으로 보낸다.
public class WriteEx01 {

	public static void main(String[] args) throws Exception {
//		FileOutputStream fos = new FileOutputStream("");
		OutputStream os = new FileOutputStream("C:\\Temp\\result.txt");
		byte[] data = "ShyShyShy-123456789".getBytes();
		/*
		for(int i=0;i<data.length;i++) {
			os.write(data[i]); //write(int b)이용
			os.flush(); //버퍼비우기
		}
		*/
		os.write(data);
		os.flush();
		os.close();//자원해제
	}
}
