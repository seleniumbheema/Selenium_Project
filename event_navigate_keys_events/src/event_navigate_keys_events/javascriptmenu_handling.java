package event_navigate_keys_events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;

public class javascriptmenu_handling {

	public static void main(String[] args) {

		
		ProfilesIni allprof = new ProfilesIni();
		FirefoxProfile myprof = allprof.getProfile("bheema");
		
		WebDriver driv = new FirefoxDriver();
		driv.get("http://www.ebay.com/");
		
		
		System.out.println(driv.findElement(By.xpath("//*[@id='top']/div[1]/table/tbody/tr/td[5]/a")).isDisplayed());
		System.out.println(driv.findElement(By.xpath("//*[@id='top']/div[1]/table/tbody/tr/td[5]/div[2]/div[1]/ul[2]/li[4]/a")).isDisplayed());
		WebElement topmenu = driv.findElement(By.xpath("//*[@id='top']/div[1]/table/tbody/tr/td[5]/a"));
		WebElement sub = driv.findElement(By.xpath("//*[@id='top']/div[1]/table/tbody/tr/td[5]/div[2]/div[1]/ul[2]/li[4]/a"));
		//sub menu element can't find which is not visible
//		driv.findElement(By.xpath("//*[@id='top']/div[1]/table/tbody/tr/td[5]/div[2]/div[1]/ul[2]/li[4]")).click();
		
		Actions sub_menu = new Actions(driv);
		sub_menu.moveToElement(topmenu).build().perform();
		sub.click();
		
		
	}

}
