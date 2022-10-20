package webelementInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethodPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchButton = driver.findElement(By.xpath("//div[@class='CcAdNb']"));
		
		if(searchButton.isEnabled())
			System.out.println("Search button enabled");
		else
			System.out.println("Search button disabled");
		
		driver.quit();
	}

}
