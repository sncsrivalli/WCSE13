package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {
	
	//stage 1: Declaration
	@FindBy(id = "username") private WebElement usernameTextField;
	
	@FindBy(name = "pwd") private WebElement passwordTextField;
	
	@FindBy(id = "loginButton") private WebElement loginButton;
	
	//stage 2: Initialization
	public ActitimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//stage 3: Utilization
	public void sendKeysusernameTextField(String username) {
		usernameTextField.sendKeys(username);
	}
	
	public void sendKeyspasswordTextField(String password) {
		passwordTextField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	
}
