package PageObjectModel;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import Utility.*;

public class RegistrationPage extends BaseClass{
	public RegistrationPage (WebDriver webDriver)
	{
		PageFactory.initElements(webDriver, this);
	}	
	
	
	@FindBy(xpath="//a[contains(@href,'/register')]")
	@CacheLookup
	WebElement btnRegister;
	
	@FindBy(xpath="//span[text()=' Registration Form ']")
	@CacheLookup
	WebElement spanRegSiteHeader;
	

	@FindBy(xpath="//button[@id ='login']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//p[text()='Please login to LMS application']")
	@CacheLookup
	WebElement headerLoginPage;
	
	@FindBy(xpath="//button[@id ='SignUp']")
	@CacheLookup
	WebElement btnSignUp;
	
	@FindBy(xpath="//input[contains(@name,'FirstName')]")
	@CacheLookup
	WebElement inputFirstName;
	
	@FindBy(xpath="//input[contains(@name,'LastName')]")
	@CacheLookup
	WebElement inputLastName;
	
	@FindBy(xpath="//input[contains(@name,'Address')]")
	@CacheLookup
	WebElement inputAddress;
	
	@FindBy(xpath="//input[contains(@name,'StreetName')]")
	@CacheLookup
	WebElement inputStreetName;
	
	@FindBy(xpath="//input[contains(@name,'City')]")
	@CacheLookup
	WebElement inputCity;
	
	@FindBy(xpath="//input[contains(@name,'Zip')]")
	@CacheLookup
	WebElement inputZip;
	
	@FindBy(xpath="//input[contains(@name,'PhoneNumber')]")
	@CacheLookup
	WebElement inputPhoneNumber;
	
	@FindBy(xpath="//input[contains(@name,'UserName')]")
	@CacheLookup
	WebElement inputUserName;
	
	@FindBy(xpath="//input[contains(@name,'Password')]")
	@CacheLookup
	WebElement inputPassword;
	
	@FindBy(xpath="//input[contains(@name,'Email')]")
	@CacheLookup
	WebElement inputEmail;
	
	@FindBy(xpath="//select[@id='State']")
	@CacheLookup
	WebElement selectState;
	
	@FindBy(xpath="//input[@id='BirthDate']")
	@CacheLookup
	WebElement inputBirthDate;
	
	@FindBy(xpath="//mat-error[@id='errormessage']")
	@CacheLookup
	WebElement divCommonErrMsg;
	
	@FindBy(xpath="//mat-error[@id='mat-error-1']")
	@CacheLookup
	WebElement divFNErrMsg;
	
	@FindBy(xpath="//mat-error[@id='mat-error-2']")
	@CacheLookup
	WebElement divLNErrMsg;
	
	@FindBy(xpath="//mat-error[@id='mat-error-3']")
	@CacheLookup
	WebElement divAddrsErrMsg;
	
	@FindBy(xpath="//mat-error[@id='mat-error-4']")
	@CacheLookup
	WebElement divStreetErrMsg;
	
	@FindBy(xpath="//mat-error[@id='mat-error-5']")
	@CacheLookup
	WebElement divZipErrMsg;
	
	@FindBy(xpath="//mat-error[@id='mat-error-6']")
	@CacheLookup
	WebElement divCityErrMsg;
	
	@FindBy(xpath="//mat-error[@id='mat-error-7']")
	@CacheLookup
	WebElement divStateErrMsg;
	
	@FindBy(xpath="//mat-error[@id='mat-error-8']")
	@CacheLookup
	WebElement divPhNoErrMsg;
	
	@FindBy(xpath="//mat-error[@id='mat-error-9']")
	@CacheLookup
	WebElement divBDateErrMsg;
	
	@FindBy(xpath="//mat-error[@id='mat-error-10']")
	@CacheLookup
	WebElement divUNErrMsg;
	
	@FindBy(xpath="//mat-error[@id='mat-error-11']")
	@CacheLookup
	WebElement divPwdErrMsg;
	
	@FindBy(xpath="//mat-error[@id='mat-error-12']")
	@CacheLookup
	WebElement divUNexistsInfoErrMsg;
	
	@FindBy(xpath="//div[text()='Registration Successful']")
	@CacheLookup
	WebElement divSuccessSignUpMsg;
			
	public void ClickBtnRegister() {
		btnRegister.click();
	}
	

	public String getRegSiteHeader() {
		 return spanRegSiteHeader.getText();	
		 
	}
	public String GetLoginBtnText() {
		return btnLogin.getText();
	}
	
	public void ClickBtnLogin() {
		btnLogin.click();
	}
	public Boolean isLoginPageHeaderVisible() {
		return headerLoginPage.isDisplayed();
	}
	
	public void ClickBtnSignUp() {
		btnSignUp.click();
	}
	
	public String GetSignUpBtnText() {
		return btnSignUp.getText();
	}
	
	public void setRegFormControlValues(RegFormControls RGControl,String value) {
		
		try {
			if(RGControl.equals(RegFormControls.FirstName))
			{
				inputFirstName.sendKeys(value);
				
				
			}
			else if(RGControl.equals(RegFormControls.LastName))
			{
				 inputLastName.sendKeys(value);
			}
			else if(RGControl.equals(RegFormControls.Address))
			{
				inputAddress.sendKeys(value);
			}	
			else if(RGControl.equals(RegFormControls.StreetName))
			{
				inputStreetName.sendKeys(value);
			}
			else if(RGControl.equals(RegFormControls.City))
			{
				inputCity.sendKeys(value);
			}
			else if(RGControl.equals(RegFormControls.Zip))
			{
				inputZip.sendKeys(value);
			}
			else if(RGControl.equals(RegFormControls.PhoneNumber))
			{
				inputPhoneNumber.sendKeys(value);
			}
			else if(RGControl.equals(RegFormControls.UserName))
			{
				inputUserName.sendKeys(value);
			}
			else if(RGControl.equals(RegFormControls.Password))
			{
				inputPassword.sendKeys(value);
			}
			else if(RGControl.equals(RegFormControls.Email))
			{
				inputEmail.sendKeys(value);
			}
			else if(RGControl.equals(RegFormControls.State))
			{
				Select drpState = new Select(selectState);
				drpState.selectByVisibleText(value);
			}
			else if(RGControl.equals(RegFormControls.Birthdate))
			{
				inputBirthDate.sendKeys(value);
			}		
		}
		catch(Exception ex) {
			System.out.println(RGControl.toString() + " control is not implemented yet");
		}
	}
	
	public String getRegFormControlValues(RegFormControls RGControl) {
		String Value ="";
		if(RGControl.equals(RegFormControls.FirstName))
		{
			Value= inputFirstName.getText();
		}
		else if(RGControl.equals(RegFormControls.LastName))
		{
			Value= inputLastName.getText();
		}
		else if(RGControl.equals(RegFormControls.Address))
		{
			Value= inputAddress.getText();
		}	
		else if(RGControl.equals(RegFormControls.StreetName))
		{
			Value= inputStreetName.getText();
		}
		else if(RGControl.equals(RegFormControls.City))
		{
			Value= inputCity.getText();
		}
		else if(RGControl.equals(RegFormControls.Zip))
		{
			Value= inputZip.getText();
		}
		else if(RGControl.equals(RegFormControls.PhoneNumber))
		{
			Value= inputPhoneNumber.getText();
		}
		else if(RGControl.equals(RegFormControls.UserName))
		{
			Value= inputUserName.getText();
		}
		else if(RGControl.equals(RegFormControls.Password))
		{
			Value= inputPassword.getText();
		}
		else if(RGControl.equals(RegFormControls.Email))
		{
			Value= inputEmail.getText();
		}
		else if(RGControl.equals(RegFormControls.State))
		{
			Select drpState = new Select(selectState);
			Value= drpState.getFirstSelectedOption().getText();
		}
		else if(RGControl.equals(RegFormControls.Birthdate))
		{
			Value= inputBirthDate.getText();
		}
		return Value;
	}

	public String getErrMsgSignUp() {
	 return divCommonErrMsg.getText();		
	}
	
	public String getFNErrMsg() {
		 return divFNErrMsg.getText();		
	}
	
	
	public String getLNErrMsg() {
		 return divLNErrMsg.getText();		
	}
	
	public String getAddrsErrMsg() {
		 return divAddrsErrMsg.getText();		
	}
	
	public String getStreetErrMsg() {
		 return divStreetErrMsg.getText();		
	}
	
	public String getZipErrMsg() {
		 return divZipErrMsg.getText();		
	}
	
	public String getCityErrMsg() {
		 return divCityErrMsg.getText();		
	}
	
	public String getStateErrMsg() {
		 return divStateErrMsg.getText();		
	}
	
	public String getPhNoErrMsg() {
		 return divPhNoErrMsg.getText();		
	}
	
	public String getBithDtErrMsg() {
		 return divBDateErrMsg.getText();		
	}
	
	public String getUNErrMsg() {
		 return divUNErrMsg.getText();		
	}
	
	public String getPwdErrMsg() {
		 return divPwdErrMsg.getText();		
	}
	
	public String getUNExistsInfoErrMsg() {
		 return divUNexistsInfoErrMsg.getText();		
	}
	
	public String getSuccessfulSignUpMsg() {
		 return divSuccessSignUpMsg.getText();		
	}
	
}



