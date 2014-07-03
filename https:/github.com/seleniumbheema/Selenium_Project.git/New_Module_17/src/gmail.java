import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class gmail {

	public static void main(String[] args) {

		ProfilesIni allprofile = new ProfilesIni();
		FirefoxProfile myprof = allprofile.getProfile("bheema");
		
		myprof.setEnableNativeEvents(true);
		
		String url ="http://www.ebay.co.uk/";
		
		 	WebDriver driv = new FirefoxDriver(myprof);
		 	driv.navigate().to(url);
		 	driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 	List<WebElement> link = driv.findElements(By.className("cat show"));
		 	System.out.println("Links" + link.size());
		 	System.out.println("First link" +link.get(0).getText());
		 	
		 	/*
		 	for (int i = 1; i <link.size(); i++) {
		 		System.out.println("current links" + link.get(i).getText());
				
			}*/
		 	
		 	link.get(1).click();
		 	
		
	
	}

}
