package seoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminPageFactory.PageTitle;
import pageObject.LandingPage;
import resources.AdminLaunch;
import seo.MetaPage;

public class LandingTest extends AdminLaunch{
	
	@Test
	public  void login() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 MetaPage l = PageFactory.initElements(driver, MetaPage.class);
		 
	    //  l.GetPageUrl(driver);
	      l.Sitelinksearch(driver);
	      l.Verificationtags(driver);
	      
	      
          
		 
		
		
	}
	

}
