package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealAutoSuggestions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("inputValEnter")).sendKeys("dress");
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='suggestionList_menu']/li"));
		for(WebElement w: suggestions) {
			System.out.println(w.getText());
		}
		driver.quit();

	}

}
