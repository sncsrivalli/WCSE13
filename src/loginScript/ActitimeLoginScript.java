package loginScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginScript {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		System.out.println(title+"\n"+url);
		
		if(title.contains("Enter Time-Track"))
			System.out.println("Pass : Home page is displayed");
		else
			System.out.println("Fail : Home page is not displayed");
		
		driver.quit();

	}

}
