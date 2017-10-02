package jUnitTestExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTesting jUnitInt = new jUnitTesting();
		int result = jUnitInt.addNumbers(50, 75);
		assertEquals(125, result);
	}
	

}
