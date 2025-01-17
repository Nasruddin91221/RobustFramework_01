package pageObject;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.MobileData;

public class AndroidS9CreateRoutePage extends MobileData {
	static SoftAssert softAssert=new SoftAssert()	;

	public static void fromCity(AndroidDriver<AndroidElement> driver) throws IOException

	{
   
		driver.findElementById("com.s9truck.driver:id/txtPickup").click();
			driver.findElementById("com.s9truck.driver:id/places_autocomplete_search_bar").sendKeys(getfromcity());
			//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[1]").click();
			List<AndroidElement>	fromcity= driver.findElementsById("com.s9truck.driver:id/places_autocomplete_list");

			
		//	com.s9truck.customer:id/places_autocomplete_list
			 
			 Iterator<AndroidElement> itr=fromcity.iterator();
			 int i=1;
			 String value="";
			 while(itr.hasNext())
			 {
				 AndroidElement element=itr.next();
				 value=element.getText();
				 System.out.println("name of city is   "  + value);
			 }
				
             int fromcitycount= fromcity.size();

              System.out.println(fromcitycount);

              fromcity.get(fromcitycount-1).click();
              
      	//	driver.findElementById("com.s9truck.customer:id/btnConfirmLocation").click();


	                              
	}
	
	public static void toCity(AndroidDriver driver) throws InterruptedException, IOException

	{
   
		driver.findElementById("com.s9truck.driver:id/txtDrop").click();
		driver.findElementById("com.s9truck.driver:id/places_autocomplete_search_bar").sendKeys(gettocity());
		//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[1]").click();
		List<AndroidElement>	tocity= driver.findElementsById("com.s9truck.driver:id/places_autocomplete_list");
		
		
		 
		 Iterator<AndroidElement> itr=tocity.iterator();
		 int i=1;
		 String value="";
		 while(itr.hasNext())
		 {
			 AndroidElement element=itr.next();
			 value=element.getText();
			 System.out.println("name of tocity is   "  + value);
		 }
			
         int fromcitycount= tocity.size();

          System.out.println(fromcitycount);

          tocity.get(fromcitycount-1).click();
    		//driver.findElementById("com.s9truck.customer:id/btnConfirmLocation").click();


	}
	
public static void Pricedetails(AndroidDriver driver) throws InterruptedException, IOException

     
	
	{
	Thread.sleep(3000);

	String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Next\").instance(0))";

	driver.findElementByAndroidUIAutomator(scrollElement).click();	
	
	
	driver.findElementById("com.s9truck.driver:id/edtPrice").sendKeys(gettruckprice());

	//price.sendKeys(getprice());


}

public static void GoNext(AndroidDriver driver) throws InterruptedException, IOException



{




driver.findElementById("com.s9truck.driver:id/btnNext").click();

//price.sendKeys(getprice());


}

public static void dateSelect(AndroidDriver<AndroidElement> driver) throws InterruptedException, IOException

{
            Thread.sleep(3000);
			driver.findElementById("com.s9truck.driver:id/edtDate").click();
			
			// Thread.sleep(3000);
			//	List<AndroidElement>	tons= driver.findElementsByXPath("android:id/month_view");
			//	int count= driver.findElements(By.xpath("android:id/month_view")).size();
				
			//	for(int j=0; j<count; j++)
			//	{
				//String texts=	driver.findElements(By.xpath("android:id/month_view")).get(j).getText();
					//if(texts.equalsIgnoreCase(getdate()))
				//	{
					//	driver.findElements(By.xpath("android:id/month_view")).get(j).click();
					//	break;
					//}
				//	}   
				
			//	}

			driver.findElementByAccessibilityId(getdate()).click();
			driver.findElementById("android:id/button1").click();
              
}
	public static   String getfromcity() throws IOException
	{
		return getpropertyObject().getProperty("fromcity");
	}
	
	public static String gettocity() throws IOException
	{
		return getpropertyObject().getProperty("tocity");
	}
	public static  String getdate() throws IOException
	{
		return getpropertyObject().getProperty("PickDate");
	}
	public static  String gettruckprice() throws IOException
	{
		return getpropertyObject().getProperty("TruckPrice");
	}
}


