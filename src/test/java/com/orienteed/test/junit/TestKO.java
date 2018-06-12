package com.orienteed.test.junit;
import org.junit.Assert;
import org.junit.Test;

public class TestKO {

	@Test
	public void test() {
		System.out.print("Running ok test!");
		Assert.assertTrue("OK".equals("KO"));
	}

}
