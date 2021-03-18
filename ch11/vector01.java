package ch11;

import java.util.Vector;

//Vector
public class vector01 {

	public static void main(String[] args) {
		//Ve
		
		Vector vt = new Vector();
		Vector vt1 = new Vector(20);
		Vector vt2 = new Vector(20,2);
		//일반적으로 size초과시 capacity가 2배씩 증가하지만, 뒤에 값을 주면 값만큼 증가한다.
		
		System.out.println("벡터의 capacity()="+vt.capacity());//10 전체 용량
		System.out.println("벡터의 size()="+vt.size());//0 실제 크기
		System.out.println();
		
		//객체를 삽입
		for(int i=1; i<11; i++) {
			vt.add("제목"+i);	
		}
		
		
		System.out.println("벡터의 capacity()="+vt.capacity());//10
		System.out.println("벡터의 size()="+vt.size());//0
		System.out.println("-------------------------------");
		
		System.out.println("벡터1의 capacity()="+vt1.capacity());//10 전체 용량
		System.out.println("벡터1의 size()="+vt1.size());//0 실제 크기
		System.out.println();
		
		//객체를 삽입
		for(int i=1; i<11; i++) {
			vt1.add("내용"+i);	
		}
		
		
		System.out.println("벡터1의 capacity()="+vt1.capacity());//10
		System.out.println("벡터1의 size()="+vt1.size());//0
		System.out.println();
		System.out.println("-------------------------------");
		
		System.out.println("벡터2의 capacity()="+vt2.capacity());//10 전체 용량
		System.out.println("벡터2의 size()="+vt2.size());//0 실제 크기
		System.out.println();
		
		//객체를 삽입
		for(int i=1; i<32; i++) {
			vt2.add("내용"+i);	
		}
		
		
		System.out.println("벡터2의 capacity()="+vt2.capacity());//10
		System.out.println("벡터2의 size()="+vt2.size());//0
		System.out.println("-------------------------------");
		
		//데이터 꺼내오기
		for(int i=0; i<vt2.size(); i++) {
			Object obj=vt2.get(i);
			System.out.println(obj);
		}
		
		
	}
}
