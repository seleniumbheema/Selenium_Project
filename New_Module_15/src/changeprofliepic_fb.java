import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class changeprofliepic_fb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ProfilesIni allpro = new ProfilesIni();
		FirefoxProfile mypro = allpro.getProfile("bheema");
		
		WebDriver driv = new FirefoxDriver(mypro);
		driv.get("https://www.facebook.com/");
		
		driv.findElement(By.xpath("//*[@id='email']")).sendKeys("anil.bheema@gmail.com");
		driv.findElement(By.xpath("//*[@id='pass']")).sendKeys("Thulasibheema1");
		driv.findElement(By.xpath("//*[@id='pass']")).sendKeys(Keys.ENTER);
		
	}

}
