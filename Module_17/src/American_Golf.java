import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class American_Golf {

	public static void main(String[] args) {

		
		
		ProfilesIni allprof = new ProfilesIni();
		FirefoxProfile mypro = allprof.getProfile("bheema");
		
		WebDriver driv = new FirefoxDriver(mypro);
		driv.manage().window().maximize();
		driv.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driv.get("http://www.americangolf.co.uk");
		driv.findElement(By.xpath("//*[@id='navigation']/nav/ul/li[1]/a")).click();
		
		
		WebElement leftbox= driv.findElement(By.xpath(".//*[@id='secondary']/div[1]/div/div[2]/div"));
		
	List<WebElement> left_links = leftbox.findElements(By.tagName("a"));
	
	for(int i=0; i<left_links.size();i++)
		
	{
		
	String lefttext = left_links.get(i).getText();
	String temp[] = lefttext.split("\\(");
	/*System.out.println(temp[1]);*/
	
	temp = temp[1].split("\\)");
	
	System.out.println(temp[0]);
	}

		
		
	
		
	}

}
