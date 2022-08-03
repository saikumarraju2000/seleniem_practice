package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable
{
	 public static void main(String[] args) throws Exception
	   {
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\91995\\eclipse-workspace\\selenium practice\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		 
		   driver.get("E:\\SUBJECT\\Selenium subject\\Webtable.html");
		 //Count
		 int row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		 int col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
		 int row_col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
		 System.out.println(row);
		 System.out.println(col);
		 System.out.println(row_col);
		 //Data--cell
		 String cellData = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
		 System.out.println(cellData);
		 //Data -- Whole Table
		 // DT Var VV
		 for(int i=1; i<=row; i++) {
		 String data=driver.findElement(By.
		         xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
		 System.out.println(data);
		 Thread.sleep(3000);
		 }

		 driver.quit();

		 }
}
