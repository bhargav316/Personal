package ElementRepository.Animals.SubCatagories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ElementRepository.Animals.Fish;

public class GoldFish extends Fish{

	public GoldFish(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(partialLinkText = "Adult Male Goldfish")
	private WebElement AdultMaleGoldfish;
	
	@FindBy(partialLinkText = "Adult Female Goldfish")
	private WebElement AdultFemaleGoldfish;

	public WebElement getAdultMaleGoldfish() {
		return AdultMaleGoldfish;
	}

	public WebElement getAdultFemaleGoldfish() {
		return AdultFemaleGoldfish;
	}

}
