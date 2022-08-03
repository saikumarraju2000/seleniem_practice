package seleniumpractice;

import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover
{
   public static void main(String[] args) throws Exception
   {
	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\91995\\eclipse-workspace\\selenium practice\\geckodriver.exe");
	   WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
		
		
		
		
		
		
		
   }
}
