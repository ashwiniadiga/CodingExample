package program.testng.listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListenerTwo extends Assert{
	@Test
	public void testcaseThree(){
		System.out.println("testcaseThree");
		assertTrue(true);
	}

}
