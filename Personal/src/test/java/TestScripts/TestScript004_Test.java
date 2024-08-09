package TestScripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;

import Base.BasePage;
import Base.BaseTest;
import Cart.BuyingAProduct;
import ElementRepository.Animals.Reptiles;
import ElementRepository.Animals.SubCatagories.RattleSnake;
import Registration.SignIn;

public class TestScript004_Test extends BaseTest{
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
		BuyingAProduct aProduct=new BuyingAProduct(driver);
		aProduct.getRemove().click();
		String Expected="Your cart is empty.";
		String Actual=driver.findElement(By.xpath("//td[contains(text(),'Your cart is empty.')]")).getText();
		Assert.assertEquals(Actual, Expected);
		System.out.println("Message was displayed");
		driver.quit();
}
}
