package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {
	
	WebDriver driver;

	ExcelReader reader = new ExcelReader("data\\TechfiosData.xlsx");
	String username = reader.getCellData("Login", "Username", 2);
	String password = reader.getCellData("Login", "Password", 2);
	

	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName(username);
		login.enterPassword(password);
		login.clickSignInButton();
	}
}
