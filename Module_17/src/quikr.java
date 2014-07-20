import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class quikr {

	public static void main(String[] args) throws InterruptedException {

		
		
		ProfilesIni allprof = new ProfilesIni();
		FirefoxProfile myprof = allprof.getProfile("bheema");
		myprof.setEnableNativeEvents(true);
		WebDriver driv = new FirefoxDriver(myprof);
		
		driv.navigate().to("http://www.quikr.com/");
	/*	
		if(driv.findElement(By.xpath("//div[@id='getstate']"))!=null)
		{

		driv.findElement(By.xpath("//a[@id='csclose']")).click();
		}*/
		
		
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driv.findElement(By.xpath("html/body/div[7]/div/div[6]/div[1]/ul/li[2]/a")).click();
		
		String str1 = "//*[@id='60_subcatecontent']/div[2]/div/ul[1]/li[";
		
		String str2 ="]/a";
				

	/*	List<WebElement> links = driv.findElements(By.className("main_cat_list"));
		System.out.println(links.size());
	*/
		for(int i=3 ; i<=9 ; i++){
			
			WebElement link  = driv.findElement(By.xpath(str1+ i + str2));
			Thread.sleep(5000L);
			System.out.println("elements in mobile" + link.getText());;
		
			driv.navigate().back();
		}
	}

}
