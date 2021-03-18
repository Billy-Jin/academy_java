package ch11;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//Hashtable - 교재 p644
//절차주의.

//key 를 id
//value를 비번
//키보드를 이용하여 id, 비번을 입력받아
// Hashtable에 저장되어 있는 key(id), value(비번)으로 비교한 후
//로그인 여부를 출력
public class HashTable01 {

	public static void main(String[] args) {

		Map<String,String> map= new Hashtable<String,String>();
		
		//객체저장 =>DB의 테이블에 해당되는 부분
		map.put("hong", "aaa");
		map.put("gil", "bbb");
		map.put("dong", "ccc");
		map.put("hi", "ddd");
		map.put("bye", "eee");
		
		//키보드를 이용하여 내용 입력받기
		Scanner sc= new Scanner(System.in);
		
		while(true){
			System.out.println("id와 비번을 입력하세요");
			System.out.println("id:");
			String id=sc.nextLine();
			System.out.println();
			
			System.out.println("비번:");
			String pwd=sc.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {	//user가 입력한 id가 map에 존재하는지 살펴본다  key 포함여부 확인 
				//map.get(id)	//해당키값의 value(map에 저장된 비번)를 가져온다(DB데이터)
				//pwd			//user가 입력한 비번
				//2개를 비교해서
				if(map.get(id).equals(pwd)) {//일치하면 로그인 성공
					System.out.println("로그인 성공");
					break;
				}else {//그렇지 않으면 로그인 실패 : 비번 불일치
					System.out.println("로그인 실패 : 비번 불일치");
					System.out.println();
				}
				
			}else {
				//로그인 실패 : id 존재x
				System.out.println("로그인 실패 : id가 존재하지 않습니다");
				System.out.println();
			}	
		}
		
	}

}
