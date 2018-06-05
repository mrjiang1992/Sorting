package com.lj.sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PostFixCalculatorTest {

	PostFixCalculator pFC;

	@Before
	public void setup() {
		pFC = new PostFixCalculator();
	}

	@Test
	public void testBasicPostFix() {
		String input = "2 3 +";
		int expectedOutput = 5;
		int actualOutput = pFC.postFix(input);
		Assert.assertEquals("values aren't equal", expectedOutput, actualOutput);
	}

	@Test
	public void testTwoOperationsPostFix() {
		String input = "2 3 5 + *";
		int expectedOutput = 17;
		int actualOutput = pFC.postFix(input);
		Assert.assertEquals("values aren't equal", expectedOutput, actualOutput);
	}

	@Test
	public void testTwoOperationsPostFixWithDivision() {
		String input = "0 3 5 / *";
		int expectedOutput = 15;
		int actualOutput = pFC.postFix(input);
		Assert.assertEquals("values aren't equal", expectedOutput, actualOutput);
	}
}
