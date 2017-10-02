package jUnitTestExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTesting jUnitInt = new jUnitTesting();
		String result = jUnitInt.addStrings("yash", "raj");
		assertEquals("yashraj", result);
	}
	
	
	
}
