package webelementInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethodPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement computers = driver.findElement(By.xpath("//div[@class='a-image-container a-dynamic-image-container']/img[@alt='Computers & Accessories']"));
		Point location = computers.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("x coordinate : "+x+"\n"+"y coordinate : "+y);
		driver.quit();
	}

}
