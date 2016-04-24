package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers{

	public ViewLeadPage() {

		if(!verifyTitle("View Lead | opentaps CRM")){
			Reporter.reportStep("This is NOT View Lead page", "FAIL");
		}
		
		

	}
	
	public MyLeadsPage clickDelete(){
		
		clickByLink(prop.getProperty("ViewLeads.Delete.LinkText"));
		return new MyLeadsPage();
		
		
	}
	
	
}
