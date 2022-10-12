package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAndOrOperators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='textField pwdfield' or @placeholder='Password']"))
				.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		driver.quit();

	}

}
