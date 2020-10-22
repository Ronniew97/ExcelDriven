package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BasePage;

public class CustomerPage extends BasePage{

	WebDriver driver;
	
	public CustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMERS_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADDCUSTOMERS_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@name='account']") WebElement FULL_NAME_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']") WebElement COMPANY_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='email']") WebElement EMAIL_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='phone']") WebElement PHONE_NUMBER_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='address']") WebElement ADDRESS_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='city']") WebElement CITY_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='state']") WebElement STATE_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='zip']") WebElement ZIP_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@name='country']") WebElement COUNTRY_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@name='group']") WebElement GROUP_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='password']") WebElement CREATEPASSWORD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@name='cpassword']") WebElement CONFIRM_PASSWORD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//button[@class='md-btn md-btn-primary waves-effect waves-light']") WebElement SAVE_BUTTON_LOCATOR;

	public void clickCustomersButton() {
		explicitWait("clickable",driver,10,CUSTOMERS_BUTTON);
		CUSTOMERS_BUTTON.click();
	}
	
	public void clickAddCustomersButton() {
		explicitWait("visible",driver,5,ADDCUSTOMERS_BUTTON);
		ADDCUSTOMERS_BUTTON.click();
	}
	
	public void enterFullName(String fullname) {
		explicitWait("visible",driver,10,FULL_NAME_LOCATOR);
		FULL_NAME_LOCATOR.sendKeys(fullname);
	}
	
	public void selectCompany(String company) {
		dropDownBox(COMPANY_LOCATOR, company);
	}
	
	public void enterEmail(String email) {
		EMAIL_LOCATOR.sendKeys(email+randomNum()+"@email.com");
	}
	
	public void enterPhoneNumber(String number) {
		PHONE_NUMBER_LOCATOR.sendKeys(number+randomNum());
	}
	
	public void enterAddress(String address) {
		ADDRESS_LOCATOR.sendKeys(address);
	}
	
	public void enterCity(String city) {
		CITY_LOCATOR.sendKeys(city);
	}
	
	public void enterState(String state) {
		STATE_LOCATOR.sendKeys(state);
	}
	
	public void enterZip(String zip) {
		ZIP_LOCATOR.sendKeys(zip);
	}
	
	public void selectCountry(String country) {
		dropDownBox(COUNTRY_LOCATOR, country);
	}
	
	public void selectGroup(String group) {
		dropDownBox(GROUP_LOCATOR, group);
	}
	
	public void createPassword(String pass) {
		CREATEPASSWORD_LOCATOR.sendKeys(pass);
	}
	
	public void confirmPassword(String cpass) {
		CONFIRM_PASSWORD_LOCATOR.sendKeys(cpass);
	}
	
	public void clickSaveButton() {
		SAVE_BUTTON_LOCATOR.click();
	}
	
}
