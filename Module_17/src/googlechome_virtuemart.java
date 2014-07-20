import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class googlechome_virtuemart {

	public static void main(String[] args) {

		ProfilesIni allprof = new ProfilesIni();
		FirefoxProfile myprof = allprof.getProfile("bheema");
		
		
		
		
/*		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bheemaa\\git\\chromedriver_win32_2.3\\chromedriver.exe");
		
*/		String url ="http://demo.virtuemart.net/";
		WebDriver d = new FirefoxDriver(myprof);
		d.manage().window().maximize();
		d.get(url);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.xpath("//a[@title='eCommerce demo products']")).click();

		String Start_xpath ="//*[@id='categories']/div[1]/div[";
		String end_xpath="]/div/div/h2";
		
		/*List<WebElement> cat = d.findElements(By.id("categories"));
		System.out.println(cat.size());*/
		
		for(int i=1; i<=3 ; i++){
			WebElement top = d.findElement(By.xpath(Start_xpath+i+end_xpath));
			System.out.println(top.getText());
			
		}
			
			d.findElement(By.xpath("//*[@id='categories']/div[1]/div[2]/div/div/div[1]")).click();
			
			System.out.println("XXXXXX extacting all cat links XXXXXX");
			List<WebElement> allcat = d.findElements(By.xpath("//div[@class='spacer']/h3[@class='product-name']"));
			System.out.println("allcat links --> "+ allcat.size() );
			
			System.out.println("XXXXXXXXXXXXXXXx");

			List<WebElement> allbuttons = d.findElements(By.xpath("//div[@class='product-link']"));
			System.out.println("allbutons---->" +allbuttons.size());
			
			
			for(int j =0; j <allcat.size(); j++){
				String alllinks = allcat.get(j).getText();
				/*System.out.println(alllinks);*/
				
				if(alllinks.equals("Apple iPhone")){
					allbuttons.get(j).click();
				}
				
			}
		
	}

}
