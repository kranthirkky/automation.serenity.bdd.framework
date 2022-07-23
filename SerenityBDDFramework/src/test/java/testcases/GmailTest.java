package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;


@RunWith(SerenityRunner.class)
public class GmailTest extends PageObject {
	
	@Managed
	WebDriver driver;
	
	@Title("Executing Login Test")
	@Test
	public void doLogin() {
		open();
	}

}
