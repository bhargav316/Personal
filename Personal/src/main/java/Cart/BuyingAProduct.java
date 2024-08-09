package Cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class BuyingAProduct extends BasePage {

	public BuyingAProduct(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//button[text()='Update Cart']")
	private WebElement UpdateCart;
	
	@FindBy(linkText = "Remove All")
	private WebElement RemoveAll;
	
	@FindBy(linkText = "Remove")
	private WebElement Remove;
	
	public WebElement getRemove() {
		return Remove;
	}
	@FindBy(linkText = "Proceed to Checkout")
	private WebElement ProceedtoCheckout;
	
	@FindBy(xpath = "//input[@type='number']")
	private WebElement Quantity;
	
	@FindBy(name = "cardType")
	private WebElement CardType;
	
	
	
	@FindBy(name="creditCard")
	private WebElement CardNumber;
	
	@FindBy(name="expiryDate")
	private WebElement ExpiryDate;
	
	@FindBy(name = "billToFirstName")
	private WebElement FirstName;
	
	@FindBy(name = "billToLastName")
	private WebElement LastName;

	
	@FindBy(name = "billAddress1")
	private WebElement Address1;
	
	@FindBy(name = "billAddress2")
	private WebElement Address2;
	
	@FindBy(name = "billCity")
	private WebElement City;
	
	@FindBy(name = "billState")
	private WebElement State;
	
	@FindBy(name = "billZip")
	private WebElement Zip;
	
	@FindBy(name = "billCountry")
	private WebElement Country;
	
	@FindBy(name = "shippingAddressRequired")
	private WebElement ChangeShippingAddressCheckbox;
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement ContinueButton;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement CancelButton;
	
	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement ConfirmButton;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement Cancel;

	public WebElement getConfirmButton() {
		return ConfirmButton;
	}

	public WebElement getCancel() {
		return Cancel;
	}

	public WebElement getUpdateCart() {
		return UpdateCart;
	}

	public WebElement getRemoveAll() {
		return RemoveAll;
	}

	public WebElement getProceedtoCheckout() {
		return ProceedtoCheckout;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public WebElement getCardType() {
		return CardType;
	}

	

	public WebElement getCardNumber() {
		return CardNumber;
	}

	public WebElement getExpiryDate() {
		return ExpiryDate;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
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

	public WebElement getChangeShippingAddressCheckbox() {
		return ChangeShippingAddressCheckbox;
	}

	public WebElement getContinueButton() {
		return ContinueButton;
	}

	public WebElement getCancelButton() {
		return CancelButton;
	}
	
	
	
	
}
