package ch07;

public class Earth_ex01 {
 
	public static void main(String[] args) {
		Earth e = new Earth();
		
		System.out.println("지구의 반지름(km)="+e.EARTH_RADIUS);	
		System.out.println("지구의 표면적(km^2)="+e.EARTH_SURFACE_AREA);
	}
	
	
	
	//field [접근제어자][속성] 데이터타입 변수명[초기값];

}
//상수는 모두 대문자로 작성하는 것이 관례. 혼합된 이름이면 _로 결합
//초기값이 단순 값이라면 선언시에 초기값을 제시하느 일반적
//복잡한 초기화일 경우에는 정적 블록에서도 할 수 있다.

class Earth{
	static final double EARTH_RADIUS = 6400 ;
	static final double EARTH_SURFACE_AREA ;
	//The blank final field EARTH_SURFACE_AREA may not have been initialized
	
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS;
	}
}

