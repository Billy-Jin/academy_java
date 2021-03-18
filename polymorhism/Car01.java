package polymorhism;

//이 클래스는 Tire01클래스를 부품으로 가지는 클래스이다
//자동차는 Tire를 가진다. Car01 has a Tire01.
/*클래스간의 관계? 포함관계(composite)
 * 한 클래스의 멤버변수로 다른 클래스르 선언하는 것
 * 
 */
public class Car01 {
	//field
	String company;
	int price;
	String color;
	
	//부품관계의 field =>자동차는 4개의 타이어를 가진다
	Tire01 fltire=new Tire01("앞왼쪽",6);
	Tire01 frtire=new Tire01("앞오른쪽",2);
	Tire01 bltire=new Tire01("뒤왼쪽",3);
	Tire01 brtire=new Tire01("뒤오른쪽",4);

	//constructor
	public Car01() {}
	
	//method
	//자동차가 가진 부품, 4개의 타이어가 모두 1회씩 회전시켜야 한다.
	//각Tire01 객체의 roll()매서드를 호출한다
	//호출한 roll()매서드가 false를 리턴하는 경우에는
	//자동차를 멈추기 위해 stop()메서드를 호출하고
	//문제가 발생한 해당 타이어의 번호를 리턴
	int run() {
		System.out.println("자동차가 달리는 중");
		if(fltire.roll()==false) {stop(); return 1;}
		if(frtire.roll()==false) {stop(); return 2;}
		if(bltire.roll()==false) {stop(); return 3;}
		if(brtire.roll()==false) {stop(); return 4;}
		return 0;//정상회전시
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");//타이어가 펑크날때 실행
	}
}
