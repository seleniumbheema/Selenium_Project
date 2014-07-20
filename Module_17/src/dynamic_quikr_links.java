import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class dynamic_quikr_links {

	public static void main(String[] args) {
	
		
		
		ProfilesIni allprofs = new ProfilesIni();
		FirefoxProfile myprof = allprofs.getProfile("bheemaa");
		myprof.setEnableNativeEvents(true);
		
		WebDriver driv = new FirefoxDriver(myprof);
		
		driv.navigate().to("http://www.quikr.com");
		
		List<WebElement> mainlinks = driv.findElements(By.xpath("//*[@id='main_textarea']"));
		
		System.out.println(mainlinks.size());
		System.out.println(mainlinks.get(1).getText());
		mainlinks.get(1).click();
		
		String str1 = "//*[@id='main_textarea']/div/div[1]/div[2]/div/ul[1]/li[";
		String str2 ="]/a";
		for (int i = 3; i < 14; i++) {
			
			WebElement sublink =  driv.findElement(By.xpath(str1+i+str2));
			System.out.println(sublink.getText());
		
		}
		
		
		/*for(int i =0 ; i<= mainlinks.size(); i++){
			
			
		}*/
		
	}

}
