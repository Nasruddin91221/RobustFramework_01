package functional.home.pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import functional.dashboard.pages.Status;
import functional.home.pageobjects.HomePageObjects;



/**
 * Object/UI interactions for the Landing page.<br><br>
 * Holds multiple methods for the landing page header navigation,
 * search, etc.
 */
public class HomePage extends HomePageObjects{

	/**
	 * Create new LandingPage object with the given driver.<br><br>
	 * Driver is passed through to the backing object class.
	 * @param driver active driver to use for this page
	 */
	public HomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Selects the 'MY ACCOUNT' option from the header navigation
	 * ribbon.<br><br>
	 * This is expected to display the list of options directly
	 * below (no page navigation).
	 * @throws IOException 
	 */
	
	public void selectFromCity() throws IOException{
		
		selectfromcity.sendKeys(getfromcity());
		
		if(selectfromcity.isEnabled()){
			System.out.println("Select city text area open");
			 reportVP("Meta name is Present in Head "  , Status.PASS,
			            "Meta name is Present in Head");
			  
		}
		else{
			System.out.println("Select city text area does not open");
			  
		}
		      
	
     List<WebElement>	fromcity=  googlefromlist;

	 
	 Iterator<WebElement> itr=fromcity.iterator();
	 int i=1;
	 String value="";
	 while(itr.hasNext())
	 {
		 WebElement element=itr.next();
		 value=element.getText();
		 System.out.println("name of city displaying in suggestion list as   "  + value);
	 }

	 
			
               int fromcitycount= fromcity.size();

       	  // System.out.println("no of fromcity is   "  + fromcitycount);
 
                fromcity.get(fromcitycount-1).click();
 
	}
	
	
private void reportVP(String string, String pass, String string2) {
		// TODO Auto-generated method stub
		
	}

public void selectToCity() throws IOException{
		
	    selecttocity.sendKeys(gettocity());
		
		if(selecttocity.isEnabled()){
			System.out.println("Select city text area open");
			  
		}
		else{
			System.out.println("Select city text area does not open");
			  
	
		}    
	
     List<WebElement>	tocity=googletolist;

     Iterator<WebElement> itr=tocity.iterator();
	 int i=1;
	 String value="";
	 while(itr.hasNext())
	 {
		 WebElement element=itr.next();
		 value=element.getText();
		 System.out.println("name of city displaying in suggestion list as  "  + value);
	 }
	 
	 
    int tocitycounts= tocity.size();
   // System.out.println("no of tocity is   "  + tocitycounts);
    tocity.get(tocitycounts-2).click();
 
	}

public void truckcategory(WebDriver driver) throws InterruptedException

{

	selecttruckcategory.click();
    Thread.sleep(3000);
 
 List<WebElement>	truck= truckcategorylist;
 Iterator<WebElement> itr=truck.iterator();
 int i=1;
 String value="";
 while(itr.hasNext())
 {
	 WebElement element=itr.next();
	 value=element.getText();
	 System.out.println("name of truck displaying in dropdown as   "  + value);
 }

 
 
 
 int	trucktypes= truckcategorylist.size();

 System.out.println("no of truck displaying is   "  + trucktypes);
 
 truckcategorylist.get(1).click();

              
}


public void truckWeight(WebDriver driver) throws InterruptedException

{

	selectweight.click();
     Thread.sleep(3000);
 
 
 List<WebElement>	weight=  weightlist;
 Iterator<WebElement> itr=weight.iterator();
 int i=1;
 String value="";
 while(itr.hasNext())
 {
	 WebElement element=itr.next();
	 value=element.getText();
	 System.out.println("name of truckwight displaying in list as  "  + value);
 }
 
 
 int	truckweight= weightlist.size();

 System.out.println("no of truckweight as displayed "  + truckweight);

 weightlist.get(1).click();

              
}

public void pickupDate(WebDriver driver) throws InterruptedException, IOException

{

	selectdate.click();
    Thread.sleep(3000);
 List<WebElement>	dates=  datelist;
	int count= datelist.size();
	
	for(int j=0; j<count; j++)
	{
	String texts=	datelist.get(j).getText();
		if(texts.equalsIgnoreCase(getdate()))
		{
			datelist.get(j).click();
			break;
		}
		}   
	
	}

public void searchTruck(WebDriver driver) throws InterruptedException

{

	searchtruck.click();
	Thread.sleep(6000);
	String login=loginpopup.getText();
	if(login.contains("Login")){
		System.out.println("Redireccted to login page"+login);
		 
	}
	else{
		System.out.println("not Redireccted to login page");
		  
	}
	      
 

}

public void login() throws IOException{
	
	Login.click();
	
	if(Login.isEnabled()){
		System.out.println("login page open");
		  
	}
	else{
		System.out.println("Login page not open");
		  
	}
	      
}


}


