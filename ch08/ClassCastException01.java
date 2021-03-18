package ch08;

/*ClassCastException
 * : 타입변환(Casting)은 상위(조상)클래스와 하위(자녀)클래스간에 발생
 * 						구현클래스와 인터페이스 간에도 발생한다.
 * 발생원인 : 억지로 타입변환을 시도할 경우 ClassCastException이 발생한다.
 */

public class ClassCastException01 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		changeDog(dog);
		Cat cat=new Cat();
		changeDog(cat); //런타임에러
		//java.lang.ClassCastException: ch08.Cat cannot be cast to ch08.Dog
		//발생이유 : Cat객체를 changeDog()의 매개값으로 주었기 때문에 => Dog타입으로 변환할수 없다
	}//main
	
	public static void changeDog(Animal animal) {
		//매개변수의 타입을 강제로 Dog로 변환하여 해달 클래스 타입의 dog변수에 저장
		//해결방법:타입을 먼저 체크하자
		if(animal instanceof Dog) {
		Dog dog = (Dog)animal; //(Dog)cat;
		}

	}		
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}