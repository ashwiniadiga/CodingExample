package program.testng.listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginWithEmail(){
		System.out.println("Inside test loginWithEmail");
	}
	
	@Test
	public void loginViaFacebook(){
		System.out.println("Inside test loginViaFaceBook");
		Assert.assertEquals("testStromg", "Testing");
		
	}

}
