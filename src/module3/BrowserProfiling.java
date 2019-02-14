package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class BrowserProfiling {

	public static void main(String[] args) {

		// available only for FireFox browser
		
		ProfilesIni profile = new ProfilesIni();
		
		FirefoxProfile NewProfile = profile.getProfile("FirefoxNew");
		
		//Instantiate the Browser and print it's path
		System.setProperty("webdriver.chrome.driver","geckodriver");
		System.out.println(System.getProperty("user.dir"));
		
		FirefoxDriver driver = new FirefoxDriver(NewProfile);
		
		
		driver.get("http://www.google.com");
		
		//driver.close();
		

	}

}
