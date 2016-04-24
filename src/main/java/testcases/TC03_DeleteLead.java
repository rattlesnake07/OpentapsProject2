package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC03_DeleteLead extends OpentapsWrappers{
  @Test(dataProvider = "fetchData")
  public void CreateLead(String userName, String passWord ,  String fname) throws InterruptedException {
	  
	  new LoginPage()
	  .enterUserName(userName)
	  .enterPassword(passWord)
	  .clickLogin()
	  .clickCRMSFALink()
	  .clickLeads()
	  .clickFindLeads()
	  .enterFName(fname)
	  .clickFindLeads()
	  .clickFirstLeadName(fname)
	  .clickDelete()
	  .clickFindLeads()
	  .enterFName(fname)
	 .clickFindLeads()
	 .verifyNameNotFound();
	  
  }
  @BeforeClass
  public void startTestCase() {
	  
	  	browserName 	= "chrome";
		dataSheetName 	= "TC03_DeleteLead";
		testCaseName 	= "TC03 - Delete Lead (POM)";
		testDescription = "Delete Lead in Opentaps using POM framework";
	  
	  
  }

}
