package refactoring.ex01;

public class DegreeToRadian {

	public static void main(String[] args) {
		
		Before_degreeToRadian Bd= new Before_degreeToRadian();
		After_degreeToRadian Ad= new After_degreeToRadian();
		
		Bd.degreeToRadian(180);//문제점 : 3.1415926535... 너무길다.. 외우기 어렵다
		Ad.degreeToRadian(180);//개선방법 : Math.PI 함수로 대체 가능
	}

}
class Before_degreeToRadian {
	public static double degreeToRadian(double degree) {
		System.out.println(degree / 180.0* 3.141592653589898989846);
		return degree / 180.0* 3.141592653589898989846;
		
	}
}
class After_degreeToRadian {
	public static double degreeToRadian(double degree) {
		System.out.println(degree / 180.0* Math.PI);
		return degree / 180.0* Math.PI;
		
	}
}