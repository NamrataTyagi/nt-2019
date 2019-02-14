package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertBox {

		public static void main(String[] args) throws InterruptedException {
			
			//Instantiate the Browser and print it's path
			System.setProperty("webdriver.chrome.driver","chromedriver");
			System.out.println(System.getProperty("user.dir"));
			WebDriver driver = new ChromeDriver();
			

			//open AUT
			driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
			
			driver.findElement(By.id("alert")).click();
			
			//Initialize the Alert Interface and Move the focus to Alert
			Alert sA = driver.switchTo().alert();
		
			//get the text of the alert and print on the console
			System.out.println(sA.getText());
			
			Thread.sleep(5000);
			
			//accept the alert
			sA.accept();

	}

}
