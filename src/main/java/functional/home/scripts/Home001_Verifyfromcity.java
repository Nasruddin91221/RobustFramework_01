package functional.home.scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminPageFactory.DriversPage;
import adminPageFactory.LeftmenuPage;
import adminPageFactory.LoginPage;
import functional.home.pages.HomePage;
import resources.AdminLaunch;


public class Home001_Verifyfromcity extends AdminLaunch{
	@Test
	
	public  void verifyFromCity() throws IOException, InterruptedException, AWTException 
    {
	
		 WebDriver driver=capabilities();
		 
		 HomePage homepage = PageFactory.initElements(driver, HomePage.class);
      

         
		 homepage.selectFromCity();
		
      
		
    }
	

}

