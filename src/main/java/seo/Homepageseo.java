package seo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import resources.AdminLaunch;

public class Homepageseo  extends AdminLaunch{

	
	static SoftAssert softAssert=new SoftAssert()	;
	public void checkCurrentURL(WebDriver driver){
		String URL = driver.getCurrentUrl();
		if (URL.contains("https://www.staples.com/staples-dexley-mesh-task-chair-black-56946/product_24398921")){
			System.out.println(URL);
			   reportVP("URL is Expected  " +URL , Status.PASS,
                       "URL is Expected");
		}
		else{
			   reportVP("URL is Expected  " +URL , Status.FAIL,
                       "URL is not Expected");
		}
	}
	
	private void reportVP(String string, Status pass, String string2) {
		// TODO Auto-generated method stub
		
	}

	public void checkHeadByTitle(WebDriver driver){
		String actualTitle = driver.getTitle();
		System.out.println("Actual title of a page is " +actualTitle);

		Boolean titleFoundInHead = false;
		List<WebElement> HeadTitle = driver.findElements(By.xpath("/html/head/title"));
		System.out.printf("HeadTitle is after getting the value" + HeadTitle);
		
		for (WebElement element : HeadTitle) {
		    System.out.println("Paragraph text:" + element.getText());
		}
		for(int i=0 ; i < HeadTitle.size(); i++){
			if(actualTitle.equals(HeadTitle.get(i).getAttribute("innerHTML") )){
				titleFoundInHead = true;
				System.out.println("The HeadMetaName is" + HeadTitle.get(i).getAttribute("innerHTML") );
			}
			System.out.println("The for loop title is" + HeadTitle.get(i).getAttribute("innerHTML") );

		}
		if(titleFoundInHead == true){
			System.out.println(HeadTitle);
			   reportVP("HeadTitle is Present in Head  " + HeadTitle , Status.PASS,
                 "HeadTitle is Present in Head  ");
		}
		else{
			   reportVP("HeadTitle is not Present in Head", Status.FAIL,
	                    "HeadTitle is not Present in Head");
		}
		
	}
	public void checkMetaName(WebDriver driver){
		Boolean foundMeta = false;
		String contentToMatch = "Staples has business essentials, printers, ink, computers, office furniture, printing services, promotional products and more. Worklife made simple.";
		List<WebElement> HeadMetaName = driver.findElements(By.xpath("//meta[@name='description']"));
		for(int i=0 ; i < HeadMetaName.size(); i++){
			if(HeadMetaName.get(i).getAttribute("content") == contentToMatch){
				foundMeta = true;
				System.out.printf("The HeadMetaName is", HeadMetaName.get(i).getAttribute("content") );
				softAssert.assertEquals(HeadMetaName, "\"Staples has business essentials, printers, ink, computers, office furniture, printing services, promotional products and more. Worklife made simple.\"");
				softAssert.assertAll();
			}
			 

		}
		
		
		if(foundMeta == true){
			System.out.println("Meta Name found");
			   reportVP("Meta name is Present in Head " +HeadMetaName , Status.PASS,
                    "Meta name is Present in Head");
		}
		else{
			   reportVP("Meta name is Not Present in Head", Status.FAIL,
	                    "Meta name is Not Present in Head ");
		}
		
	}
	
	public void checkCanonicallink(WebDriver driver){
		String CanonicalLink = "canonical";
		String PageSource = driver.getPageSource();
		if(PageSource.contains(CanonicalLink)){
			System.out.println(CanonicalLink);
			   reportVP("Canonical Link is Present in Head  " +CanonicalLink , Status.PASS,
                    "Canonical Link is Present in Head");
		}
		else{
			   reportVP("Canonical Link is not Present in Head  ", Status.FAIL,
	                    "Canonical Link is not Present in Head");
		}
	}
	
	public void checkRobotDirectives(WebDriver driver){
//		String actualTitle = driver.getTitle();
//		System.out.printf("Actual title of a page is " +actualTitle);
		String metaTagName = "robots";
		
		Boolean isRobotDirectivesPresent = false;
		List<WebElement> robotDirectiveList = driver.findElements(By.xpath("/html/head/meta[@name='robots']"));
		System.out.printf("robotDirectiveList is after getting the value" + robotDirectiveList);
		
		
		for(int i=0 ; i < robotDirectiveList.size(); i++){
			if(metaTagName.equals(robotDirectiveList.get(i).getAttribute("name") )){
				isRobotDirectivesPresent = true;
				System.out.printf("The HeadMetaName is" + robotDirectiveList.get(i).getAttribute("name") );
			}
			System.out.printf("The for loop title is" + robotDirectiveList.get(i).getAttribute("name") );

		}
		if(isRobotDirectivesPresent == true){
			System.out.println(robotDirectiveList);
			   reportVP("HeadTitle is Present in Head  " + robotDirectiveList , Status.PASS,
                 "HeadTitle is Present in Head  ");
		}
		else{
			   reportVP("HeadTitle is not Present in Head", Status.FAIL,
	                    "HeadTitle is not Present in Head");
		}
		
	}

}

