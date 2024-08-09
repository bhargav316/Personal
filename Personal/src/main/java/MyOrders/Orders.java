package MyOrders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class Orders extends BasePage {

	public Orders(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText = "My Orders")
	private WebElement MyOrders;

	public WebElement getMyOrders() {
		return MyOrders;
	}
	
}
