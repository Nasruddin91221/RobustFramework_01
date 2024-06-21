package seoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminPageFactory.PageTitle;
import resources.AdminLaunch;
import seo.ActiveLinks;

public class ActiveLinksTest  extends AdminLaunch{
	
	@Test
	public  void login() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 ActiveLinks pt = PageFactory.initElements(driver, ActiveLinks.class);
		 
	//	pt.GetPageTitle(driver);
		pt.PageUrl(driver);
          
		 
		
		
	}
	

}
