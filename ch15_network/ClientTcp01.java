package ch15_network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

//TCP통신
//클라이언트열할 클래스
public class ClientTcp01 {

	public static void main(String[] args) {
		//2. 클라이언트는 접속할 서버의 IP주소와 포트정보로 소켓을 생성해서 서버에 연결을 요청한다.
		Socket socket=null;
		
		try {
			socket = new Socket(); //소켓을 생성
			socket.connect(new InetSocketAddress("192.168.0.51",5002));
			System.out.println("[서버와 연결성공]");
			//----------------------------------------------
			String message=null;
			byte[] bytes= null;
			OutputStream os = socket.getOutputStream(); //서버로 보내기 위한 OutputStream객체
			
			message="내일봐요~";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[서버에 message를 보냈습니다]");
			
			//----
			String msg = null;
			bytes = new byte[500];
			InputStream is = null;
			
			is = socket.getInputStream();//socket을 이용해 InputStream생성
			int readByteCount = is.read(bytes);//생성된 InputStream통해서 bytes[]를 읽기
			
			msg =new String(bytes, 0, readByteCount);//bytes[]를 문자열로 변환
			System.out.println("서버로부터의 응답메세지 : "+msg);
			
			
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}//main

}
