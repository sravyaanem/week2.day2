package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   ChromeDriver driver=new ChromeDriver();
   driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
      driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.findElement(By.xpath("//div[@class='firstName textFieldInput section']//input")).sendKeys("sravyaS");
   driver.findElement(By.xpath("//div[@class='lastName textFieldInput section']//input")).sendKeys("anem");
   driver.findElement(By.xpath("//div[@class='emailInput textFieldInput section']//input")).sendKeys("sravya@gmail.com");
   WebElement wb=driver.findElement(By.xpath("//select[@name='UserTitle']"));
   Select select=new Select(wb);
   select.selectByVisibleText("Sales Manager");
   driver.findElement(By.name("CompanyName")).sendKeys("infosys");
   WebElement ele=driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
   Select sel=new Select(ele);
   sel.selectByValue("75");
   driver.findElement(By.name("UserPhone")).sendKeys("9876543210");
   driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
   driver.close();
   
	}

}
