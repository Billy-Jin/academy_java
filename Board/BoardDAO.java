package Board;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {


		private List<BoardDTO> list = new ArrayList<BoardDTO>();
	

		public BoardDAO() {
			}

		public List<BoardDTO> getBoardList() {
			return list;
		}

		public void setBoardList(String title, String content) {
				
			list.add(new BoardDTO(title, content));
		}
		
	
	
	
	
}
