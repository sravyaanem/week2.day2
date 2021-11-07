package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sravya@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		//String str=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		String str=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		WebElement ele=driver.findElement(By.xpath("//div[text()='Duplicate Lead']"));
		String str1=ele.getText();
		if(str1.contains("Duplicate Lead")) {
			System.out.println(str1);
		}
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String str3=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(str.equalsIgnoreCase(str3)) {
			System.out.println("Duplicate leads are added successfully");
			driver.close();
		}
		else
			System.out.println("no duplicates");
		
		
		
		
	}

}
