package movemouse_events_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromdrive_Actions {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bheemaa\\Downloads\\ChromeSetup.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.apple.co.uk");
		
	}

}
