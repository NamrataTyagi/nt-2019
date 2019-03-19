package module6;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyPracticeAnnotations {

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("this will run before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("this will run after method");
	}

	@Test
	public void ActualTest1() {

		System.out.println("this is the actual test1");
	}

	@Test
	public void ActualTest2() {

		System.out.println("this is the actual test1");
	}

	@Test
	public void ActualTest3() {

		System.out.println("this is the actual test1");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("this will run before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("this will run after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("this will run before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("this will run aftet test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this will run before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("this will run after suite");
	}

}
