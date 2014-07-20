import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class firefox_virtumart {

	public static void main(String[] args) {

		
		ProfilesIni allprof = new ProfilesIni();
		FirefoxProfile myprof = allprof.getProfile("bheema");
		myprof.setEnableNativeEvents(true);
		String BaseURL= "http://demo.virtuemart.net/";
		
		WebDriver driv = new FirefoxDriver(myprof);
		driv.manage().window().maximize();
		driv.get(BaseURL);
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driv.findElement(By.xpath("//a[@title='eCommerce demo products']")).click();
		
		List<WebElement> allcat = driv.findElements(By.xpath("//div[@class='spacer']/h2[@class='name']"));
		System.out.println("allcat--->" + allcat.size() );
		
		List<WebElement> allprod = driv.findElements(By.xpath("//div[@class='spacer']/div[@class='link']"));
		System.out.println("allprod--->" + allprod.size() );
		for(int i=0 ; i<=allcat.size(); i++){
			String getallcat = allcat.get(i).getText();
	/*		System.out.println(getallcat);*/
			if(getallcat.equals("Mobile Phones")){
				allprod.get(i).click();
			}
		}
			
	}

}
