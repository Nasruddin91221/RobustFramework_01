package functional.dashboard.scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import functional.dashboard.pages.Dashboard;
import functional.home.pages.HomePage;
import functional.login.pages.LoginPage;
import resources.AdminLaunch;

public class Dashboard001_SearchTruck extends AdminLaunch{
	@Test
	
	public  void searchTruck() throws IOException, InterruptedException, AWTException 
    {
	
		 WebDriver driver=capabilities();
		 
		 HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		 Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		 LoginPage Login = PageFactory.initElements(driver, LoginPage.class);

	  

		 homepage.login();
		 Login.enterLoginDetail();
		 Thread.sleep(7000);
		 dashboard.selectFromCity();
		 dashboard.selectToCity();
		 dashboard.pickupDate(driver);
		 dashboard.truckcategory(driver);
		 dashboard.truckWeight(driver);
		 dashboard.searchTruck(driver);
		 		
    }
	

}

