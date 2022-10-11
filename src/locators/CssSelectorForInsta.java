package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorForInsta {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.quit();

	}

}
