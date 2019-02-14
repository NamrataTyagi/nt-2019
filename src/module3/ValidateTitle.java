package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTitle {

	public static void main(String[] args) {
	

	//Instantiate the Browser and print it's path
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.out.println(System.getProperty("user.dir"));
		WebDriver driver = new ChromeDriver();
		
		
			driver.get("https://www.google.com/");
			
			String AppTitle = driver.getTitle();

			System.out.println(AppTitle);
				
			boolean result = AppTitle.equals("Google");
			
			System.out.println(result);
			

	}

}
