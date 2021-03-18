package ch11;

import java.util.TreeSet;

//TreeSet - 교재
public class TreeSet01 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add( new Integer(55));
		ts.add( new Integer(100));
		ts.add( new Integer(22));
		ts.add( new Integer(12));
		ts.add( new Integer(51));
		ts.add( new Integer(26));
		
		Integer num = null; //Integer은 클래스 타입이므로 초기값 null줌

		
		System.out.println("가장 낮은 점수="+ts.first()); //12 가장 적은 값
		System.out.println("가장 높은 점수="+ts.last());	//100 가장 큰 값

		num=ts.lower(new Integer(22));
		System.out.println("22보다 아래인 점수="+num); //기준 값 외에 가장 가까운 값 한개만 출력
		
		num=ts.higher(new Integer(55));
		System.out.println("55보다 위인 점수="+num);
		
		num=ts.floor(new Integer(22));
		System.out.println("22와 동일 하거나 바로 아래인 점수="+num); //기준 값포함 가장 가까운 값 출력
		
		num=ts.ceiling(new Integer(55));
		System.out.println("55와 같거나 바로 위인 점수="+num);
	
		while(!ts.isEmpty()) {
			num=ts.pollFirst(); // 가장 낮은 값 꺼내고 제거
			System.out.println(num+"\t(남은 객체수:"+ts.size()+")"); //ts.size() 남은 갯수
		}
	}

}
