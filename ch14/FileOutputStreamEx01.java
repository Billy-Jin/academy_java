package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\oraclestudy\\webset\\img\\55.jpg");
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\55.jpg");
		
		byte[] b = new byte[100];
		int readBytes;
		while((readBytes=fis.read(b))!=-1) {
			fos.write(b, 0, readBytes);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("finished");
	}
}
