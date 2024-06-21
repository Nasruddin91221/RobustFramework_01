package seoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import resources.AdminLaunch;
import seo.ActiveLinks;
import seo.Validatewithresponsecode;

public class ValidatewithresponsecodeTest extends AdminLaunch{
	
	@Test
	public  void login() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 Validatewithresponsecode pt = PageFactory.initElements(driver, Validatewithresponsecode.class);
		 
	//	pt.GetPageTitle(driver);
	pt.PageUrl(driver);
		// pt.Pagecode(driver);
          
		 
		
		
	}
	

}
