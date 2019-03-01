package com.project1.com.testproject;
import org.testng.*;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Testclass1 {

	@Test
	public void test() {
		String message = "Hello";
		Assert.assertEquals(message, "Hello");
	}
	
}
