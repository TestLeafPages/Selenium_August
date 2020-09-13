package testng.day3;

import org.testng.annotations.Test;

public class LearnGroups {
	
	@Test(groups = {"regression"})
	public void testCase1() {
		System.out.println("test case 1");

	}
	@Test(groups = {"regression"})
	public void testCase2() {
		System.out.println("test case 2");

	}
	
	
	@Test(groups = {"functional"},dependsOnGroups = "smoke")
	public void testCase3() {
		System.out.println("test case 3");

	}
	@Test(groups = {"regression","functional"},dependsOnGroups = "smoke")
	public void testCase4() {
		System.out.println("test case 4");

	}
	
	@Test(groups = {"smoke"})
	public void testCase5() {
		System.out.println("test case 5");
		throw new RuntimeException();

	}
	
	@Test(groups = {"smoke"})
	public void testCase6() {
		System.out.println("test case 6");
		

	}

}
