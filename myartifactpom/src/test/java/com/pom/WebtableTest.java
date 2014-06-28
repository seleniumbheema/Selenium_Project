package com.pom;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
public class WebtableTest 
{
	
	@Test
	public void tableTest(){
		
		FirefoxProfile prof = new FirefoxProfile();
		prof.setEnableNativeEvents(true);
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bheemaa\\Downloads\\ChromeSetup.exe");
		WebDriver driv = new FirefoxDriver();
		driv.get("http://www.espncricinfo.com/");
		String top_menu = "//*[@id='mgDd']/table/tbody/tr[1]/td[2]/a";
		
		String sub_menu ="//*[@id='mgDdRht']/tbody/tr[3]/td/a";
		
		WebElement top = driv.findElement(By.xpath(top_menu));
		WebElement sub = driv.findElement(By.xpath(sub_menu));
	
		Actions builder = new Actions(driv);
		builder.moveToElement(top).build().perform();
		sub.click();
		
	}
}