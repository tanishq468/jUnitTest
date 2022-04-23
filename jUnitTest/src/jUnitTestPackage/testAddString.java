package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunctions jUnit = new jUnitFunctions();
		String result = jUnit.addStrings("capstone", "project");
		assertEquals("capstoneproject",result);
	}
}
