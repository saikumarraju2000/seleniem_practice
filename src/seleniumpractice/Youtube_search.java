package seleniumpractice;

import org.openqa.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Youtube_search
{
	
	public static void main(String[] args) throws Exception
	{
System.out.println("hello");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91995\\eclipse-workspace\\selenium practice\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		System.out.println("hello");
		
		driver.navigate().to("https://www.youtube.com/");
		
		Thread.sleep(5000);//wait for some time
		
		
		driver.findElement(By.name("search_query")).sendKeys("baahubali");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
