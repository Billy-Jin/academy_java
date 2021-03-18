package junitTest.Equals;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Ignore;
public class EqualTest {

	
//	public static void main(String[] args) {
//		EqualTest et= new EqualTest();
//		et.testReferenceEqual();
////		et.testValueEqual();
//		
//	}
	//@Test(timeout=제한시간 ms단위)
	//@Test(timeout=1000)//1초//1ms=1/1000초
	@Test(timeout=100)//0.1초  10/1000
	public void testTimeOut() throws Exception{
		long sum=0;
		for(int i=0; i<10000; i++) {
			for(int j=0; j<10000; j++) {
				sum+=j;
			}
		}
		System.out.println("sum="+sum);
	}
	
	
	//@Ignore은 test에서 제외해야 한다. //@Ignore있으면 해당 메소드 무시
	@Ignore // import org.junit.Ignore;
	@Test
	public void tIgnore() throws Exception{
		assertTrue(false);
	}
	
	//assertThat(검사할대상데이터,조건);
	@Test
	public void tAssertThat() {
		Object result="test";
		assertTrue(result instanceof String);
		assertThat(result, instanceOf(String.class));
		
		//기존방식
		//assertEquals(3,3);
		
		int i=3;
		assertThat(i,is(3));
		assertThat(Arrays.asList("one","two","three"),hasItems("one","two","three"));
	}
	


	//junit4에서 테스트메소드명은 반드시 test로 시작하지 않아도 된다
	
	@Test
	public void tAssertNotNull() {
		String str1=null;
		str1=new String("가자");
		assertNotNull("not null이어야 해요",str1);
	}
	
	
	@Test
	public void testAssertFalse() {
		assertFalse("fail-false가 나와야해요",false);
		//AssertFalse("fail-false가 나와야해요",true);
	}
	









	/*Arrays.asList() : 일반 배열을 ArrayList로 변환
	 * get(), contains()는 사용가능하지만
	 * add()는 사용불가능 하다.
	 */
	//List비교
	
	
	@Test
	public void testValueEqual2() {
		List<Integer> expected = Arrays.asList(1,2,3);
		List<Integer> actual = Arrays.asList(1,2,3);
		assertEquals("두 List의 값과 순서가 같아요",expected,actual);
				
	}
	
	
	@Test
	public void testAssertArrayEquals2() {
		String[] expected = new String[] {"a","b","c"};
		String[] actual = new String[] {"a","b","c"};
		assertArrayEquals("failure-byte array not same",expected,actual);
	}
	
	







	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "qwert".getBytes();
		byte[] actual = "qwert".getBytes();
		assertArrayEquals("failure-byte array not same",expected,actual);
	}
	
	




	//reference비교
	@Test
	public void testReferenceEqual() {
	String str1 = new String("문자열");
//	String str2 = new String("문자열");
	String str2=str1;
	//System.out.println("reference 비교결과="+(str1==str2));//false

	assertSame("두 객체의 주소값이 동일",str1,str2);


	}
	@Test
	public void testValueEqual() {
	String str1 = new String("문자열");
	String str2 = new String("문자열");
	//System.out.println("Value 비교결과="+(str1.equals(str2)));//true
	assertEquals("두 객체의 값이 동일",str1,str2);
	}
}

