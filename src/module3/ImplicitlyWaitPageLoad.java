package module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitPageLoad {


		public static void main(String[] args) throws InterruptedException {
			
		//Instantiate the Browser and print it's path
			System.setProperty("webdriver.chrome.driver","chromedriver");
			System.out.println(System.getProperty("user.dir"));
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://newtours.demoaut.com/");
			
			//Implicitly wait
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//PageLoad
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			
			driver.findElement(By.name("userName")).sendKeys("tutorial");
			driver.findElement(By.name("password")).sendKeys("tutorial");
			driver.findElement(By.name("login")).click();
			
			driver.findElement(By.linkText("PROFILE")).click();
			
			driver.close();

	}

}
