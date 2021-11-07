package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
driver.findElement(By.xpath("//span[text()='Phone']")).click();
driver.findElement(By.xpath("//div[@class='x-plain-bwrap']//input[@name='phoneNumber']")).sendKeys("967");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(5000);
String str=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
driver.findElement(By.xpath("//a[text()='Delete']")).click();
driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(str);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(5000);
WebElement we=driver.findElement(By.xpath("//div[text()='No records to display']"));
if(we.isDisplayed()) {
	System.out.println("NO data to dispaly");
}
else
	System.out.println("try again");
driver.close();




	}

}
