package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Keyboard_Actions_on_GoogleSearch
{
	public static void main(String[] args) throws Exception
	   {
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\91995\\eclipse-workspace\\selenium practice\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
			
			driver.navigate().to("https://www.google.com/");
			Thread.sleep(3000);
			driver.findElement(By.name("q")).sendKeys("selenium");
			Thread.sleep(3000);
			//accessing keyboard using webdriver
			driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.close();



			}

}
