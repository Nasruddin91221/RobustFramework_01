package functional.login.scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import functional.home.pages.HomePage;
import functional.login.pages.LoginPage;
import resources.AdminLaunch;

public class Login001_VerifyLogin extends AdminLaunch{
	@Test
	
	public  void verifyLogin() throws IOException, InterruptedException, AWTException 
    {
	
		 WebDriver driver=capabilities();
		 
		 HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		 LoginPage Login = PageFactory.initElements(driver, LoginPage.class);

      

         
		 homepage.login();
		 Login.enterLoginDetail();
		
      
		
    }
	

}

