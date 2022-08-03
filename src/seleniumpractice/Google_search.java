package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;


public class Google_search {

	
public static void main(String[] args) throws Exception {
		
		System.out.println("hello");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91995\\eclipse-workspace\\selenium practice\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		System.out.println("hello");
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);//wait for some time
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();

		}
	
		
}
