package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragAndDropInSkillrary {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement categoryDropdown = driver.findElement(By.name("addresstype"));
		Select s = new Select(categoryDropdown);
		s.selectByIndex(1);
		Thread.sleep(2000);
		WebElement cucumberImage = driver.findElement(By.xpath("//img[@id='Selenium Training' and @draggable='true']"));
		WebElement myCart = driver.findElement(By.xpath("//div[@id='cartArea']"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.dragAndDrop(cucumberImage, myCart).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
