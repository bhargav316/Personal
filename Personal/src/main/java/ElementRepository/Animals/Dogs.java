package ElementRepository.Animals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class Dogs extends BasePage {

	public Dogs(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
	@FindBy(linkText = "K9-BD-01")
	private WebElement BullDog;
	
	@FindBy(linkText = "K9-PO-02")
	private WebElement Poodle;
	
	@FindBy(linkText = "K9-DL-01")
	private WebElement Dalmation;
	
	@FindBy(linkText = "K9-RT-01")
	private WebElement GoldenRetreiver;
	
	@FindBy(linkText = "K9-RT-02")
	private WebElement LabradorRetreiver;
	
	@FindBy(linkText = "K9-CW-01")
	private WebElement Chihuahua;

	public WebElement getBullDog() {
		return BullDog;
	}

	public WebElement getPoodle() {
		return Poodle;
	}

	public WebElement getDalmation() {
		return Dalmation;
	}

	public WebElement getGoldenRetreiver() {
		return GoldenRetreiver;
	}

	public WebElement getLabradorRetreiver() {
		return LabradorRetreiver;
	}

	public WebElement getChihuahua() {
		return Chihuahua;
	}
	
}
