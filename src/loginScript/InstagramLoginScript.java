package loginScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginScript {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		String loginPageTitle = driver.getTitle();
		if(loginPageTitle.equals("Instagram"))
			System.out.println("Pass : Login page displayed");
		else
			System.out.println("Fail : Login page is not displayed");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("manager");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
		

	}

}
