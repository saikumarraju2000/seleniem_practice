package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatement 
{
	public static void main(String[] args) throws Exception
	   {
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\91995\\eclipse-workspace\\selenium practice\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
			
		   driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		   driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		   driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		   //click on Login button:cond- Wait until Login button to be loaded
		   //cond:--Explicitwait
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		   wait.until(ExpectedConditions.
		           elementToBeClickable(driver.findElement(By.name("Submit"))));
		   driver.findElement(By.name("Submit")).click();
		   //wait for Page To be loaded--implicitWait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		   System.out.println("Login completed");
		   driver.findElement(By.linkText("Logout")).click();
		   Thread.sleep(4000);
		   driver.close();



		   } 
}
