package seleniumpractice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;


public class TC001_Login_Logout {
	
	
public static void main(String[] args) throws Exception {
		
		System.out.println("hello");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91995\\eclipse-workspace\\selenium practice\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(8000);
		
		System.out.println("hello");
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);//wait for some time
		System.out.println("Application Opened");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		
		
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		System.out.println("Logout completed");
		driver.close();

		}
	
		

}
