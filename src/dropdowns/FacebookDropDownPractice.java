package dropdowns;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDownPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		WebElement date = driver.findElement(By.id("day"));
		Select s1 = new Select(date);
		s1.selectByVisibleText("9");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByValue("9");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByIndex(4);
		
		List<WebElement> monthOptions = s2.getOptions();
		ArrayList<String> a = new ArrayList<>();
		System.out.println(monthOptions.size());
		System.out.println("*************** Before Sorting *****************");
		for(WebElement w: monthOptions) {
			System.out.println(w.getText());
			a.add(w.getText());
		}
		System.out.println("**************** After Sorting *****************");
		Collections.sort(a);
		for(Object obj : a) {
			System.out.println(obj);
		}
		
		driver.quit();
	}

}
