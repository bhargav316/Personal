package ElementRepository.Animals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class Reptiles extends BasePage{

	public Reptiles(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(linkText = "RP-SN-01")
	private WebElement Rattlesnake;
	
	@FindBy(linkText = "RP-LI-02")
	private WebElement Iguana;

	public WebElement getRattlesnake() {
		return Rattlesnake;
	}

	public WebElement getIguana() {
		return Iguana;
	}

}
