package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC02_CreateLead extends OpentapsWrappers{
  @Test(dataProvider = "fetchData")
  public void CreateLead(String userName, String passWord , String company, String fname, String lname) {
	  
	  new LoginPage()
	  .enterUserName(userName)
	  .enterPassword(passWord)
	  .clickLogin()
	  .clickCRMSFALink()
	  .clickCreateLead()
	  .enterCompany(company)
	  .enterfirstName(fname)
	  .enterlastName(lname)
	  .clickCreateLead();
	  
  }
  @BeforeClass
  public void startTestCase() {
	  
	  	browserName 	= "chrome";
		dataSheetName 	= "TC02_CreateLead";
		testCaseName 	= "TC02 - Create Lead (POM)";
		testDescription = "Create Lead in Opentaps using POM framework";
	  
	  
  }

}
