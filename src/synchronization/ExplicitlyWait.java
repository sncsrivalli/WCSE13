package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		
		
		WebElement loginTextField = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(loginTextField)).sendKeys("admin");
		
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		wait.until(ExpectedConditions.visibilityOf(passwordTextField)).sendKeys("manager");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
		
		driver.quit();
		
	}

}
