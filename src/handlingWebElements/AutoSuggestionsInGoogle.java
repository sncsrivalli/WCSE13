package handlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsInGoogle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("seleni");
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li/descendant::span"));
		
		for(WebElement w : autoSuggestions) {
			System.out.println(w.getText());
		}
		driver.quit();
	}

}
