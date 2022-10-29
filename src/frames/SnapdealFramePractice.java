package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealFramePractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement signInTab = driver.findElement(By.xpath("//span[.='Sign In']"));
		Actions a = new Actions(driver);
		a.moveToElement(signInTab).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='login']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.id("close-pop")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
