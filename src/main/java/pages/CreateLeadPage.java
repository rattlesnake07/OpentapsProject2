package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{

	public CreateLeadPage() {

		if(!verifyTitle("Create Lead | opentaps CRM")){
			Reporter.reportStep("This is NOT CreateLead page", "FAIL");
		}

	}
	
	public CreateLeadPage enterCompany(String company){
		
		enterById(prop.getProperty("CreateLead.Company.Id"), company);
		return this;
	}
	public CreateLeadPage enterfirstName(String fname){
		
		enterById(prop.getProperty("CreateLead.FirstName.Id"), fname);
		return this;
	}
	public CreateLeadPage enterlastName(String lname){
	
	enterById(prop.getProperty("CreateLead.LastName.Id"), lname);
	return this;
}
	public ViewLeadPage clickCreateLead(){
		clickByClassName(prop.getProperty("CreateLead.Submit.Class"));
		return new ViewLeadPage();
	}
}
