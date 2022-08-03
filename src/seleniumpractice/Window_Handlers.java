package seleniumpractice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Handlers
{
	 public static void main(String[] args) throws Exception
	   {
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\91995\\eclipse-workspace\\selenium practice\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		  
		 //1st wind
		   driver.get("E:\\SUBJECT\\Selenium subject\\Window_handlers.html");
		   Thread.sleep(3000);
		   //2nd wind
		   driver.findElement(By.id("btn2")).click();
		   Thread.sleep(3000);
		   //3rd Wind
		   driver.findElement(By.id("btn3")).click();
		   Thread.sleep(3000);
		   ArrayList<String> windinfo = new ArrayList<String>(driver.getWindowHandles());
		   driver.switchTo().window(windinfo.get(0));
		   System.out.println(windinfo);
		   Thread.sleep(3000);
		   
		   //driver.close(); //To close current browser
		   driver.quit(); //To close all browsers opened by webdriver instance





		   }
}
