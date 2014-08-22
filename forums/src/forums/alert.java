package forums;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class alert {

	public static void main(String[] args) {

		
		
		ProfilesIni allprofiles = new ProfilesIni();
		
		FirefoxProfile myprof = allprofiles.getProfile("bheema");
		
		WebDriver driver = new FirefoxDriver(myprof);
		driver.get("http://ui-patterns.com/collections/modal-windows/entry/2681"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='header']/div/div[2]/a[2]")).click();
		

		String first ="//*[@id='browse_options_content']/ul[";
		
		String middle ="]/li[";
		String end ="]";
	
		String somex = driver.findElement(By.xpath("//*[@id='browse_options_content']/ul[1]/li[1]/a")).getText();
		System.out.println(somex);
		
		for(int i=1; i<=4;i++)
		{
			for(int j=1; j<=10;j++)
			{
			String x = driver.findElement(By.xpath(first+i+middle+j+end)).getText();
			System.out.print(x);
			}
			System.out.println();
		}
		
	}

}
