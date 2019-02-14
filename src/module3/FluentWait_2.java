package module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import com.google.common.base.Function;

public class FluentWait_2 {

	public static void main(String[] args) {

		//Instantiate the Browser and print it's path
		System.setProperty("webdriver.chrome.driver","chromedriver");
		System.out.println(System.getProperty("user.dir"));
		
		WebDriver driver = new ChromeDriver();

			driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");
		
			
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

			WebElement element = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement element = driver.findElement(By.partialLinkText("LinkText-4"));
					element.click();
						return element;
				}
				});

	}

}
