package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DemoTest {
	
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https:democorp.ekhool.com");
	}
	
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://democorp.ekhool.com/");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("reshma@resbee.org");
		driver.findElement(By.id("SubmitBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("ekhool");
		driver.findElement(By.id("continueBtn")).click();
		
	}
}
