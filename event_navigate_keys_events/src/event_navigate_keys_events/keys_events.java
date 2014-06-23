package event_navigate_keys_events;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class keys_events {

	public static void main(String[] args) throws InterruptedException {

		
		ProfilesIni allprof = new ProfilesIni();
		FirefoxProfile myprof = allprof.getProfile("bheema");
		
		WebDriver driv = new FirefoxDriver();
		driv.navigate().to("https://www.linkedin.com/");
		
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driv.findElement(By.xpath("html/body/div[1]/div/div/form/fieldset/ul/li[2]/a")).click();
		
		
		Thread.sleep(3000L);
		driv.navigate().back();
		Thread.sleep(2000L);
		driv.navigate().forward();
		Thread.sleep(3000L);
		driv.quit();
	}

}
