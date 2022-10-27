package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOnMinus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement courseTab = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(courseTab).perform();
		
		driver.findElement(By.xpath("//span[@class='wrappers']/a[.='Selenium Training']")).click();
		
		WebElement plusButton = driver.findElement(By.id("add"));
		a.doubleClick(plusButton).perform();

		WebElement minusButton = driver.findElement(By.id("minus"));
		a.doubleClick(minusButton).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
