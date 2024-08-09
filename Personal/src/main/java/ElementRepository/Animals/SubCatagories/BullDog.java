package ElementRepository.Animals.SubCatagories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ElementRepository.Animals.Dogs;

public class BullDog extends Dogs{

	public BullDog(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText = "EST-6")
	private WebElement AdultMaleBulldog;
	
	@FindBy(linkText = "EST-7")
	private WebElement FemalePuppyBulldog;

	public WebElement getAdultMaleBulldog() {
		return AdultMaleBulldog;
	}

	public WebElement getFemalePuppyBulldog() {
		return FemalePuppyBulldog;
	}
	
}
