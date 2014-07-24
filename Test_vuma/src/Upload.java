import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Upload {

	public static void main(String[] args) {


			
			ProfilesIni allprof = new ProfilesIni();
			FirefoxProfile myprof = allprof.getProfile("bheema");
			
			String URL ="http://qa.vuma.com/";
			
			WebDriver driv = new FirefoxDriver(myprof);
			driv.manage().window().maximize();
			driv.navigate().to(URL);

			driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driv.findElement(By.xpath("//*[@id='username']")).sendKeys("testingvuma2");
			driv.findElement(By.xpath("//*[@id='password']")).sendKeys("testingvuma2");
			driv.findElement(By.xpath("//*[@id='password']")).sendKeys(Keys.ENTER);
			
//			Clicking on the Upload
			driv.findElement(By.linkText("Upload")).click();
			
//			Uploading the file
			
			WebElement Uploading_excel = driv.findElement(By.linkText("Upload forecast"));
			Uploading_excel.click();
			Uploading_excel.sendKeys("C:\\Users\\bheemaa\\Downloads\\test_download");
			
		
		
	}

}
