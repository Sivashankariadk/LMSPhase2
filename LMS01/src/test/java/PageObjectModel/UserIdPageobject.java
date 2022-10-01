package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class UserIdPageobject {
	@FindBy(xpath = "//p-button//button[1]//span[1][text()='U001']")
	@CacheLookup
	WebElement UserId1;
	@FindBy(xpath = "//p-button//button[1]//span[1][text()='U002']")
	@CacheLookup
	WebElement UserId2;
	@FindBy(xpath = "//p-button//button[1]//span[1][text()='U003']")
	@CacheLookup
	WebElement UserId3;
	@FindBy(xpath = "//p-button//button[1]//span[1][text()='U004']")
	@CacheLookup
	WebElement UserId4;
	@FindBy(xpath = "//span[text()='Cancel']")
	@CacheLookup
	WebElement Cancelbutton;
	@FindBy(xpath = "/html/body/app-root/app-user/div/p-dialog[2]/div/div/div[3]/button/span[1]")
	@CacheLookup
	WebElement Cancelbutton1;
	@FindBy(xpath = "//div[@class='p-dialog-footer ng-tns-c132-7 ng-star-inserted']/button")
	@CacheLookup
	WebElement Cancelbutton2;
	@FindBy(xpath = "//button[@type='button']//span[@class='p-dialog-header-close-icon ng-tns-c132-7 pi pi-times']")
	@CacheLookup
	WebElement Cancelbutton3;
	WebDriver driver;
	public UserIdPageobject(WebDriver WebDriver) {
		PageFactory.initElements(WebDriver, this);
	}
	public void UserIdclicking1() {
		UserId1.click();
		Cancelbutton.click();
		
		
		//UserId4.click();
		//Cancelbutton3.click();
	}
	public void UserIdclicking2() {
		UserId2.click();
	   Cancelbutton1.click();
		
	}
	public void UserIdclicking3() {
		UserId3.click();
		Cancelbutton2.click();
		
	}
	
	
	
}