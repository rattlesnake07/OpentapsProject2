package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class HomePage extends OpentapsWrappers{

	public HomePage() {

		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			Reporter.reportStep("This is NOT Home page", "FAIL");
		}

	}
	// Verify the username
	public HomePage verifyLoggedinUserName(String userName){
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), userName);
		return this;
	}
	
	public CRMHomePage clickCRMSFALink(){
		clickByLink(prop.getProperty("Home.CRMSFA.LinkText"));
		return new CRMHomePage();
	}
	
}
