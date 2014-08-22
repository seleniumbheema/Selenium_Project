package forums;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pagination_Que {

	public static void main(String[] args) {

		
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
		
		String URL ="http://www.zillow.com/homes/95835_rb/";
		
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(URL);
		List<WebElement> pages = driver.findElements(By.xpath("//div[@id='search-pagination-wrapper-2']"));
		String link_pages[] = pages.get(0).getText().split(" ");
		String start = "//div[@id='search-pagination-wrapper-2']/ul/li[";
		String end ="]/span";
		System.out.println();
		for(int i=1; i<=link_pages.length;i++)
		{
			if(i==1)
			{
				driver.findElement(By.xpath(start+(i+1)+end)).click();;
			}else if(i>1) 
				{
					driver.findElement(By.xpath(start+(i+2)+end)).click();
				}
		}

}
}
