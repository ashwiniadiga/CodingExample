package program.testng.listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(value=CustomListener.class)
public class TestListener extends Assert{
	@Test
	public void testcaseOne(){
		System.out.println("TestCaseOne");
		assertTrue(true);
	}
	
	@Test
	public void testcaseTwo(){
		System.out.println("TestCaseTwo");
		assertTrue(true);
	}
	

}
