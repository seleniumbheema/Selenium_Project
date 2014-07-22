import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Chrome_Driving {

	public static void main(String[] args) throws InterruptedException {

	
		
		ProfilesIni allprof = new ProfilesIni();
		FirefoxProfile myprof = allprof.getProfile("bheema");
		
		String URL="https://www.gov.uk/book-practical-driving-test";
		
		WebDriver driv = new FirefoxDriver(myprof);
		driv.manage().window().maximize();
		driv.get(URL);
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driv.findElement(By.xpath("//*[@id='get-started']/a")).click();
		driv.findElement(By.xpath("//*[@id='test-type-car']")).click();
		driv.findElement(By.xpath("//*[@id='driving-licence']")).sendKeys("BHEEM808267AK9BM");
		driv.findElement(By.xpath("//*[@id='extended-test-no']")).click();
		driv.findElement(By.xpath("//*[@id='special-needs-none']")).click();
		driv.findElement(By.xpath("//*[@id='driving-licence-submit']")).click();
		
//		looking near the postcode
		WebElement Postcode =driv.findElement(By.xpath("//*[@id='test-centres-input']"));
		Postcode.sendKeys("TW209QA");
		Postcode.sendKeys(Keys.ENTER);
		
		/*while(true){
			try
			{
				WebElement Show_more  = driv.findElement(By.linkText("Show more results"));
				
				Thread.sleep(1000L);
				WebElement id = driv.findElement(By.xpath("//a[@id]"));
				if (id.equals("centre-name-124")) {
					WebElement ashfor = driv.findElement(By.xpath("//a[@id='centre-name-124']"));
					ashfor.click();
				}
				else {
					Show_more.click();
				}
					
			}
			catch(Throwable t){
				
				System.out.println("Come out of the cache");
			}
			
		}*/
		
		WebElement Show_more  = driv.findElement(By.linkText("Show more results"));
		Show_more.click();
		Thread.sleep(1000L);
		
		List<WebElement> testcenter = driv.findElements(By.xpath("//a[@class='test-centre-details-link']/div[@class='test-centre-details']/h2"));
		System.out.println("testcenter-->" +testcenter.size());
		
		List<WebElement> choosecenter = driv.findElements(By.xpath("//div[@class='test-centre-content']/a/span[@class='visuallyhidden']"));
		System.out.println("choosecenter-->" +choosecenter.size());
		
		
		
	 for(int i=0 ; i<=testcenter.size();i++)
	 {
		 String testclick = testcenter.get(i).getText();
		 System.out.println(testclick);
		 if(testclick.equals("Isleworth (London)"))
		 {
			 testcenter.get(i).click();
			 driv.findElement(By.xpath("//*[@id='driving-licence-submit']")).sendKeys(Keys.ENTER);
			 WebElement box = driv.findElement(By.xpath("//*[@id='main']"));
			 List<WebElement> dates = box.findElements(By.tagName("a"));
			 for (int j = 0; j <= dates.size(); j++) {
				System.out.println(dates.get(j).getText());
			}
			
		 }
		
		


	 }
	 Thread.sleep(1000L);
	/* driv.findElement(By.xpath("//*[@id='test-choice-date']")).click();*/
	 /*driv.findElement(By.xpath("//*[@id='driving-licence-submit']")).sendKeys(Keys.ENTER);*/
	 
	 /*Selecting the dates*/
	 
	 
		
	}

}
