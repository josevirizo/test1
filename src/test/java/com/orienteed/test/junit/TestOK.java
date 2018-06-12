package com.orienteed.test.junit;
import org.junit.Assert;
import org.junit.Test;

public class TestOK {

	@Test
	public void test() {
		System.out.print("Running ok test!");
		Assert.assertTrue("OK".equals("OK"));
	}

}
