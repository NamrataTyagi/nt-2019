package module2;



	
		// Facebook Example

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Locators2 {

			public static void main(String[] args) throws InterruptedException {
				
				//Instantiate the Browser and print it's path
				System.setProperty("webdriver.chrome.driver",
				"chromedriver");
				System.out.println(System.getProperty("user.dir"));
				WebDriver driver = new ChromeDriver();
				
				//Open the AUT
				driver.get("https://www.facebook.com/");
				
				//Locate using ID
				driver.findElement(By.id("u_0_j")).sendKeys("Namrata");
					
				//Locate using Name
				driver.findElement(By.name("lastname")).sendKeys("Tyagi");
				
				//Locate using class
				driver.findElement(By.className("inputtext")).sendKeys("Namrata");
				driver.findElement(By.className("inputtext")).sendKeys("Tyagi");

				Thread.sleep(5000);

				
				//Locate using Linktext
				driver.findElement(By.linkText("Forgotten account?")).click();
				
				Thread.sleep(5000);
				
				driver.navigate().back();

				Thread.sleep(5000);

				//Locate using Partial Linktext
				driver.findElement(By.partialLinkText("Forgotten")).click();

				Thread.sleep(5000);
						
				//Locate using CSS
				driver.findElement(By.cssSelector("#identify_email")).sendKeys("DummyName");
				
	}

}
