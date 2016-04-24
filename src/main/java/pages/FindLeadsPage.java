package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers{

	public FindLeadsPage() {

		if(!verifyTitle("Find Leads | opentaps CRM")){
			Reporter.reportStep("This is NOT find leads page", "FAIL");
		}

	}
	
	public FindLeadsPage enterFName(String fname){
		
		enterByXpath(prop.getProperty("FindLeads.FName.Xpath"), fname);
		return this;
	}
	
	public FindLeadsPage clickFindLeads() throws InterruptedException{
		
		
		clickByXpath(prop.getProperty("FindLeads.Submit.Xpath"));
		Thread.sleep(3000);
		return this;
	}
	
	public ViewLeadPage clickFirstLeadName(String fname){
		
		
		clickByLink(fname);
		return new ViewLeadPage();
	}
	
	public FindLeadsPage verifyNameNotFound(){
		
		
		verifyTextByClass(prop.getProperty("FindLeads.NotFound.Class"), "No records to display");
		return this;
	}
	
	
	
}
