package seoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import resources.AdminLaunch;
import seo.ActiveLinks;
import seo.LinkByHref;

public class hrefTest  extends AdminLaunch{
	
	@Test
	public  void login() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 LinkByHref pt = PageFactory.initElements(driver, LinkByHref.class);
		 

		 
	//	pt.GetPageTitle(driver);
		pt.clickLinkByHref(driver);
          
		 
		
		
	}
	

}
