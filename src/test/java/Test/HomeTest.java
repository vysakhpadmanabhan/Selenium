package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import Page.HomePage;

public class HomeTest extends BaseClass 
{
	
	@Test(priority = 1)
	public void textVerification()
	{
	test=extent.createTest("textVerification");
	String text=home.verifyText();
	Assert.assertEquals(text, "Products");
	System.out.println("text matches");
	}
	
	
	@Test(priority = 2)
	public void sortBy()
	{
		test=extent.createTest("sortBy");
		home.sort();
	}
	
	
	@Test(priority = 3)
	public void addToCart()
	{
		test=extent.createTest("addToCart");
		home.addToCart();
	}
	
	
	@Test(priority = 4)
	public void clickCart()
	{
		test=extent.createTest("clickCart");
		home.cart();
	}
	
	
	@Test(priority = 5)
	public void verifyCartText()
	{
		test=extent.createTest("verifyCartText");
		String text=home.verifyCartText();
		Assert.assertEquals(text, "Your Cart");
		System.out.println("text matches");
	}
	
	
	@Test(priority = 6)
	public void verifyButton()
	{
		test=extent.createTest("verifyButton");
		home.verifyButtons();
		System.out.println("buttons enabled");
	}
	
	
	@Test(priority = 7)
	public void clickCheckout()
	{
		test=extent.createTest("clickCheckout");
		home.clickCheckout();
	}
	
	
	@Test(priority = 8)
	public void verifyCOText()
	{
		test=extent.createTest("verifyCOText");
		String text=home.veriftCOtext();
		Assert.assertEquals(text, "Checkout: Your Information");
		System.out.println("text matches");
	}
	
	
	@Test(priority = 9)
	public void fillForm()
	{
		test=extent.createTest("fillForm");
		home.formDetails("Vysakh", "Iyer", 686017);
		home.clickContinue();
	}
	
	
	@Test(priority = 10)
	public void clickFinishButton()
	{
		test=extent.createTest("clickFinishButton");
		home.clickFinish();
	}

}
