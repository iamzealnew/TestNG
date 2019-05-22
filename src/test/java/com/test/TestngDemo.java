package com.test;
import org.testng.annotations.Test;
public class TestngDemo {

	@Test(groups = { "slow" })
	 public void aSlowTest() {
	    System.out.println("I belong to the group of Slow testing");
	 }
	@Test
	public void test() {
		System.out.println("This is a sample integration of Selenium TestNG with Jenkins");
	}
	@Test(groups = { "fast" })
	 public void aFastTest() {
	   System.out.println("I belong to the group of Fast testing and I execute first of all tests");
	 }
}
