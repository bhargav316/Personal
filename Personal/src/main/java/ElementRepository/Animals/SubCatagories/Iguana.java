package ElementRepository.Animals.SubCatagories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ElementRepository.Animals.Reptiles;

public class Iguana extends Reptiles{

	public Iguana(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText = "EST-13")
	private WebElement GreenAdultIguana;

	public WebElement getGreenAdultIguana() {
		return GreenAdultIguana;
	}
}
