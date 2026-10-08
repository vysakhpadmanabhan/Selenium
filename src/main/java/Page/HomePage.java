package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;
	
	By verifytext=By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By sort=By.xpath("//*[@class='product_sort_container']");
	By addtocartbag=By.id("add-to-cart-sauce-labs-backpack");
	By addtocartlight=By.id("add-to-cart-sauce-labs-bike-light");
	By addtocarttshirt=By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	By addtocartjacket=By.id("add-to-cart-sauce-labs-fleece-jacket");
	By addtocartonesie=By.id("add-to-cart-sauce-labs-onesie");
	By addtocartallthethongs=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	By addtocarticon=By.id("shopping_cart_container");
	By verifycarttext=By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By continuebutton=By.name("continue-shopping");
	By checkout=By.id("checkout");
	By verifycotext=By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By firstnamefield=By.id("first-name");
	By lastnamefield=By.id("last-name");
	By postalcosefield=By.id("postal-code");
	By contbutton=By.name("continue");
	By finishbutton=By.name("finish");
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public String verifyText()
	{
		return driver.findElement(verifytext).getText();
	}
	
	
	public void sort()
	{
		WebElement day=driver.findElement(sort);
		Select dayelement=new Select(day);
		dayelement.selectByValue("lohi");
	}
	
	
	public void addToCart()
	{
			driver.findElement(addtocartbag).click();
			driver.findElement(addtocartlight).click();
			driver.findElement(addtocarttshirt).click();
			driver.findElement(addtocartjacket).click();
			driver.findElement(addtocartonesie).click();
			driver.findElement(addtocartallthethongs).click();
	}
	
	
	public void cart()
	{
		driver.findElement(addtocarticon).click();
	}
	
	
	public String verifyCartText()
	{
		return driver.findElement(verifycarttext).getText();
	}
	
	
	public void verifyButtons()
	{
		driver.findElement(continuebutton).isEnabled();
		driver.findElement(checkout).isEnabled();
	}
	
	
	public void clickCheckout()
	{
		driver.findElement(checkout).click();
	}
	
	
	public String veriftCOtext()
	{
		return driver.findElement(verifycotext).getText();
	}
	
	
	public void formDetails(String firstname,String lastname,int postno)
	{
		driver.findElement(firstnamefield).sendKeys(firstname);
		driver.findElement(lastnamefield).sendKeys(lastname);
		driver.findElement(postalcosefield).sendKeys(String.valueOf(postno));
	}
	
	
	public void clickContinue() 
	{
		driver.findElement(contbutton).click();
	}
	
	public void clickFinish()
	{
		driver.findElement(finishbutton).click();
	}

}
