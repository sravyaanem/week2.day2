package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("sravya");
		driver.findElement(By.id("lastNameField")).sendKeys("Anem");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sanju");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("anem");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT-DEPT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Practise makes man Perfect");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sravya@gmail.com");
      WebElement wb=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
      Select sel=new Select(wb);
      sel.selectByVisibleText("New York");
      driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//a[text()='Edit']")).click();
      driver.findElement(By.id("updateContactForm_description")).clear();
      driver.findElement(By.id("updateContactForm_description")).sendKeys("updated description");
      driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important is to practise");
      driver.findElement(By.className("smallSubmit")).click();
      String str=driver.getTitle();
      System.out.println("Title :"+str);
      
      
	}

}
