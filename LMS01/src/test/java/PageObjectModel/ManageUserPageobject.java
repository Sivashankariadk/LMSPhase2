package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ManageUserPageobject {
	@FindBy(xpath = "//span[text()='User']")
	@CacheLookup
	WebElement User;
	WebDriver driver;
	public ManageUserPageobject(WebDriver WebDriver) {
		PageFactory.initElements(WebDriver, this);
	}
	public void Usermoduleclick() {
		User.click();
	}
}