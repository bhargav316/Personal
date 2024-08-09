package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Base.BasePage;
import Base.BaseTest;
import Cart.BuyingAProduct;
import ElementRepository.Animals.Reptiles;
import ElementRepository.Animals.SubCatagories.RattleSnake;
import Registration.SignIn;

public class TestScript001_Test extends BaseTest {
	@org.testng.annotations.Test
	public void TestScript001_Test() throws InterruptedException {
		BasePage basePage=new BasePage(driver);
		String Id=driver.getWindowHandle();
		basePage.getSignIn().click();
		SignIn s=new SignIn(driver);
		s.getUsernameTextField().clear();
		s.getUsernameTextField().sendKeys("Bhargav");
		s.getPasswordTextField().clear();
		s.getPasswordTextField().sendKeys("1234");
		s.getLoginButton().click();
		
		basePage.getReptiles().click();
		
		Reptiles rep=new Reptiles(driver);
		rep.getRattlesnake().click();
		RattleSnake rattle=new RattleSnake(driver);
		rattle.getVenomlessRattlesnake().click();
		driver.findElement(By.linkText("Add to Cart")).click();
		basePage.getCart().click();
		Thread.sleep(2000);
		BuyingAProduct bp=new BuyingAProduct(driver);
		bp.getProceedtoCheckout().click();
		WebElement card = bp.getCardType();
		Select select=new Select(card);
		select.getFirstSelectedOption().click();
		bp.getCardNumber().clear();
		bp.getCardNumber().sendKeys("9876543321");
		bp.getExpiryDate().clear();
		bp.getExpiryDate().sendKeys("23/2025");
		bp.getFirstName().sendKeys("John");
		bp.getLastName().sendKeys("Cena");
		bp.getAddress1().sendKeys("Banashankari");
		bp.getAddress2().sendKeys("Gopalan");
		bp.getCity().sendKeys("Bangalore");
		bp.getState().sendKeys("Karnataka");
		bp.getZip().sendKeys("123456");
		bp.getCountry().sendKeys("India");
		bp.getContinueButton().click();
		bp.getConfirmButton().click();
		String ExpectedMsg= "Thank you, your order has been submitted.";
		String ConfirmationMsg=driver.findElement(By.xpath("//p[contains(text(),'Thank you, your order has been submitted')]")).getText();
		Assert.assertEquals(ConfirmationMsg,ExpectedMsg);
		driver.quit();
		
		
		
	
	}
	
	
	
}
