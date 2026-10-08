package Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	
	
	By usernamefield=By.id("user-name");
	By passwordfield=By.id("password");
	By loginbutton=By.id("login-button");
	
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void loginCredentials(String username,String password)
	{
		driver.findElement(usernamefield).sendKeys(username);
		driver.findElement(passwordfield).sendKeys(password);
	}
	
	
	public void clickButton()
	{
		driver.findElement(loginbutton).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
	}

}
