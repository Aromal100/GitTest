package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestnG {
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
	@Test
	public void test2 () throws InterruptedException
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement c=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='mainTitleSidemenu']//div[@id='users']")));
		c.click();
		Thread.sleep(3000);
		WebElement L=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='menu-title'][normalize-space()='Learners']")));
	L.click();
	}
	
	@AfterTest
	public void quit()
	{
		driver.quit();
	}

}
