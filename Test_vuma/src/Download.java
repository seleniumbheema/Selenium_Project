import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Download {

	public static void main(String[] args) {

		
		ProfilesIni allprof = new ProfilesIni();
		FirefoxProfile myprof = allprof.getProfile("bheema");
		
		myprof.setPreference("browser.download.folderList", 2);
		myprof.setPreference("browser.download.dir", "C:\\Users\\bheemaa\\Downloads\\test_download");
		myprof.setPreference("browser.helperApps.neverAsk.saveToDisk","application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		
		String URL ="http://qa.vuma.com/";
		
		WebDriver driv = new FirefoxDriver(myprof);
		driv.manage().window().maximize();
		driv.navigate().to(URL);

		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driv.findElement(By.xpath("//*[@id='username']")).sendKeys("testingvuma2");
		driv.findElement(By.xpath("//*[@id='password']")).sendKeys("testingvuma2");
		driv.findElement(By.xpath("//*[@id='password']")).sendKeys(Keys.ENTER);

//		Clicking on the Upload
		driv.findElement(By.linkText("Upload")).click();
//		Click and download the Excel file
		driv.findElement(By.linkText("Download template")).click();
		
	}

}
