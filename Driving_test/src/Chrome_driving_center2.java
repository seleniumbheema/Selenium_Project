import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Chrome_driving_center2 {

	public static void main(String[] args) {

		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bheemaa\\git\\chromedriver_win32_2.3\\chromedriver.exe");
		
		
		/*	WebDriver d = new ChromeDriver();
		d.get(url);
			*/
		
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		capabilities.setCapability("chrome.binary","Chrome exe path");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("http://www.google.com");
	}

}
