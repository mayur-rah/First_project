package com.lti.demos;



import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestCasesEx {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	//ctrl+shift+o;
public void testCase1()
{
	Assertions.assertEquals("Hello","Hello");
	Assertions.assertEquals(500,200+300);
}
	public void testadd()
	{
		calculator c= new calculator();
		int r= c.add(100,200);
		Assertions.assertEquals(300,r);
	}
	
	@Test
	void testAssertFalse() {
	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
	
	
	


}

