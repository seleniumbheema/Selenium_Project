package event_navigate_keys_events;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class topmenu_submenu {

	public static void main(String[] args) {

		
		ProfilesIni allprof = new ProfilesIni();
		FirefoxProfile myprof = allprof.getProfile("bheema");
		
		WebDriver driv = new FirefoxDriver(myprof);
		
		driv.get("http://www.google.com");
	driv.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("menus");
	driv.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys(Keys.ENTER);
	
	
	
		
		
	}

}
