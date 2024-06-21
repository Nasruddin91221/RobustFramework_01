package functional.login.pageobjects;


import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import resources.AdminLaunch;

/**
 * Abstract superclass containing object definitions for LandingPageObjects (Web objects).
 * This class is intended for extension by a script or any class supporting object actions.<br><br>
 * <em>File contents are auto-generated - any changes made to this file will be overwritten
 * by a subsequent update to the corresponding object file via the Object Map.</em>
 */
public abstract class LoginPageObjects {

	public LoginPageObjects(WebDriver driver){
		AdminLaunch.driver=driver;
		PageFactory.initElements(driver,this); 
		
	}

	

	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='mobile']") 
	protected
	WebElement Entermobilno;
	
	@FindBy(how=How.XPATH,using="//button[.='Send OTP ']") 
	protected
	WebElement sendotp;
	
	@FindBy(how=How.XPATH,using="//h5[normalize-space()]") 
	protected
	WebElement verifymobileno;
	
	
	
	
	
	
	
	
	public Properties getpropertyObject() throws IOException
	{
		
	FileReader reader=new FileReader("C:\\Users\\user\\eclipse-workspace\\RobustFramework2\\src\\main\\java\\functional\\login\\data\\Login.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	    
	    return p;
	    
	   }




	public  String getmobileno() throws IOException
	{
		return getpropertyObject().getProperty("MobileNumber");
	}
	

		}


