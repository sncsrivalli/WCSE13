package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLoginPage {
	
	//Declaration
	@FindBy(name = "username") private WebElement usernameTextField;
	
	@FindBy(name = "password") private WebElement passwordTextField;
	
	@FindBy(xpath = "//button[.='Log in']") private WebElement loginButton;
	
	//Initialization
	public InstagramLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void passDataToUserName(String username) {
		usernameTextField.sendKeys(username);
	}
	
	public void passDataToPassword(String password) {
		passwordTextField.sendKeys(password);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
}
