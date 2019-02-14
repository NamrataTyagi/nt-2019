package module2;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	
	public class Locators1 {

		
		public static void main(String[] args) throws Exception {

			System.setProperty("webdriver.chrome.driver",
					"chromedriver");
					WebDriver driver = new ChromeDriver();
			System.out.println(System.getProperty("user.dir"));
			
			
			//Open AUT
			driver.get("https://www.facebook.com/");
			
			/*//Locate FirstName textBox and type Namrata using ID locator
			driver.findElement(By.id("u_0_j")).sendKeys("Namrata");
			driver.findElement(By.id("u_0_l")).sendKeys("Tyagi");
			
			//Using Name Locator
			driver.findElement(By.name("reg_email__")).sendKeys("dummy.email.com");
			
			
			//Using Class Name
			driver.findElement(By.className("inputtext")).sendKeys("Namrata");
			
			driver.findElement(By.className("inputtext")).sendKeys("Tyagi");
			
			//LinkText
			driver.findElement(By.linkText("Forgotten account?")).click();
			
			
			//Partial linktext
			driver.findElement(By.partialLinkText("Forgot")).click();
			
			
			driver.findElement(By.name("reg_email__")).sendKeys("dummy.email.com");
			
			
			//CSS Locator
			driver.findElement(By.cssSelector("#u_0_a")).click();
			
			List <WebElement> list = driver.findElements(By.tagName("a"));
			
			System.out.println(list.size());
			
			*/
			
			driver.findElement(By.xpath("//*[@name='pass']//preceding::input[1]")).sendKeys("Namrata");
			driver.findElement(By.xpath("//*[@name='email']//following::input[1]")).sendKeys("Tyagi");	
			
			
	}

}
