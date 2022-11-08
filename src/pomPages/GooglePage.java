package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	
	//stage 1: Declaration
	@FindBy(name = "q") private WebElement searchTextField;
	
	//stage 2: Initialization
	public GooglePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	//stage 3: Utilization
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	
}
