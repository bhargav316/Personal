package ElementRepository.Animals.SubCatagories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ElementRepository.Animals.Fish;

public class TigerShark extends Fish{

	public TigerShark(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText = "EST-3")
	private WebElement ToothlessTigerShark;
	
	@FindBy(linkText = "Add to Cart")
	private WebElement AddtoCart;
	

	public WebElement getToothlessTigerShark() {
		return ToothlessTigerShark;
	}

}
