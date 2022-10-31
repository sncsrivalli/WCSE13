package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopupPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[.=' GEARS ']")).click();
		driver.findElement(By.xpath("//div[@class='menu-right']/descendant::a[.=' SkillRary Essay']")).click();
		String parentBrowser = driver.getWindowHandle();
		System.out.println(parentBrowser);
		Set<String> browsers = driver.getWindowHandles();
		System.out.println(browsers);
		for(String child: browsers) {
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.id("mytext")).sendKeys("Srivalli");
		Thread.sleep(2000);
		driver.quit();

	}

}
