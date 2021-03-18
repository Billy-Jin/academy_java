package Board;

public class BoardListExample {

	public static void main(String[] args) {

		BoardDAO dao = new BoardDAO();//BoardDAO객체의 getBoardList()를 호출하여
		
		dao.setBoardList("제목1", "내용1");
		dao.setBoardList("제목2", "내용2");
		dao.setBoardList("제목3", "내용3");
		
		System.out.println(dao.getBoardList());
		
		//List<BoardDTO> 타입의 컬렉션을 리턴받아
		//콘솔에 출력
	}

}
