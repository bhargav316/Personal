package ElementRepository.Animals.SubCatagories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ElementRepository.Animals.Fish;

public class AngelFish extends Fish {

	public AngelFish(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText = "EST-1")
	private WebElement LargeAngelfish;
	@FindBy(linkText = "EST-2")
	private WebElement SmallAngelfish;
	@FindBy(linkText = "Add to Cart")
	private WebElement AddtoCart;
	
	public WebElement getLargeAngelfish() {
		return LargeAngelfish;
	}
	public WebElement getSmallAngelfish() {
		return SmallAngelfish;
	}
	public WebElement getAddtoCart() {
		return AddtoCart;
	}

}
