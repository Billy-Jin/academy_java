package ch14;

import java.io.FileWriter;
import java.io.Writer;

//Writer의 write(char[] cbuf)연습
public class writerEx01 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:\\Temp\\result.txt");//hy
		char[] data = "사나없인 사나마나".toCharArray();
		/*for(int i=0; i<data.length ;i++) {
			writer.write(data[i]);
		}*/
		writer.write(data); //write(char[] cbuf)연습
		writer.flush();
		writer.close();
	}

}
