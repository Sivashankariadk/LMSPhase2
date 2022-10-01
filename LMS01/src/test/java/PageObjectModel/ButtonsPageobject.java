package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ButtonsPageobject {
	@FindBy(xpath = "//span[text()='Add New User']")
	@CacheLookup
	WebElement AddNewUser;
	@FindBy(xpath = "//button//span[@class='p-dialog-header-close-icon ng-tns-c132-6 pi pi-times']")
	@CacheLookup
	WebElement AddNewUseClose;
	@FindBy(xpath = "//tbody//tr[1]//td[8]//span[@class='p-button-icon pi pi-pencil']")
	@CacheLookup
	WebElement EditDeleteButton;
	@FindBy(xpath = "//button//span[@class='p-dialog-header-close-icon ng-tns-c132-6 pi pi-times']")
	@CacheLookup
	WebElement EditDeleteButtonclose;
	@FindBy(xpath = "//tbody//tr[1]//td[8]//span[@class='p-button-icon pi pi-trash']")
	@CacheLookup
	WebElement DeleteButton;
	@FindBy(xpath = "//span[@class='pi pi-times ng-tns-c133-8']")
	@CacheLookup
	WebElement DeleteClose;
	@FindBy(xpath = "//th[text()=' Edit / Delete']")
	@CacheLookup
	WebElement EditDeletePresence;
	WebDriver driver;
	public ButtonsPageobject(WebDriver WebDriver) {
		PageFactory.initElements(WebDriver, this);
	}
	public String AddNewUserPrence() {
		String Addbutton = AddNewUser.getText();
		return Addbutton;
	}
	public void AddnewUser() {
		AddNewUser.click();
	}
	public void AddnewUserClose() {
		AddNewUseClose.click();
	}
	public String EditDeletePrence() {
		String EditDelete = EditDeletePresence.getText();
		System.out.println("####check" + EditDelete);
		return EditDelete;
	}
	public void EditDeleteClick() {
		EditDeleteButton.click();
	}
	public void EditDeleteButtonclose() {
		EditDeleteButtonclose.click();
	}
	public void DeleteClick() {
		DeleteButton.click();
	}
	public void DeleteClose() {
		DeleteClose.click();
	}
}