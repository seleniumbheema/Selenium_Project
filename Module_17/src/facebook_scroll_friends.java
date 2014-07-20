import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class facebook_scroll_friends {

	public static void main(String[] args) {

		
		
		WebDriver d = new FirefoxDriver();
		
		EventFiringWebDriver driv = new EventFiringWebDriver(d);
		driv.get("http://www.facebook.com");
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driv.findElement(By.xpath("//*[@id='email']")).sendKeys("anil.bheema@gmail.com");
		driv.findElement(By.xpath("//*[@id='pass']")).sendKeys("Thulasibheema1");
		driv.findElement(By.xpath("//*[@id='pass']")).sendKeys(Keys.ENTER);
		
		
		driv.findElement(By.xpath("//*[@id='pagelet_welcome_box']/div/div/div/div[2]/a[1]")).click();
		
		driv.findElement(By.xpath("//a[@href='https://www.facebook.com/anil.bheema/friends']")).click();
		
		driv.executeScript("scroll(0,5000)");
		
		WebElement boxelement = driv.findElement(By.xpath("//*[@id='pagelet_timeline_app_collection_518605302:2356318349:2']/ul[1]"));
		List<WebElement> frnz = boxelement.findElements(By.tagName("a"));
		System.out.println(frnz.size());
		
		
		for (int i = 0; i < frnz.size(); i++) {
			String all = frnz.get(i).getText();
			
			if(!all.trim().equals(" ")){
			System.out.println(all);
			}
		}
		
		
		
	}

}
