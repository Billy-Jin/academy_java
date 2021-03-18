package ch06;

//다른생성자 호출 : this()
/*생성자 오버로딩이 많아질 경우
 * 생성자 간의 중복된 코드가 발생할 수 있다
 * 매개변수의 수만 달리하고, 필도 초기화 내용이 비슷한 생성자에서 이런 현상을 많이 볼 수 있다.
 * 이런 경우에는 필드 초기화 내용은 한 생성자에서만 집중적으로 작성하고
 * 나머지 생성자는 초기화 내용을 가지고 있는 생성자를 호출하는 방법으로 개선을 할 수 있다.
 * 
 * 주의.
 * 반드시 생성자 안에서 작성해야 한다.
 * 반드시 첫 번째 문장이어야 한다.
 */



public class Car03 {

	
	
	
	
	//field - [접근제한자] [속성] 데이터타입 변수명;
			//고유 데이터 //색상-빨주 red,제조사-현대 기아, 최고속력 350, 제조날짜 년월일
	
	
	
	String company = "람보르기니";
	String model;
	String color;
	int maxSpeed;
	
	//constructor - [접근제한자] 클래스명(매개변수){}
	//default constructor
	Car03(){
		System.out.println("default constructor");
		
	}
	
	//model초기화 생성자 오버로딩
	Car03(String cmodel){
		//System.out.println("모델은"+cmodel+"입니다.");
		//model=cmodel;
		//Car03(cmodel,"노랑");//컴파일 에러발생
		this(cmodel,"노랑"); // 생성자에서 또 다른 생성자를 호출할때는 this()호출
	}
	
	//model, color 초기화 생성자
	Car03(String cmodel,String ccolor){
		//System.out.printf("모델은 %s, 색상은 %s 입니다\n",cmodel,ccolor);
		this(cmodel, ccolor,180);
		//this() 호출할때는 반드시 생성자의 첫번째 문장에서 호출해야한다!!
		//Constructor call must be the first statement in a constructor
		model=cmodel; 
		color=ccolor;
	}
	//model,color,maxSpeed 초기화 생성자
	Car03(String cmodel,String ccolor,int cmaxSpeed){
		//System.out.printf("모델은 %s, 색상은 %s,최고속력은 %d 입니다\n",cmodel,ccolor,cmaxSpeed);
		model=cmodel;
		color=ccolor;
		maxSpeed=cmaxSpeed;
	}
	//method - [접근제한자] [속성] 리턴유형 메소드명(매개변수리스트)[]
	
}
