package forums;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Pagination {

	public static void main(String[] args) {
/*
		ProfilesIni allprof = new ProfilesIni();
		FirefoxProfile myprof = allprof.getProfile("bheema");
*/
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver/chromedriver.exe");
		String  URl ="http://www.cengage.com/conventions/";
//		WebDriver driver = new FirefoxDriver(myprof);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URl);
		List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pages']"));
		String linksSplitArr[]=pages.get(0).getText().split(" ");
		System.out.println(linksSplitArr[1]);
		String li_start= "//ul[@id='pages']/li[";
		String li_end =	"]/a";
				
		
		for(int j=1;j<linksSplitArr.length-2;j++)
		{
			//String linkNumber=linksSplitArr[j];
			//System.out.println("Link Number: "+linkNumber);
			if(j==1)
				driver.findElement(By.xpath(li_start+(j+1)+li_end)).click();
			else if(j>1)
				driver.findElement(By.xpath(li_start+(j+2)+li_end)).click();
		}
		driver.quit();
		
		
	}

}
