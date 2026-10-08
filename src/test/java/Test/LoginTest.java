package Test;

import org.testng.annotations.Test;

import Base.BaseClass;
import Page.LoginPage;

public class LoginTest extends BaseClass 
{
	@Test
	public void login()
	{
		test=extent.createTest("login");
		LoginPage lo=new LoginPage(driver);
		lo.loginCredentials("standard_user", "secret_sauce");
		lo.clickButton();
	}
}
