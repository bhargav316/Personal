package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public BasePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText="Sign In" )
	private WebElement SignIn;
	
	@FindBy(partialLinkText="Sign Up" )
	private WebElement SignUp;
	
	@FindBy(xpath = "//img[contains(@name,'img_cart')]")
	private WebElement Cart;
	
	@FindBy(xpath = "(//input[contains(@name,'keyword')])[2]")
	private WebElement SearchBox;
	
	@FindBy(partialLinkText="Fish" )
	private WebElement Fish;
	
	@FindBy(partialLinkText="Dogs" )
	private WebElement Dogs;
	
	@FindBy(partialLinkText="Reptiles" )
	private WebElement Reptiles;
	
	@FindBy(partialLinkText="Cats" )
	private WebElement Cats;
	
	@FindBy(partialLinkText="Birds" )
	private WebElement Birds;

	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getSignUp() {
		return SignUp;
	}

	public WebElement getCart() {
		return Cart;
	}

	public WebElement getSearchBox() {
		return SearchBox;
	}

	public WebElement getFish() {
		return Fish;
	}

	public WebElement getDogs() {
		return Dogs;
	}

	public WebElement getReptiles() {
		return Reptiles;
	}

	public WebElement getCats() {
		return Cats;
	}

	public WebElement getBirds() {
		return Birds;
	}
	

}
