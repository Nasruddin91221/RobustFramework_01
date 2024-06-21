package seo;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import adminPageFactory.LoginPage;
import resources.AdminData;

public class MetaPage extends AdminData{
	
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	public void GetPageUrl(WebDriver driver) throws InterruptedException, IOException



	{
	 Thread.sleep(5000);
	 
	 String actualTitle = driver.getTitle();


	 System.out.println("page title is   "  + actualTitle);
	 String actualurl = driver.getCurrentUrl();


	    System.out.println("page url is   "  + actualurl);
	    
	    WebElement l=driver.findElement(By.xpath("//link[@rel='alternate']"));
	   
	    // obtain the innerHTML with getAttribute method
	    String Metaproperty  = l.getAttribute("hreflang");
	    System.out.println("hreflang: " +Metaproperty);
	    
	    WebElement ls=driver.findElement(By.xpath("//meta[@name='description']"));
		   
	    // obtain the innerHTML with getAttribute method
	    String Metadescription  = ls.getAttribute("content");
	    System.out.println("Metadescription: " +Metadescription);
		softAssert.assertEquals(Metadescription, "\"Staples has business essentials, printers, ink, computers, office furniture, printing services, promotional products and more. Worklife made simple.\"");
		softAssert.assertAll();
	    
	 // softAssert.assertEquals(actualTitle, expectedHeadTitle);
	    
	    List<WebElement>	meta=  driver.findElements(By.xpath("//meta"));
	    Iterator<WebElement> itr=meta.iterator();
	    int i=1;
	    String value="";
	    while(itr.hasNext())
	 {
		 WebElement element=itr.next();
		 value=element.getAttribute("content");
		 System.out.println("name of meta is   "  + value);
		 
		
	 }

	 
	    int	metasize= meta.size();

		   System.out.println("no of metasize is   "  + metasize);
	}

	public void Sitelinksearch(WebDriver driver) throws InterruptedException, IOException



	{
	 Thread.sleep(5000);
	
	    
	 WebElement l=driver.findElement(By.xpath("//script[@data-react-helmet='true']"));
	   
	    // obtain the innerHTML with getAttribute method
	  String Metaproperty  = l.getAttribute("type");
	 
	//   String Metaproperty  = l.getTagName();

	  
	  //  String Metaproperty  = l.getText();
	    System.out.println("sitesearch: " +Metaproperty);
	   
	//	softAssert.assertEquals(Metadescription, "\"Staples has business essentials, printers, ink, computers, office furniture, printing services, promotional products and more. Worklife made simple.\"");
	
		
	 }
	
	public void Verificationtags(WebDriver driver) throws InterruptedException, IOException



	{
	 Thread.sleep(5000);
	
	    
	List< WebElement> l=driver.findElements(By.xpath("//meta[@name]"));
	
    Iterator<WebElement> itr=l.iterator();
    int i=1;
    String value="";
    while(itr.hasNext())
 {
	 WebElement element=itr.next();
	 value=element.getAttribute("content");
	 
	 System.out.println("name of meta is   "  + value);
	 
	
 }
		
	 }

}
