package ch11;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;


//외부의 프로퍼티 파일을 읽어오기
//프로퍼티 파일을 읽어오기 위해서는 Properties객체를 생성하고
//load()메소드를 호출
public class Properties01 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
	
		//외부의 프로퍼티 파일
		//String path = "";
		//프로퍼티 파일은 일반적으로 클래스 파일과 함께 저장된다.
		//클래스파일을 기준으로 상대경로를 이용해서 프로퍼티 파일의 경로를 얻는다: Class.getResource
		//클래스명.class.getResource("database.properties");//클래스명을 기준으로 상대경로로 검색한다.
		//Properties01.class.getResource("database.properties");
		
		//getResource()는 주어진 파일의 상대경로는 URL객체로 리턴
		//URL객체로 리턴.getPath() : 파일의 절대경로를 리턴받기
		String path=Properties01.class.getResource("database.properties").getPath();
		
		//주어진 파일의 경로에 한글이 있는 경우 한글복원
		path=URLDecoder.decode(path, "utf-8");
		
		//System.out.println("path="+path);
		
		//외부의 프로퍼티 파일경로 = c://a/b/database.properties
		//properties.load(new FileReader(외부의 프로퍼티 파일경로))
		properties.load(new FileReader(path));
		String driver = properties.getProperty("driver");
		String url= properties.getProperty("url");
		String user= properties.getProperty("user");
		String password= properties.getProperty("password");
		
		System.out.println("driver="+driver);
		System.out.println("url="+url);
		System.out.println("user="+user);
		System.out.println("password="+password);
	}
}
