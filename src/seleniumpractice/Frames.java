package seleniumpractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class Frames
{

	public static void main(String[] args) throws Exception
	   {
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\91995\\eclipse-workspace\\selenium practice\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
			
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			System.out.println(driver.getTitle());
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			driver.findElement(By.name("Submit")).click();
			System.out.println("Login completed");
			Thread.sleep(4000);
			//click on Add add btn
			//ENter into frame
			driver.switchTo().frame("rightMenu");
			driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
			driver.findElement(By.name("txtEmpLastName")).sendKeys("suresh");
			driver.findElement(By.id("btnEdit")).click();
			System.out.println("New Emp Added");
			//Exit from frame
			driver.switchTo().defaultContent();

			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Logout completed");
			driver.close();
		}
			

}
