package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class PaginationPageobject {
	@FindBy(xpath = "//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']")
	@CacheLookup
	WebElement Pagination;
	@FindBy(xpath = "//div[@class='p-datatable-footer ng-star-inserted']/*")
	@CacheLookup
	WebElement PaginationEntry;
	@FindBy(xpath = "//div//button[@class='p-paginator-first p-paginator-element p-link p-disabled p-ripple ng-star-inserted']")
	@CacheLookup
	WebElement PaginatorButton;
	@FindBy(xpath = "//span[text()='Showing 1 to 4 of 4 entries']")
	@CacheLookup
	WebElement PaginatioText;
	WebDriver driver;
	public PaginationPageobject(WebDriver WebDriver) {
		PageFactory.initElements(WebDriver, this);
	}
	public void PaginationPresence() {
		String s1 = Pagination.getText();
		System.out.println("Contains ###" + s1);
		Assert.assertTrue(Pagination.getText().contains("entries"));
	}
	public boolean PaginationEntry() {
		Pagination.getText();
		Assert.assertTrue(Pagination.getText().contains("5"));
		return PaginatorButton.getText().contains("enabled");
	}
	public void paginationText() {
		String s1 = Pagination.getText();
		System.out.println("####PageObjects1" + s1);
		Assert.assertTrue(Pagination.getText().contains("entries"));
	}
	public void tablefooter() {
		PaginationEntry.getText().contains(" In total there are 4 users.");
	}
}