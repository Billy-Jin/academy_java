package ch14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//BufferdInputStream과 BufferedOutputStream : 성능향상 보조스트림
//버퍼를 사용했을 때의 성능 비교

public class BufferdInputStreamEx01 {

	public static void main(String[] args) throws Exception {
//		public class BufferedInputStream extends FilterInputStream
//		public BufferedInputStream(InputStream in)
		//버퍼보조스트림 미사용시
		FileInputStream fis1 =new FileInputStream("D:\\oraclestudy\\webset\\img\\21.jpg");
		BufferedInputStream bis1= new BufferedInputStream(fis1);
		FileOutputStream fos1 =new FileOutputStream("C:\\Temp\\21.jpg");
		
		int data = -1;
		long start = 0; //시작시간
		long end = 0;	//종료시간
		
		start = System.currentTimeMillis(); //시작시간 얻기
		while((data = bis1.read())!=-1){
			fos1.write(data);			
		}
		fos1.flush();
		end = System.currentTimeMillis(); //종료시간 얻기
		
		fos1.close();
		bis1.close();
		fis1.close();
		System.out.println("버퍼보조스트림 일부사용-done! : "+(end-start)+"ms");
		
		//--------------------------------------------------------------------------------
		//버퍼보조스트림 사용시
		FileInputStream fis2 =new FileInputStream("D:\\oraclestudy\\webset\\img\\22.jpg");
		BufferedInputStream bis2= new BufferedInputStream(fis2);
		FileOutputStream fos2 =new FileOutputStream("C:\\Temp\\22.jpg");
		BufferedOutputStream bos2 =new BufferedOutputStream(fos2);
		
		start = System.currentTimeMillis(); //시작시간얻기
		while((data = bis2.read())!=-1){
			bos2.write(data);			
		}
		bos2.flush();
		end=System.currentTimeMillis();//종료시간 얻기
		bos2.close();
		fos2.close();		
		bis2.close();
		fis2.close();
		System.out.println("BufferdInputStream-done! : "+(end-start)+"ms");
		
	}

}
