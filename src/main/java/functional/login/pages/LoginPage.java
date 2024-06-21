package functional.login.pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;


import functional.home.pageobjects.HomePageObjects;
import functional.login.pageobjects.LoginPageObjects;



/**
 * Object/UI interactions for the Landing page.<br><br>
 * Holds multiple methods for the landing page header navigation,
 * search, etc.
 */
public class LoginPage extends LoginPageObjects{

	/**
	 * Create new LandingPage object with the given driver.<br><br>
	 * Driver is passed through to the backing object class.
	 * @param driver active driver to use for this page
	 */
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Selects the 'MY ACCOUNT' option from the header navigation
	 * ribbon.<br><br>
	 * This is expected to display the list of options directly
	 * below (no page navigation).
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	

	
	
public void enterLoginDetail() throws IOException, InterruptedException{
		
	     Entermobilno.sendKeys(getmobileno());
		 sendotp.click();
		

			if(sendotp.isDisplayed()){
				System.out.println("otp page open");
				  
			}
			else{
				System.out.println("otp page not open");
				  
			}
			
			 
			 Thread.sleep(7000);
		/* verifymobileno.getText();
		 if(verifymobileno.isDisplayed()){
				System.out.println("mobileno displayed as"+verifymobileno);
				  
			}
			else{
				System.out.println("mobileno not displayed");
				  
			}
	}*/
}


}


