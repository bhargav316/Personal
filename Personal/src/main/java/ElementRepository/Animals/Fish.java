package ElementRepository.Animals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class Fish extends BasePage{

	public Fish(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(partialLinkText="FI-SW-01" )
	private WebElement AngelFish;
	
	@FindBy(partialLinkText="FI-SW-02" )
	private WebElement TigerShark;
	
	@FindBy(partialLinkText="FI-FW-01" )
	private WebElement Koi;
	
	@FindBy(partialLinkText="FI-FW-02" )
	private WebElement GoldFish;

	
	
	
	public WebElement getAngelFish() {
		return AngelFish;
	}

	public WebElement getTigerShark() {
		return TigerShark;
	}

	public WebElement getKoi() {
		return Koi;
	}

	public WebElement getGoldFish() {
		return GoldFish;
	}

	

}
