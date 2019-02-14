package module5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Action_MultiSelect {


		public static void main(String[] args) throws InterruptedException {

			//Instantiate the Browser
			System.setProperty("webdriver.chrome.driver","chromedriver");
			WebDriver driver = new ChromeDriver();

			// Open AUT
			driver.get(
					"https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

			// Initialize the Select Class
			Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));

			// Select By visible text - Browser Commands
			oSelect.selectByVisibleText("Browser Commands");
			Thread.sleep(5000);

			// Deselect By visible text - Browser Commands
			oSelect.deselectByIndex(0);
			Thread.sleep(5000);

			// To collect a list of the options available in the web element
			List<WebElement> oSize = oSelect.getOptions();

			// To get the count of the total no of options available and refer them with an
			// int variable for the loop
			int iTotal = oSize.size();

			// print the count of the total options
			System.out.println(iTotal);

			for (int i = 0; i < iTotal; i++) {

				// Get the content of the integer value running through the loop and print it
				String sValue = oSize.get(i).getText();

				System.out.println(sValue);
				Thread.sleep(5000);

				// to select the integer value using select index value
				oSelect.selectByIndex(i);
				Thread.sleep(5000);
			}

			// to select all the options which we have selected in the above loop in one go
			oSelect.deselectAll();
		}
	}

