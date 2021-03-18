package ch11;

import java.util.ArrayList;
import java.util.LinkedList;

/*LinkedList
 * 배열과 달리 링키드
 * 
 */
//LinkedList - 교재 p
//ArrayList와 LinkedList의 실행 성능 비교
public class LinkedList01 {

	public static void main(String[] args) {
// 		실행시간=끝시간-시작시간
		long startTime=0;	//시작시간
		long endTime=0; 	//종료시간
		
		
		ArrayList<String> list1 = new ArrayList<String>() ;
		LinkedList<String> list2 = new LinkedList<String>() ;
		
		startTime=System.nanoTime();
		for(int i=0; i<10000; i++) {
			//add(int index,Object value)
			list1.add(0, String.valueOf(i));
		}
		
		endTime=System.nanoTime();
		System.out.println("ArrayList 실행시간=" +(endTime-startTime));
	

		
		startTime=System.nanoTime();
		for(int i=0; i<10000; i++) {
			//add(int index,Object value)
			list2.add(0, String.valueOf(i));
		}
		
		endTime=System.nanoTime();//종료시간 담기
		System.out.println("LinkedList 실행시간= "+(endTime-startTime));
	
	}

}
