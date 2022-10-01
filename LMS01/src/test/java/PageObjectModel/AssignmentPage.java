package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Utility.Helper;

public class AssignmentPage extends BaseClass {

	public AssignmentPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//button[4]/span[@class='mat-button-wrapper']")
	public WebElement AssignmentHeader;

	@FindBy(xpath = "//div[1][@class='box']")
	public WebElement ManageAssignmentHeader;

	@FindBy(xpath = "//span[contains(text(),'Showing 1 to 3 of 3 entries')]")
	public WebElement ShowingEntries;

	@FindBy(xpath = "//div[contains(text(),'In total there are 3 assignments.')]")
	public WebElement AssignementFooterMsg;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement SearchBox;

	@FindBy(xpath = "//tbody//div[@role='checkbox']")
	public WebElement CheckBox;

	@FindBy(xpath = "//thead//div[@class='p-checkbox-box']")
	public WebElement CommonCheckBox;

	@FindBy(xpath = "//td[contains(text(),'Sql Assignment')]")
	public WebElement SqlAssignment;

	@FindBy(xpath = "//td[contains(text(),'SQL Practice')]")
	public WebElement SqlPractice;

	@FindBy(xpath = "//tr[1]/td[contains(text(),'5/5/2022')]")
	public WebElement SqlDate;

	@FindBy(xpath = "//td[contains(text(),'sql')]")
	public WebElement Sql;

	@FindBy(xpath = "//td[contains(text(),'sql language')]")
	public WebElement SqlLanguage;
	
	//span[@class='p-button-icon pi pi-pencil']
	@FindBy(xpath = "//tbody//tr[1]//div/span/button//span[@class='p-button-icon pi pi-pencil']")
	public WebElement EditIcon;

	@FindBy(xpath = "//tbody//tr[1]//span[@class='p-button-icon pi pi-trash']")
	public WebElement DeleteIcon;

	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	public WebElement DeleteConfirmWindow;

	@FindBy(xpath = "//span[contains(text(),'Assigment Details')]")
	public WebElement AssignmentDetails;

	@FindBy(xpath = "//input[@id='assignment']")
	public WebElement AssignmentName;

	@FindBy(xpath = "//tr//th[@psortablecolumn='assignmentName']")
	public WebElement Header_AssignmentName;

	@FindBy(xpath = "//tr//th[@psortablecolumn='assignmentDescription']")
	public WebElement Header_AssignmentDescription;

	@FindBy(xpath = "//input[@id='assignment']")
	public WebElement NewAssignmentName;

	@FindBy(xpath = "//input[@id='assignmentDescription']")
	public WebElement AssignmentDescription;

	@FindBy(xpath = "//input[@id='assignmentDescription']")
	public WebElement NewAssignmentDescription;

	@FindBy(xpath = "//input[@id='assignmentGraderId']")
	public WebElement AssignmentGrade;

	@FindBy(xpath = "//input[@id='assignmentGraderId']")
	public WebElement NewAssignmentGrade;
	
	@FindBy(xpath = "//input[@id='icon']")
	public WebElement AssignmentDueDate;

	@FindBy(xpath = "//input[@id='icon']")
	public WebElement NewAssignmentDueDate;

	@FindBy(xpath = "//th[@psortablecolumn='assignmentComments']")
	public WebElement AssignmentDueDatechanged;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElement SaveButton;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElement NewAssignmentSaveButton;

	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	public WebElement CancelButton;

	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	public WebElement NewCancelButton;

	@FindBy(xpath = "//div/button//span[contains(text(),'Yes')]")
	public WebElement YesButton;

	@FindBy(xpath = "//div/button[1]//span[contains(text(),'No')]")
	public WebElement NoButton;

	@FindBy(xpath = "//mat-card-title//button//span[@class='p-button-icon pi pi-trash']")
	public WebElement CommonDeleteButton;

	@FindBy(xpath = "//span[contains(text(),'A New Assignment')]")
	public WebElement NewAssignmentButton;

	@FindBy(xpath = "//span[@id='pr_id_5-label']")
	public WebElement NewAssignmentDetailsWindow;

	@FindBy(xpath = "//div/small")
	public WebElement NameIsRequiredMSg;

	@FindBy(xpath = "//div[contains(text(),'Successful')]")
	public WebElement SuccessMSg;

	@FindBy(xpath = "//div[contains(text(),'Successful')]")
	public WebElement DeleteSuccessMSg;

	@FindBy(xpath = "//div[contains(text(),'Successful')]")
	public WebElement NewAssignmentSuccessMSg;

	public void checkTitle() {
		String title = Helper.getTitle();
		Assert.assertEquals(title, "LMS");
	}

	public void clickAssignementHeader() {
		AssignmentHeader.click();
	}

	public void checkShowingEntries() {
		Assert.assertTrue(ShowingEntries.isDisplayed());
	}

	public void checkManageAssignmentHeader() {
		Assert.assertTrue(ManageAssignmentHeader.isDisplayed());
	}

	public void checkAssignementFooterMsg() {
		Assert.assertTrue(AssignementFooterMsg.isDisplayed());
	}

	public void checkSearchBox() {
		Assert.assertTrue(SearchBox.isDisplayed());
	}

	public void EnterSearchBox() {
		SearchBox.sendKeys("sql");
	}

	public void checkSqlAssignment() {
		Assert.assertTrue(SqlAssignment.isDisplayed());
	}

	public void EnterCheckBox() {
		CheckBox.click();
	}

	public void EnterCommonCheckBox() {
		CommonCheckBox.click();
	}

	public void ClickEditIcon() {
		EditIcon.click();
	}

	public void ClickDeleteIcon() {
		DeleteIcon.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ClickCommonDeleteButton() {
		CommonDeleteButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void checkAssignmentDetails() {
		// Assert.assertTrue(AssignmentDetails.isDisplayed());
	}

	public void EnterAssignmentName() {
		AssignmentName.clear();
		AssignmentName.sendKeys("sql");
		SaveButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void checkSql() {
		Assert.assertTrue(Sql.isDisplayed());
	}

	public void EnterAssignmentDescription() {
		AssignmentDescription.clear();
		AssignmentDescription.sendKeys("sql language");
		SaveButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void checkSqllanguage() {
		Assert.assertTrue(SqlLanguage.isDisplayed());

	}

	public void EnterAssignmentGrade() {
		AssignmentGrade.clear();
		AssignmentGrade.sendKeys("2");
		SaveButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void EnterAssignmentDueDate() {
		AssignmentDueDate.clear();
		AssignmentDueDate.sendKeys("05/06/2022");
		SaveButton.click();

	}

	public void checkAssignmentDueDate() {
		Assert.assertTrue(AssignmentDueDatechanged.isDisplayed());

	}

	public void ClickCancelButton() {
		CancelButton.click();
	}

	public void ClickNewCancelButton() {
		NewCancelButton.click();
	}

	public void ClickYesButton() {
		YesButton.click();
	}

	public void ClickNoButton() {
		NoButton.click();
	}

	public void ClickSaveButton() {
		SaveButton.click();

	}

	public void ClickNewAssignmentSaveButton() {
		NewAssignmentSaveButton.click();
	}

	public void VerifyDeleteConfirmWindow() {
		Assert.assertTrue(DeleteConfirmWindow.isDisplayed());
	}

	public void ClickNewAssignmentButton() {
		NewAssignmentButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void VerifyNewAssignmentDetailsWindow() {
		Assert.assertTrue(NewAssignmentDetailsWindow.isDisplayed());
	}

	public void VerifyNameIsRequiredMSg() {
		Assert.assertTrue(NameIsRequiredMSg.isDisplayed());
	}

	public void EnterNewAssignmentName() {
		NewAssignmentName.clear();
		NewAssignmentName.sendKeys("sql");
	}

	public void CheckNewAssignmentName() {
		Assert.assertTrue(NewAssignmentName.isDisplayed());
	}

	public void EnterNewAssignmentDescription() {
		NewAssignmentDescription.clear();
		NewAssignmentDescription.sendKeys("sql language");
	}

	public void CheckNewAssignmentDescription() {
		Assert.assertTrue(NewAssignmentDescription.isDisplayed());
	}

	public void EnterNewAssignmentGrade() {
		NewAssignmentGrade.clear();
		NewAssignmentGrade.sendKeys("2");
	}

	public void CheckNewAssignmentGrade() {
		Assert.assertTrue(NewAssignmentGrade.isDisplayed());
	}

	public boolean isElementVisible(WebElement webElement, Duration timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(Helper.getDriver(), Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(webElement));
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public void ViewSuccessMsg() {

		Assert.assertTrue(SuccessMSg.isDisplayed());
	}

	public void ViewDeleteSuccessMsg() {

		Assert.assertTrue(DeleteSuccessMSg.isDisplayed());
	}

	public void ViewNewAssignmentSuccessMsg() {

		Assert.assertTrue(NewAssignmentSuccessMSg.isDisplayed());
	}

	public void EnterNewAssignmentDueDate() {
		NewAssignmentDueDate.clear();
		NewAssignmentDueDate.sendKeys("05/06/2022");
	}

	public void CheckNewAssignmentDueDate() {
		 Assert.assertTrue(AssignmentDueDatechanged.isDisplayed());
	}

	public void clickAssignmentAscendingOrder() {

		Header_AssignmentName.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickAssignmentDescriptionAscendingOrder() {

		Header_AssignmentDescription.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickAssignmentDescendingOrder() {

		Header_AssignmentName.click();

	}

	public void clickAssignmentDescriptionDescendingOrder() {

		Header_AssignmentDescription.click();

	}

}
