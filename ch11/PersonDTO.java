package ch11;

//interface를 구현하는 클래스 선언
//[접근제어자] [속성] class 클래스 [extends 조상클래스명] implements 인터페이스명1,...,인터페이스명n

//인터페이스는 상수와 추상매서드만으로 구성된 (추상)클래스의 일종으로
//인터페이스를 상속 받은 구현 클래스에서는
//인터페이스에서 선언한 추상 메서드를 반드시 꼭 기필코 오버라이딩(재정의)해야한다.

//여기에서는 Comparable 인터페이스의 int compareTo(Object arg)
/**
 * @author admin
 *
 */
public class  PersonDTO implements Comparable<PersonDTO> { 
	//field
	private String name;//이름
	private int age;//나이
	
	//constructor
	public PersonDTO() {}
	public PersonDTO(String name,int age) {
		this.name=name;
		this.age=age;
	}

	//정렬기능
	
	//기준 1 비교100 : 음수 1-100=-99
	//기준 100 비교1 : 양수 100-100=0
	//기준 100 비교100 : 0  100-1=99
	

	
	@Override
	public int compareTo(PersonDTO arg0) {
		if(this.age<arg0.age) { //정렬의 기준
			return -1; 	// 음수 아무거나 줘도 됨
		}else if(this.age==arg0.age) {
			return 0;
		}else{
			return 1;	// 양수 아무거나 줘도 됨	
		}
	}
	
	//method
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + "]";
	}

	
	
	
	
}
