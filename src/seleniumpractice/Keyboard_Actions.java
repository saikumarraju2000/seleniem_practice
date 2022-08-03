package seleniumpractice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyboard_Actions
{
	public static void main(String[] args) throws Exception
	   {
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\91995\\eclipse-workspace\\selenium practice\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
			
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			Thread.sleep(4000);
			//click -- Keyboard 1.TAB 2.ENTER
			
			//accessing keyboard using robot class
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			System.out.println("TAB");
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			System.out.println("ENTER");
			System.out.println("Login completed");
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("logout completed");
			driver.close();
			   
			}
}
