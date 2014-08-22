package forums;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;

public class sendkeys {

	public static void main(String[] args) {

		
		
/*		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

*/
		ProfilesIni allprofiles = new ProfilesIni();
		FirefoxProfile myprof = allprofiles.getProfile("bheema");
		WebDriver driver = new FirefoxDriver(myprof);
		driver.manage().window().maximize();
		driver.get("https://uk.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println(driver.findElement(By.linkText("Sign in")).isDisplayed());
		driver.findElement(By.linkText("Sign in")).click();

		
		/*Actions builder = new Actions(driver);
		builder.moveToElement(top).build().perform();
		sub.click();*/
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("anil\bheema");
	}

}
