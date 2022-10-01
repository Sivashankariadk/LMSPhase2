package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DeletePageObject {
	@FindBy(xpath = "//button[@class='p-button-danger p-button p-component p-button-icon-only']/span")
	@CacheLookup
	WebElement Delete;
	@FindBy(xpath = "/tbody/tr[1]/td[1]/p-tablecheckbox/div/div[2]")
	@CacheLookup
	WebElement checkbox;
	WebDriver driver;
	public DeletePageObject(WebDriver WebDriver) {
		PageFactory.initElements(WebDriver, this);
	}
	public void DeleteButton() {
		String Del = Delete.getText();
		System.out.println("Delete" + Del);
	}
	public void DeleteClick() {
		Delete.click();	
	}
	public void SelectRow() {
		checkbox.click();
		
	}
	}