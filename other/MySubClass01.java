package other;

public class MySubClass01 extends MyClass01 {


		void qqq() {
			//MyClass01 m = new MyClass01();
			pub = 100;
			pro = 200;
			pack= 300;
			//pri = 400;
			
			//메소드 접근 허용여부 체크
			pubMethod();
			proMethod();
			packMethod();
			//priMethod();
			//The method priMethod() from the type MyClass01 is not visible
			
		}
	
}
