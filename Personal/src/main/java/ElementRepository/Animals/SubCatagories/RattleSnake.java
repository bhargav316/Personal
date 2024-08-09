package ElementRepository.Animals.SubCatagories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ElementRepository.Animals.Reptiles;

public class RattleSnake extends Reptiles {

	public RattleSnake(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText = "EST-11")
	private WebElement VenomlessRattlesnake;
	
	@FindBy(linkText = "EST-12")
	private WebElement RattlelessRattlesnake;

	public WebElement getVenomlessRattlesnake() {
		return VenomlessRattlesnake;
	}

	public WebElement getRattlelessRattlesnake() {
		return RattlelessRattlesnake;
	}

}
