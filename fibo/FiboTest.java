package fibo;

import org.junit.Test;

import junit.framework.TestCase;

public class FiboTest extends TestCase {
	
	public static void main(String[] args) {
		//junit.textui.TestRunner.run(FiboTest.class)를 호출함으로써 Test가 진행된다
		junit.textui.TestRunner.run(FiboTest.class);
		//junit은 FiboTest라는 클래스의 method중에서
		//test로 시작하는 이름의 method를 테스트메서드로 자동인식하여 자동으로
	}
	
	public void testFibo1() {
		Fibo f1= new Fibo();
		//assertEquals(["메세지"],예측값,실제값)

		assertEquals(f1.fibo1(0)+f1.fibo1(1),f1.fibo1(2));
		assertEquals(f1.fibo1(1)+f1.fibo1(2),f1.fibo1(3));
		assertEquals(f1.fibo1(2)+f1.fibo1(3),f1.fibo1(4));
		assertEquals(f1.fibo1(3)+f1.fibo1(4),f1.fibo1(5));
		assertEquals(f1.fibo1(40)+f1.fibo1(41),f1.fibo1(42));
	}
	
	public void testFibo2() {
		Fibo f1= new Fibo();
		//assertEquals(["메세지"],예측값,실제값)
		assertEquals(f1.fibo2(0)+f1.fibo2(1),f1.fibo2(2));
		assertEquals(f1.fibo2(1)+f1.fibo2(2),f1.fibo2(3));
		assertEquals(f1.fibo2(2)+f1.fibo2(3),f1.fibo2(4));
		assertEquals(f1.fibo2(3)+f1.fibo2(4),f1.fibo2(5));
		assertEquals(f1.fibo2(40)+f1.fibo2(41),f1.fibo2(42));
	}

	
}