package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

/*PageObject from serenity provides features like open url, findby element, webelementfacade*/
@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {

	/** We can overwrite driver using Managed(driver="chrome") **/
	
	@Managed
	WebDriver driver;

	@FindBy(name="q")
	WebElement googleSearch;
	// Steps
	/**
	 * To run tests in maven --> right click on project --> run as maven build
	 * -->Goals--->Enter clean verify-->Run
	
	 **/
	@Title("Executing Login Test")
	@Test
	public void doLogin() {
		
		//used to open url from properties file 
		open();
		//driver.get("https://google.com");
		//we can use getDriver as well it is a feature from pageobject class
		//getDriver().findElement(By.name("q")).sendKeys("Serenity Bdd Framework");
		//we can run without using getDriver(). or driver.findElement(By.xpath(""))
		//find(By.name("q")).sendKeys("Serenity Bdd Framework");
		//we can also run using dollar symbol for xpath
		//$("//*[@name='q']").sendKeys("Serenity Bdd Framework");
		// typeInto and lot of features are there in PageObject 
		//typeInto($("//*[@name='q']"), "Hello Serenity Maven");
		//typeInto(googleSearch, "Hello Serenity Maven");
		WebElementFacade textBox = find(By.xpath("//*[@name='q']"));
		//textBox.type("Serenity Bdd Framework");
		textBox.shouldBePresent();
		textBox.typeAndEnter("Serenity Bdd Framework");
		System.out.println("Title"+getTitle());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
