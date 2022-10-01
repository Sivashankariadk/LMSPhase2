package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TableHeaderPageobject {
	@FindBy(xpath = "//thead[@class='p-datatable-thead']")
	@CacheLookup
	WebElement Tableheding;
	@FindBy(xpath = "//div[@class='p-checkbox-box']")
	@CacheLookup
	WebElement checkbox;
	WebDriver driver;
	public TableHeaderPageobject(WebDriver WebDriver) {
		PageFactory.initElements(WebDriver, this);
	}
	public String TableHeadingPresence() {
		String Tableheading = Tableheding.getText();
		System.out.println("###Table Heading" + Tableheading);
		return Tableheading;
	}
	public void CheckboxSelect() {
		checkbox.click();
	}
}