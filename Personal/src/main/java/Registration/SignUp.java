package Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class SignUp extends BasePage{

	public SignUp(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name = "username")
	private WebElement UserID;
	
	@FindBy(name = "password")
	private WebElement Password;
	
	@FindBy(name = "repeatedPassword")
	private WebElement ConfirmPassword;
	
	@FindBy(name = "firstName")
	private WebElement FirstName;
	
	@FindBy(name = "lastName")
	private WebElement LastName;
	
	@FindBy(name = "email")
	private WebElement Email;
	
	@FindBy(name = "phone")
	private WebElement Phone;
	
	@FindBy(name = "address1")
	private WebElement Address1;
	
	@FindBy(name = "address2")
	private WebElement Address2;
	
	@FindBy(name = "city")
	private WebElement City;
	
	@FindBy(name = "state")
	private WebElement State;
	
	@FindBy(name = "zip")
	private WebElement Zip;
	
	@FindBy(name = "country")
	private WebElement Country;
	
	
	@FindBy(xpath = "//button[text()='Save Account Information']")
	private WebElement SaveAccountInformationButton;

	public WebElement getUserID() {
		return UserID;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPhone() {
		return Phone;
	}

	public WebElement getAddress1() {
		return Address1;
	}

	public WebElement getAddress2() {
		return Address2;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getZip() {
		return Zip;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getSaveAccountInformationButton() {
		return SaveAccountInformationButton;
	}
	
	
	
}
