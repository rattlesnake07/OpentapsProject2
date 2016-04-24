package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {

		if(!verifyTitle("My Home | opentaps CRM")){
			Reporter.reportStep("This is NOT CRMHome page", "FAIL");
		}

	}
	
	public CreateLeadPage clickCreateLead(){
		clickByLink(prop.getProperty("CRMHome.CreateLead.LinkText"));
		return new CreateLeadPage();
	}
	
	public MyLeadsPage clickLeads(){
		clickByLink(prop.getProperty("CRMHome.Leads.LinkText"));
		return new MyLeadsPage();
	}
	
}
