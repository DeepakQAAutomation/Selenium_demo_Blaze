package testCases;
 
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
 
import base.BaseTest;
import pages.AddToCartPage;
import pages.HomePage;
 
public class Cart extends BaseTest
{
 
	@Test(groups={"Regression","Sanity","Master"})
	public void AddToCart() throws InterruptedException
	{
	HomePage Home = new HomePage(driver);
	Home.ClickCartLink();
	Thread.sleep(3000);
	AddToCartPage AddCart = new AddToCartPage(driver);
	AddCart.ClickPlaceOrder();
	AddCart.SetName("Deepak kumar");
	AddCart.SetCountry("India");
	AddCart.SetCity("Delhi");
	AddCart.SetCardDetails("123456789");
	AddCart.SetMonth("2025");
	AddCart.SetYear("2025");
	AddCart.ClickPurchaseButton();
	Thread.sleep(5000);
   System.out.println("Confirmation Message is : " + AddCart.DisplayMessage());
   Assert.assertTrue(AddCart.DisplayMessage().contains("Thank you for your purchase!"));
	Thread.sleep(2000); 
	AddCart.ClickOKButton();
   }
 
     }