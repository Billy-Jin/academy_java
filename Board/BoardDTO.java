package Board;

public class BoardDTO {

	//field [접근제어자][속성] 데이터타입 변수 [=초기값];
	private String title;
	private String content;
	
	//constructor [접근제어자]클래스이름([=매개변수리스트]);
	public BoardDTO(){}
	public BoardDTO(String title,String content){
		this.title = title;
		this.content = content;
		
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "BoardDTO [title=" + title + ", content=" + content + "]";
	}
	public void setContent(String content) {
		this.content = content;
	}
	//method [접근제어자][속성] 리턴함수 매서드명[=초기값];
	public String getTitle(){
		return title;
	}
	
	public String getContent() {
		return content;
	}
}
