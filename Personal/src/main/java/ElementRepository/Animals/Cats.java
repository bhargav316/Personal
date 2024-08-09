package ElementRepository.Animals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class Cats extends BasePage {

	public Cats(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText = "FL-DSH-01")
	private WebElement Manx;
	
	@FindBy(linkText = "FL-DSH-02")
	private WebElement Persian;

	public WebElement getManx() {
		return Manx;
	}

	public WebElement getPersian() {
		return Persian;
	}

}
