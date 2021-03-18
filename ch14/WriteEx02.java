package ch14;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx02 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:\\Temp\\result.txt");

		byte[] data = "ShyShyShy-123456789".getBytes();
		
		os.write(data,1,2); // _ s h

		os.flush();
		os.close();
	}

}
