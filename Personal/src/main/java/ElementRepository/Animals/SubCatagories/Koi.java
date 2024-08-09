package ElementRepository.Animals.SubCatagories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ElementRepository.Animals.Fish;

public class Koi extends Fish {

	public Koi(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText = "EST-4")
	private WebElement SpottedKoi;
	
	@FindBy(linkText = "EST-5")
	private WebElement SpotlessKoi;

	public WebElement getSpottedKoi() {
		return SpottedKoi;
	}

	public WebElement getSpotlessKoi() {
		return SpotlessKoi;
	}
	
	

}
