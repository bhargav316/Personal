package Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class SignOut extends BasePage{

	public SignOut(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText = "Sign Out")
	private WebElement SignOut;
	
	public WebElement getSignOut() {
		return SignOut;
	}
	
	
}