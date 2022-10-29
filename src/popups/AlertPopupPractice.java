package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopupPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement courseTab = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(courseTab).perform();
		driver.findElement(By.xpath("//span[@class='wrappers']/a[.='Selenium Training']")).click();
		driver.findElement(By.xpath("//button[.=' Add to Cart']")).submit();
		String alertMessage = driver.switchTo().alert().getText();
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		System.out.println(alertMessage);
		driver.quit();
		

	}

}
