package forums;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
public class Column_count {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
		
	//	WebDriver driver = new ChromeDriver();
		/*ProfilesIni allprofiles = new ProfilesIni();
		FirefoxProfile myprof = allprofiles.getProfile("bheema");
      WebDriver driver = new FirefoxDriver(myprof);*/
      System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      /* driver.get("http://news.cengage.com/awards-given/");
  	
  List<WebElement> columns = driver.findElements(By.tagName("th"));
  System.out.println("columns--> " + columns.size());
  
*/
		
		driver.get("http://test.cita.illinois.edu/aria/checkbox/checkbox1.php");
		List<WebElement> allchecks = driver.findElements(By.xpath("//li[@role='checkbox']"));
		
		WebElement firstlink = driver.findElement(By.xpath("html/body/div[1]/ul/li[1]"));
		System.out.println(firstlink.isDisplayed());
		String Lettuce = firstlink.getText();
		System.out.println(Lettuce);
		
		
		/*for (int i = 0; i <= allchecks.size(); i++) {
			allchecks.get(i).click(); 
			
		}*/
		
		
		if(!driver.findElement(By.xpath("//li[@role='checkbox']")).isSelected())
			driver.findElement(By.xpath("//li[@role='checkbox']")).click();
		
		


}
}
