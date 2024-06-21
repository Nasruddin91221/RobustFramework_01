package functional.home.pageobjects;


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
public abstract class HomePageObjects {

	public HomePageObjects(WebDriver driver){
		AdminLaunch.driver=driver;
		PageFactory.initElements(driver,this); 
		
	}

	
	
	@FindBy(how=How.ID,using="mat-input-0") 
	protected
	WebElement selectfromcity;
	
	@FindBy(how=How.XPATH,using="//div[@class='pac-container pac-logo']/div") 
	protected
	List<WebElement> googlefromlist;
	
	@FindBy(how=How.ID,using="mat-input-1") 
	protected
	WebElement selecttocity;
	
	@FindBy(how=How.XPATH,using="//div[@class='pac-container pac-logo']/div") 
	protected
	List<WebElement> googletolist;
	
	
	@FindBy(how=How.XPATH,using="//span[.='Truck Category']") 
	protected
	WebElement selecttruckcategory;
	
	@FindBy(how=How.XPATH,using="//mat-option[contains(@aria-disabled,'false')]") 
	protected
	List<WebElement> truckcategorylist;
	
	
	@FindBy(how=How.XPATH,using="//span[.='Select Weight']") 
	protected
	WebElement selectweight;
	
	@FindBy(how=How.XPATH,using="//mat-option[contains(@aria-disabled,'false')]") 
	protected
	List<WebElement> weightlist;
	
	@FindBy(how=How.XPATH,using="//input[@id='mat-input-2']") 
	protected
	WebElement selectdate;
	
	@FindBy(how=How.XPATH,using="//button[contains(@aria-pressed,'false')]") 
	protected
	List<WebElement> datelist;
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Search']") 
	protected
	WebElement searchtruck;
	

	@FindBy(how=How.XPATH,using="//h6[normalize-space()='Login']") 
	protected
	WebElement loginpopup;
	
	@FindBy(how=How.XPATH,using="//a[normalize-space()='Login / Signup']") 
	protected
	WebElement Login;
	
	
	
	
	
	
	public Properties getpropertyObject() throws IOException
	{
		
	FileReader reader=new FileReader("C:\\Users\\user\\eclipse-workspace\\RobustFramework2\\src\\main\\java\\functional\\home\\data\\Home.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	    
	    return p;
	    
	   }




	public  String getfromcity() throws IOException
	{
		return getpropertyObject().getProperty("fromcity");
	}

	public  String gettocity() throws IOException
	{
		return getpropertyObject().getProperty("tocity");
	}
	
	public  String getdate() throws IOException
	{
		return getpropertyObject().getProperty("PickDate");
	}
	
	public  String getmobileno() throws IOException
	{
		return getpropertyObject().getProperty("MobileNumber");
	}
	

		}


