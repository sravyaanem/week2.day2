package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateFaceBookAccount {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Click Create Account
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
				//give FirstName
//		WebElement wb=driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']"));
//		wb.wait();
//		wb.sendKeys("sravya");
		
		WebElement wb=driver.findElement(By.name("firstname"));
//		wb.clear();
		wb.sendKeys("sanju");
		//give LastName
		driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("anem");
//		//give Mobileno
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
//		//give password
		driver.findElement(By.id("password_step_input")).sendKeys("sravya");
		//day to select
		WebElement list1=driver.findElement(By.xpath("//select[@id='day']"));
		Select select=new Select(list1);
		Thread.sleep(5000);
		select.selectByValue("18");
		//month to select
		WebElement list2=driver.findElement(By.xpath("//select[@id='month']"));
		Select select1=new Select(list2);
		select1.selectByValue("6");
		//year to select
		WebElement list3=driver.findElement(By.xpath("//select[@id='year']"));
		Select select2=new Select(list3);
		select2.selectByValue("1998");
		//check radio button for gender
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	}

}
