package seo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class LinkByHref {
	static SoftAssert softAssert=new SoftAssert()	;
	
	
	
	public void clickLinkByHref(WebDriver driver) {
		
	    List<WebElement> anchors =driver.findElements(By.tagName("a"));
	    Iterator<WebElement> i = anchors.iterator();

	    int j = 0;
	    while(i.hasNext()) {
	        WebElement anchor = i.next();

	        if(anchor.getAttribute("href").contains(null)) {
	            j++;
	        }

	        if(anchor.getAttribute("href").contains(null)
	                && j == j) {
	           // anchor.click();
	            break;
	        }
	    }
}
}