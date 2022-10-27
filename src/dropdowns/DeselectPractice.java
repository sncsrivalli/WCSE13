package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropDown = driver.findElement(By.id("cars"));
		Select s = new Select(dropDown);
		if(s.isMultiple()) {
			System.out.println("Multi Select");
			List<WebElement> options = s.getOptions();
			System.out.println(options.size());
			
			for(WebElement w: options) {
				System.out.println(w.getText());
			}
			s.selectByIndex(0);
			s.selectByValue("299");
			s.selectByVisibleText("INR 50 - INR 99 ( 1 ) ");
			
			Thread.sleep(5000);
//			s.deselectByIndex(0);
//			s.deselectByValue("299");
//			s.deselectByVisibleText("INR 50 - INR 99 ( 1 ) ");
			s.deselectAll();
		}
		else
			System.out.println("Single Select");
		Thread.sleep(2000);
		driver.quit();
	}

}
