package ch11;

import java.util.ArrayList;

import ch07.Car01;

//모든 객체를 추가할 수 있다
public class Arraylist00 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("문자열");		//String
		list.add(1);			//int 래퍼클래스인 Integer
		list.add(true);			//boolean 래퍼클래스인 Boolean
		list.add(Math.PI);		//double 래퍼클래스인 Double
		list.add('A');			//char 래퍼클래스인 Character
		list.add(new Car01());	//Car01
		//String, Car01은 클래스 이나, int,boolean,double,char는 Primitive type(기본형)이다
		//대문자로 시작하면 클래스, 소문자로 시작하면 기본형
		//출력
		for(Object a : list) {
			System.out.println(a);
			
/*CRUD
 *Create 	->입력->Insert  //Create(테이블,시퀀스,트리거,유저등의 __은 create)
 *Read		->조회->select
 *Update	->변경->update
 *Delete 	->삭제->delete  //Drop
 */
		}
	}
}
