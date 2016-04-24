package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC01_LoginFailure extends OpentapsWrappers{
	
	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC01A_Login";
		testCaseName 	= "TC01A - Login Failure(POM)";
		testDescription = "Login to Opentaps using POM framework (Negative Testcase)";
	}
	
	
	@Test(dataProvider="fetchData")
	public void loginForFailure(String username,String password) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLoginForFailure()
		.getErrorMessage();
	}
}
