package pages;



import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LoginPage extends OpentapsWrappers{


	public LoginPage() {

		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			Reporter.reportStep("This is NOT login page", "FAIL");
		}

	}

	// Enter the user name
	public LoginPage enterUserName(String userdata){
		enterById(prop.getProperty("Login.UserName.Id"), userdata);
		return this;
	}

	// Enter the password
	public LoginPage enterPassword(String pass){
		enterById(prop.getProperty("Login.Password.Id"), pass);
		return this;
	}

	// Click Login
	public HomePage clickLogin(){
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return new HomePage();
	}



	// Click Login
	public LoginPage clickLoginForFailure(){
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return this;
	}


	public LoginPage getErrorMessage(){
		System.out.println(getTextByXpath("//*[@id='errorDiv']"));
		return this;
	}
















}
