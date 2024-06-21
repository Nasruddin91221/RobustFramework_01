package adminTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminPageFactory.LoginPage;
import adminPageFactory.PageTitle;
import resources.AdminLaunch;

public class PageTitleTest extends AdminLaunch{
	
	@Test
	public  void login() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 PageTitle pt = PageFactory.initElements(driver, PageTitle.class);
		 
	//	pt.GetPageTitle(driver);
		pt.GetPageUrl(driver);
          
		 
		
		
	}
	

}
