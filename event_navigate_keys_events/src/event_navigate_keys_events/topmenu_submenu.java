package event_navigate_keys_events;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class topmenu_submenu {

	public static void main(String[] args) throws InterruptedException {

		
		ProfilesIni allprof = new ProfilesIni();
		FirefoxProfile myprof = allprof.getProfile("bheema");
		
		WebDriver driv = new FirefoxDriver(myprof);
		
		driv.get("http://www.google.com");
	System.out.println
	(driv.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div[1]/div[3]/div/div/div/form/fieldset[2]/div/div/div/table/tbody/tr/td[2]"))
			.isDisplayed());
	driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driv.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div[1]/div[3]/div/div/div/form/fieldset[2]/div/div/div/table/tbody/tr/td[2]")).sendKeys("future");
driv.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div[1]/div[3]/div/div/div/form/fieldset[2]/div/div/div/table/tbody/tr/td[2]")).sendKeys(Keys.ENTER);

	
	driv.navigate().back();
	Thread.sleep(1000L);
	driv.navigate().forward();
	Thread.sleep(1000L);
//	driv.quit();
	
		
		
	}

}
