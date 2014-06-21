import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class cookies {

	public static void main(String[] args) {

		
		
		ProfilesIni allprofiles = new ProfilesIni();
		FirefoxProfile mypro = allprofiles.getProfile("bheema");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		
		Set<Cookie> cook = driver.manage().getCookies();
		Iterator<Cookie> ite = cook.iterator();
		while (ite.hasNext()) {
		
			System.out.println(ite.next());
			Cookie c = ite.next();
			System.out.println("^^^^^ Line 2 ^^^^^^");
			
			System.out.println(c.getDomain()+"GUESS" + c.getName()+ "GUESS" + c.getPath());
		}
		
	}

}
