package module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateNaukariCom {


		public static void main(String[] args) throws InterruptedException 
		
		{
			
			//Instantiate the Browser and print it's path
			System.setProperty("webdriver.chrome.driver","chromedriver");
			System.out.println(System.getProperty("user.dir"));
			WebDriver driver = new ChromeDriver();
			
			
			driver.get("https://login.naukri.com/nLogin/Login.php");
			
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
					
			driver.findElement(By.xpath("//input[@id='usernameField']")).click();
			
			driver.findElement(By.xpath("//input[@id='passwordField']")).click();
			
			String Text = driver.findElement(By.id("usernameField_err")).getText();
			
			boolean Result = Text.equals("Username cannot be left blank");
			
			System.out.println("Result - " + Result);

	}

}
