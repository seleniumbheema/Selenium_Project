package forums;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");

		
		
		String URL ="http://www.juicycouture.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id='mail-list-subscribe-modal']/div/div/button")).click(); 
		
		driver.findElement(By.xpath("//*[@id='nav']/div[1]/div[1]/div[2]/div/a/span")).click(); 
		String top ="//*[@id='Countries_chosen']/a/span";
		String down="//*[@id='Countries_chosen']/div/ul/li[13]";
		
/*		
		Select mydropdown = new Select(driver.findElement(By.xpath(top))); 
		mydropdown.selectByVisibleText("Brazil"); */
		
		//Checking whether this element is available
		System.out.println("top " + driver.findElement(By.xpath(top)).isDisplayed());
		driver.findElement(By.xpath(top)).click();
		Thread.sleep(2000);
		//Checking whether this element is available
		System.out.println("bottom " +driver.findElement(By.xpath(down)).isDisplayed());
		
		WebElement down_box= driver.findElement(By.xpath(down));
		down_box.click();
		
		//click on submit
		
		driver.findElement(By.xpath("//*[@id='chooser-document']/div[3]/button[1]")).click();
	
		
		//driver.findElement(By.id("Countries_chosen")).findElement(By.cssSelector("li[data-option-array-index*='12']")).click();
		
		
		
	
		
	}

}
