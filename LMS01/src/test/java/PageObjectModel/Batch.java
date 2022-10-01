package PageObjectModel;


	


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;

import Utility.Helper;
	

	public class Batch extends BaseClass{
		//creating constructor
			public Batch(WebDriver webDriver)
			{
				
				PageFactory.initElements(webDriver,this);
			}
			@FindBy(xpath = "//span[text()='Batch']")
			public WebElement BatchButton;
			@FindBy(xpath = "//mat-card-title[@class='mat-card-title']/div[text()=' Manage Batch']")
			public WebElement ManageBatchtitle;
			@FindBy(xpath = "//button[@class='p-button-danger p-button p-component p-button-icon-only']")
			public WebElement DeleteButton;
			@FindBy(xpath = "//input[@placeholder='Search...']")
			public WebElement searchbox;
			@FindBy(xpath = "//button[text()='5']")
			public WebElement rowsofdata5 ;
			@FindBy(xpath = "//span[text()=' LMS - Learning Management System ']")
			public WebElement lmshomepage ;
			//batchnamesearchbatch
			@FindBy(xpath = "//button[@class='p-button-rounded p-button-success p-button p-component p-button-icon-only']")
			public WebElement editbutton  ;
			@FindBy(xpath = "//label[@for='batchName']")
			public WebElement Batchdetailform  ;
			@FindBy(xpath = "//input[@id='batchName']")
			public WebElement editName  ;
			@FindBy(xpath = "//input[@class='p-inputtext p-component p-filled ng-untouched ng-pristine ng-valid']")
			public WebElement editdescription  ;
			@FindBy(xpath = "//input[@placeholder='Select a Program name']")
			public WebElement editprogramname  ;
			@FindBy(xpath = "//div[@class='p-radiobutton-box p-highlight']")
			public WebElement statusactive  ;
			@FindBy(xpath = "//input[@id='INACTIVE']")
			public WebElement statusinactive  ;
			@FindBy(xpath = "//input[@id='batchNoOfClasses']")
			public WebElement editnoofclasses  ;
			@FindBy(xpath = "//button[@ng-reflect-label='Cancel']")
			public WebElement batchdetailformcancel  ;
			@FindBy(xpath = "//button[@ng-reflect-label='Save']")
			public WebElement batchdetailformsave  ;
			//14th line User searches with newly updated "Batch Name"
			@FindBy(xpath = "//div[@class='p-checkbox-box p-component']")
			public WebElement checkboxbatchpage  ;
			@FindBy(xpath = "//span[@class='p-checkbox-icon pi pi-check']")
			public WebElement checkboxbatchpage2  ;
			//multipledeleteyes
			@FindBy(xpath = "//button[@ng-reflect-label='Yes']")
			public WebElement multipledelteconfirmyes  ;
			@FindBy(xpath = "//span[text()='Are you sure you want to delete the selected batches?']")
			public WebElement multipledelteconfirm  ;
			@FindBy(xpath = "//button[@ng-reflect-label='No']")
			public WebElement multipledelteconfirmno  ;
			@FindBy(xpath = "//button[@ng-reflect-label='No']")
			public WebElement deletedsearchbatchname  ;
			
			//delete batch
			@FindBy(xpath = "//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']")
			public WebElement detelebutton  ;
			@FindBy(xpath = "//span[text()='Yes']")
			public WebElement deteleconfirmyes  ;
			@FindBy(xpath = "//button[@ng-reflect-label='No']")
			public WebElement deteleconfirmno  ;
			@FindBy(xpath = "//button[@ng-reflect-label='No']")
			public WebElement detelepopup  ;
			//
			@FindBy(xpath = "//button[@ng-reflect-label='A New Batch']")
			public WebElement addnewbatchbutton  ;
			@FindBy(xpath = "//small[@class='p-invalid ng-star-inserted']")
			public WebElement namereq  ;
			@FindBy(xpath = "//span[text()='Save']")
			public WebElement addnewbatchsave  ;
			@FindBy(xpath = "//button[@ng-reflect-label='Cancel']")
			public WebElement addnewbatchcancel  ;
			@FindBy(xpath = "//input[@id='batchName']")
			public WebElement addnewbatchentername  ;
			@FindBy(xpath = "//input[@id='batchDescription']	")
			public WebElement addnewbatchenterdescription  ;
			@FindBy(xpath = "//input[@placeholder='Select a Program name']	")
			public WebElement addnewbatchdropdownprog  ;
			@FindBy(xpath = "//p-radiobutton[@ng-reflect-value='ACTIVE']	")
			public WebElement addnewbatchactive ;
			@FindBy(xpath = "//p-radiobutton[@ng-reflect-value='INACTIVE']	")
			public WebElement addnewbatchinactive ;
			@FindBy(xpath = "//input[@id='batchNoOfClasses']	")
			public WebElement addnewbatchnoofclass ;
			@FindBy(xpath = "//button[@ng-reflect-label='Save']	")
			public WebElement newbatchaddedsave ;
			//pagination
			@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-right']	")
			public WebElement paginationrightangle ;
			@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-left']	")
			public WebElement paginationleftangle ;
			@FindBy(xpath = "//button[@class='p-paginator-next p-paginator-element p-link p-ripple p-disabled']	")
			public WebElement paginationverifynext ;
			//ascending
			@FindBy(xpath = "//th[@aria-sort='ascending']	")
			public WebElement ascendingarrowbatchname ;
			@FindBy(xpath = "//th[@aria-sort='ascending']	")
			public WebElement ascendingarrowbatchdescription ;
			@FindBy(xpath = "//th[@aria-sort='ascending']	")
			public WebElement ascendingarrowbatchstatus ;
			@FindBy(xpath = "//th[@aria-sort='ascending']	")
			public WebElement ascendingarrowbatchnoofclass ;
			@FindBy(xpath = "//th[@aria-sort='ascending']	")
			public WebElement ascendingarrowbatchprogramname ;
			//descending
			@FindBy(xpath = "//th[@aria-sort='descending']	")
			public WebElement descendingarrowbatchname ;
			@FindBy(xpath = "//th[@aria-sort='descending']	")
			public WebElement descendingarrowbatchdescription ;
			@FindBy(xpath = "//th[@aria-sort='descending']	")
			public WebElement descendingarrowbatchstatus ;
			@FindBy(xpath = "//th[@aria-sort='descending']	")
			public WebElement descendingarrowbatchnoofclasses ;
			@FindBy(xpath = "//th[@aria-sort='descending']	")
			public WebElement descendingarrowbatchprogname ;
	public void verifyTitle() {
		
		String title1 = Helper.getTitle();
		Assert.assertEquals(title1, "Manage Batch");
	}
	public void batchbuttonclick() {
		BatchButton.click();
	}
	public void onbatchpage() {
		ManageBatchtitle.isDisplayed();
	}
	public void onlmshomepage() {
		lmshomepage.isDisplayed();
	}

	public Boolean DeleteDisabled() {
		boolean actualvalue=DeleteButton.isEnabled();
		if(actualvalue) {
			System.out.println("Button is enabled");
		}
			else {
				System.out.println("Button is disabled");
		}
		return actualvalue;
	}
	public void verifyrow5() {
		rowsofdata5.isDisplayed();
	}
	public void searchBatchname(String bname) {
		searchbox.click();
		searchbox.sendKeys(bname);
	}

	public void editbutton() {
		editbutton.click();
	}
	public void editbatchname(String editbatchname) {
		editName.clear();
		editName.sendKeys(editbatchname);
		
	}
	public void editedbatchname() {
		
		editName.isDisplayed();
		
	}
	public void editedbatchprogname() {
		
		editprogramname.isDisplayed();
		
	}
	public void editbatchdescribtion(String editbatchdescrib) {
		editdescription.clear();
		editdescription.sendKeys(editbatchdescrib);
	}
	public void editeddescripname() {
		
		editdescription.isDisplayed();
		
	}
	public void editprogname(String editbatchprogname) {
		editprogramname.clear();
		editprogramname.sendKeys(editbatchprogname);
	}
	public Boolean changestatus() {
		boolean result=statusinactive.isSelected();
		if( result==false) {
			statusinactive.click();
		}
		return result;
	}
	public void changedstatus() {
		statusinactive.isDisplayed();
	}
		public void editbatchclass(String noofclassedit) {
			editnoofclasses.clear();
			editnoofclasses.sendKeys(noofclassedit);
		}
		public void editedclasses() {
			editnoofclasses.isDisplayed();
		}
		public void cancelbatch() {
			batchdetailformcancel.click();
		}
	public void batchform() {
		Batchdetailform.isDisplayed();
	}

	public void batchformsave() {
		batchdetailformsave.click();
	}
	//14not
	public void checkbox() {
		checkboxbatchpage.click();
		checkboxbatchpage2.click();
	}
	public void multipledelete() {
		DeleteButton.click();
	}
	public void multipledeleteconfirm() {
		multipledelteconfirm.click();
	}
	public void multipledeleteyes() {
		//multipledelteconfirmyes.click();
	}
	public void searchdeletedbatchname(String dgdg) {
		searchbox.click();
		searchbox.sendKeys(dgdg);
		
	}
	public void multipledeleteno() {
		//multipledelteconfirmno.click();
	}
	public void deleteanybatch() {
		detelebutton.click();
	}
	public void deleteanybatchpopup() {
		detelepopup.click();
	}
	public void deleteanybatchyes() {
		deteleconfirmyes.click();
	}
	//selete anathter deletebutton but xpath same for all
	public void deleteanybatchno() {
		deteleconfirmno.click();
	}
	public void deletesearch(String dgdg) {
		searchbox.click();
		searchbox.sendKeys(dgdg);
		
	}
	public void addnewbatch() {
		addnewbatchbutton.click();
		
	}
	public void addnewbatchsavenotentering() {
		addnewbatchsave.click();
		
	}
	public void addnewbatchnamerequired() {
		namereq.click();
		
	}
	public void addnewbatchcancelnotentering() {
		addnewbatchcancel.click();
		
	}	
	public void addnewbatchenterbatchname(String enterbname) {
		addnewbatchentername.sendKeys(enterbname);
		
	}	
	public void addnewbatchenterdescrip(String enterbdescrip) {
		addnewbatchentername.sendKeys(enterbdescrip);
		
	}
	public void addnewbatchenterprogname(String enterbprogn) {
		addnewbatchdropdownprog.sendKeys(enterbprogn);
		
	}
	public void changestatusaddnewbatch() {
		//	statusactive.click();
		}
	public void addnewbatchNoofclass(String noofclass) {
		addnewbatchnoofclass.sendKeys(noofclass);
	}
	public void addnewbatchsave() {
		addnewbatchsave.click();
	}
	public void newbatchsearch(String enterbname) {
		searchbox.click();
		searchbox.sendKeys(enterbname);
		
	}
	//pagination
	public void managebatchpage() {
		ManageBatchtitle.isDisplayed();	
		
	}
	public void navigatenext() {
		//paginationrightangle.click();
	}
	public void navigateprevious() {
		//paginationleftangle.click();
	}
	public void navigatelastpage() {
		paginationverifynext.click();
	}
	//ascending
	public void ascendingbatchname() {
	//	ascendingarrowbatchname.click();
	}
	public void ascendingbatchdesc() {
	//	ascendingarrowbatchdescription.click();
	}
	public void ascendingbatchstatus() {
		//ascendingarrowbatchstatus.click();
	}
	public void ascendingbatchnoofclass() {
		//ascendingarrowbatchnoofclass.click();
	}
	public void ascendingbatchprogname() {
		//ascendingarrowbatchprogramname.click();
	}
	
	public void descendingbatchname() {
		//descendingarrowbatchname.click();
	}
	public void descendingbatchdesc() {
		//descendingarrowbatchdescription.click();
	}
	public void descendingbatchstatus() {
		//descendingarrowbatchstatus.click();
	}
	public void descendingbatchnoofclass() {
		//descendingarrowbatchnoofclasses.click();
	}
	public void descendingbatchprogname() {
		//descendingarrowbatchprogname.click();
	}
	
}
