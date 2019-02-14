package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameAndListJavaUtil {

	public static void main(String[] args) {

		//Instantiate the Browser and print it's path
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.out.println(System.getProperty("user.dir"));
		
		WebDriver driver = new ChromeDriver();
		
		// Open the AUT
		driver.get("https://www.facebook.com/");
		
		List <WebElement> list = driver.findElements(By.tagName("a"));
	
		System.out.println("Name and count tags having the tagname as 'Input' = "+list.size());
		
		for(int i=0 ; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
	

	}

}
