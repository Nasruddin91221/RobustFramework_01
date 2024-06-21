package functional.home.scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import functional.home.pages.HomePage;
import resources.AdminLaunch;

public class Home006_SearchTruck extends AdminLaunch{
	@Test
	
	public  void searchTruck() throws IOException, InterruptedException, AWTException 
    {
	
		 WebDriver driver=capabilities();
		 
		 HomePage homepage = PageFactory.initElements(driver, HomePage.class);
         
		 homepage.selectFromCity();
		 homepage.selectToCity();
		 homepage.pickupDate(driver);
		 homepage.truckcategory(driver);
		 homepage.truckWeight(driver);
		 homepage.searchTruck(driver);
		 
		 }
	
   }

