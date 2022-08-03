package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class Alerts
{
	public static void main(String[] args) throws Exception
	   {
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\91995\\eclipse-workspace\\selenium practice\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
			
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(4000);
			Alert a = driver.switchTo().alert();
			System.out.println(a.getText());
			Thread.sleep(4000);
			a.accept();
			Thread.sleep(4000);
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			driver.findElement(By.name("Submit")).click();
			System.out.println("Login completed");
			Thread.sleep(4000);
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Logout completed");
			driver.close();
			}
}
