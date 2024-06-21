package seo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import java.net.MalformedURLException;
import java.net.URL;

import adminPageFactory.LoginPage;
import resources.AdminData;

public class ActiveLinks  {


	static SoftAssert softAssert=new SoftAssert()	;


	
	public void PageUrl(WebDriver driver) throws InterruptedException, IOException

{
	 Thread.sleep(10000);
	 
	
	    List<WebElement>	links=  driver.findElements(By.tagName("a"));
	    Iterator<WebElement> itr=links.iterator();
	    int i=1;
	    String value="";
	    String value1="";
	    while(itr.hasNext())
	 {
		 WebElement element=itr.next();
		 value=element.getAttribute("href");
		 System.out.println(value);
		// value1=element.getText();
		// System.out.println("name of link is   "  + value1);
		 softAssert.assertEquals(value, "https://www.staples.com/services/printing/", "https://www.staples.com/sbd/cre/products/200607/dg23351/index.html");

	
		 
		
		
	 }

	   // long workinglinks=	links.stream().filter(link->link.getAttribute("href")!=null).count();
	//	 System.out.println("workinglinks are:" +workinglinks);
		 
		
	//    int	linksize= links.size();

	//	   System.out.println("no of metasize is   "  + linksize);
	}

}


