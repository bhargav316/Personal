package ElementRepository.Animals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class Birds extends BasePage {

	public Birds(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	@FindBy(linkText = "AV-CB-01")
	private WebElement AmazonParrot;
	
	@FindBy(linkText = "AV-SB-02")
	private WebElement Finch;

	public WebElement getAmazonParrot() {
		return AmazonParrot;
	}

	public WebElement getFinch() {
		return Finch;
	}
}
