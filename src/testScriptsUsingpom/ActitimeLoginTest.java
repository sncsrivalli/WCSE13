package testScriptsUsingpom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPages.ActitimeLoginPage;

public class ActitimeLoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ActitimeLoginPage loginPage = new ActitimeLoginPage(driver);
		loginPage.sendKeysusernameTextField("admin");
		loginPage.sendKeyspasswordTextField("manager");
		loginPage.clickLoginButton();
		
		Thread.sleep(6000);
		
		if(driver.getPageSource().contains("actiTIME -  Enter Time-Track"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.quit();

	}

}
