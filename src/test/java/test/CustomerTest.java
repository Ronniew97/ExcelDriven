package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CustomerPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class CustomerTest {

	WebDriver driver;
	
	ExcelReader reader = new ExcelReader("data\\TechfiosData.xlsx");
	String username = reader.getCellData("Login", "Username", 2);
	String password = reader.getCellData("Login", "Password", 2);
	String fullname = reader.getCellData("Customer", "FullName", 2);
	String company = reader.getCellData("Customer", "Company", 2);
	String email = reader.getCellData("Customer", "Email", 2);
	String number = reader.getCellData("Customer", "Phone", 2);
	String address = reader.getCellData("Customer", "Address", 2);
	String city = reader.getCellData("Customer", "City", 2);
	String state = reader.getCellData("Customer", "State", 2);
	String zip = reader.getCellData("Customer", "Zip", 2);
	String country = reader.getCellData("Customer", "Country", 2);
	String group = reader.getCellData("Customer", "Group", 2);
	String pass = reader.getCellData("Customer", "Password", 2);
	String cpass = reader.getCellData("Customer", "ConfirmPassword", 2);
	
	@Test
	public void validCustomerShouldBeAbleToAddHisContact() {
		driver = BrowserFactory.init();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName(username);
		login.enterPassword(password);
		login.clickSignInButton();
		CustomerPage customer = PageFactory.initElements(driver, CustomerPage.class);
		customer.clickCustomersButton();
		customer.clickAddCustomersButton();
		customer.enterFullName(fullname);
		customer.selectCompany(company);
		customer.enterEmail(email);
		customer.enterPhoneNumber(number);
		customer.enterAddress(address);
		customer.enterCity(city);
		customer.enterState(state);
		customer.enterZip(zip);
		customer.selectCountry(country);
		customer.selectGroup(group);
		customer.createPassword(pass);
		customer.confirmPassword(cpass);
		customer.clickSaveButton();
	}
}
