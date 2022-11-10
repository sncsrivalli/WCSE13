package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsPractice {

	@BeforeSuite
	public void suiteSetup() {
		System.out.println("********* Before Suite **********");
	}
	
	@BeforeTest
	public void testSetup() {
		System.out.println("********* Before Test **********");
	}
	@BeforeClass
	public void classSetup() {
		System.out.println("********* Before Class **********");
	}
	@BeforeMethod
	public void methodSetup() {
		System.out.println("********* Before Method **********");
	}
	@Test
	public void test() {
		System.out.println("********* Test **********");
	}
	@AfterSuite
	public void suiteTeardown() {
		System.out.println("********* After Suite **********");
	}
	@AfterTest
	public void testTeardown() {
		System.out.println("********* After Test **********");
	}
	@AfterClass
	public void classTeardown() {
		System.out.println("********* After Class **********");
	}
	@AfterMethod
	public void methodTeardown() {
		System.out.println("********* After method **********");
	}
}
