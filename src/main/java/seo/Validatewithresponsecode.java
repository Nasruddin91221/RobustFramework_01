package seo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validatewithresponsecode {
	
	HttpURLConnection huc = null;
	
	public void PageUrl(WebDriver driver) throws InterruptedException, IOException{
		
	String homePage = "https://www.staples.com/";
	String url = "";
int respCode = 200;

HttpURLConnection huc = null;
HttpURLConnection c= (HttpURLConnection)new URL("https://www.staples.com/").openConnection();
	
//	respCode = huc.getResponseCode();
{
	 Thread.sleep(10000);
	 
	 if(respCode >= 400){
		 System.out.println(url+" is a broken link");
		 }
		 else{
		 System.out.println(url+" url is a valid link");
		 }
	   
	 }
c.setRequestMethod("HEAD");
// connection started and get response code
c.connect();

int r = c.getResponseCode();
System.out.println("Http response code: " + r);

}


	}
