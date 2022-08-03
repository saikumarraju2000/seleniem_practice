package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;

public class DragDrop 
{
	 public static void main(String[] args) throws Exception
	   {
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\91995\\eclipse-workspace\\selenium practice\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		
		   driver.navigate().to("https://jqueryui.com/droppable");
				   Thread.sleep(3000);
				   //Verify Title--Cond-Fail-stop exe
				   //Actual Result    Exp.Resl
				   
				   //By using if-else ,if any error occurred in any block another block will continues execution. So the remaining program continues. 
				   //assertequals stops total execution if any error occurred. Observe below if any error name occurred in title the whole program discontinues.
				   //assertEquals(driver.getTitle(),"Droppable | jQueryUI");
				   //The above condition has wrong title so the total program discontinues.
				   
				   assertEquals(driver.getTitle(),"Droppable | jQuery UI");
				   System.out.println("Title matched");
				   //Enter into frame
				   driver.switchTo().frame(0);
				   Actions ac = new Actions(driver);
				   ac.dragAndDrop(driver.findElement(By.id("draggable")),
				   driver.findElement(By.id("droppable"))).perform();
				   System.out.println("DragDrop completed");
				   Thread.sleep(3000);
				   //Exit from frame
				   driver.switchTo().defaultContent();
				   driver.close();
				   }
}
