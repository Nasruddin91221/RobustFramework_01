package seoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminPageFactory.PageTitle;
import resources.AdminLaunch;
import seo.Homepageseo;

public class HomepageseoTest extends AdminLaunch{
	
	@Test
	public  void login() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 Homepageseo pt = PageFactory.initElements(driver, Homepageseo.class);
		 
	//	pt.GetPageTitle(driver);
		pt.checkCurrentURL(driver);
		pt.checkHeadByTitle(driver);
		pt.checkMetaName(driver);
		pt.checkCanonicallink(driver);
		pt.checkRobotDirectives(driver);
		
          
		 
		
		
	}
	

}
