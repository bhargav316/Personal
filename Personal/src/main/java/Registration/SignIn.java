package Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class SignIn extends BasePage{

	public SignIn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name = "username")
	private WebElement UsernameTextField;
	
	@FindBy(name = "password")
	private WebElement PasswordTextField;
	
	@FindBy(xpath ="//button[text()='Login']")
	private WebElement LoginButton;

	public WebElement getUsernameTextField() {
		return UsernameTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

}
