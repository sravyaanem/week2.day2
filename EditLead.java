package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("sravya11");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String str1=driver.getTitle();
		if(str1.contains("View Lead")) {
			System.out.println("Title is coorrect");
		}
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement web=driver.findElement(By.id("updateLeadForm_companyName"));
		web.clear();
		String str2="testseg";
		web.sendKeys(str2);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String str3=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(str3);
		String str5=str3.replaceAll("[0-9()]"," ");
		System.out.println(str5);
		if(str5.contains(str2)) {
			System.out.println("Company Name changed");
			driver.close();
		}
		
		

	}

}
