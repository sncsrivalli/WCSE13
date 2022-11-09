package testScriptsUsingpom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPages.InstagramLoginPage;

public class InstagramLoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		InstagramLoginPage loginPage = new InstagramLoginPage(driver);
		loginPage.passDataToUserName("9177432389");
		loginPage.passDataToPassword("123456");
		loginPage.clickLogin();
		
		Thread.sleep(4000);
		driver.quit();

	}

}
