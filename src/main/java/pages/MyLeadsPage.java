package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers{

	public MyLeadsPage() {

		if(!verifyTitle("My Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT My Leads page", "FAIL");
		}

	}
	
	public FindLeadsPage clickFindLeads(){
		clickByLink(prop.getProperty("MyLeads.FindLeads.LinkText"));
		return new FindLeadsPage();
	}
	
	
	
	
	
}
