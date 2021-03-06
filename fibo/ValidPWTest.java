package fibo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//테스트소스
//비밀번호 유효성검사기능을 테스트하기 위한 테스트 클래스
@RunWith(Parameterized.class)
public class ValidPWTest {
	private String password;
	private boolean isValid;
	private static ValidPW validator;
	
	@BeforeClass
	public static void setUp() {
		ValidPW validator = new ValidPW();
	}
	
	public ValidPWTest(String password, boolean isValid) {
		this.password=password;
		this.isValid = isValid;
	}

	
	@Parameters
	public static Collection passwords() {
		return Arrays.asList(
				new Object[][] {
					{"123f",false},
					{"123",false},
					{"qwerasd12",true},
					{"12345678",true},
					{"1q2w3e4r",true},
					{"qwerasdf",false}
				}
				);
	}	
	@Test
	public void isValidPwWithParams() {
		assertEquals(validator.isValid(this.password), this.isValid);
	}
	
}
