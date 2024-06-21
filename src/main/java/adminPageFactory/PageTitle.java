package adminPageFactory;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import resources.AdminData;

public class PageTitle extends AdminData{

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	
	

	
public void GetPageTitle(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	 Thread.sleep(5000);
	 String actualTitle = driver.getTitle();


	    System.out.println("page title is   "  + actualTitle);
	//   softAssert.assertEquals(userid, "Hi");
	   
}

public void GetPageUrl(WebDriver driver) throws InterruptedException, IOException



{
 Thread.sleep(5000);
 
 String actualTitle = driver.getTitle();


 System.out.println("page title is   "  + actualTitle);
 String actualurl = driver.getCurrentUrl();


    System.out.println("page url is   "  + actualurl);
    
    WebElement l=driver.findElement(By.xpath("/html/head/title"));
    // obtain the innerHTML with getAttribute method
    String expectedHeadTitle = l.getAttribute("innerHTML");
    System.out.println("HTML code of element: " +expectedHeadTitle);
    
  softAssert.assertEquals(actualTitle, expectedHeadTitle);
   
}




public  String getusername() throws IOException
{
	return getpropertyObject().getProperty("username");
}

public  String getpassword() throws IOException
{
	return getpropertyObject().getProperty("password");
}

}
