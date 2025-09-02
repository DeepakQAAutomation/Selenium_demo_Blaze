package pages;
 
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class AddToCartPage
{
 
	WebDriver driver;
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WEBELEMETS FOR PLACE ORDER
 
	@FindBy(xpath="//button[@class='btn btn-success' and contains(text(),'Place Order')]")
	WebElement PlaceOrderButton;
	
	// WEBELEMENTS FOR USER MODEL FORM
	
	@FindBy(xpath="//input[@id='name']")
	WebElement EnterNameFiled;
	
	@FindBy(xpath="//input[@id='country']")
	WebElement EnterCountryField;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement EntercityField;
	
	@FindBy(xpath="//input[@id='card']")
	WebElement EntercardField;
	
	@FindBy(xpath="//input[@id='month']")
	WebElement EnterMonthField;
	
	@FindBy(xpath="//input[@id='year']")
	WebElement EnteryearField;
	
	@FindBy(xpath="//button[normalize-space()='Purchase']")
	WebElement ClickPurchaseButton;
	
	// WEBELEMENT FOR SUCCESS MESSAGE
	
	@FindBy(xpath="//div[@class='sweet-alert  showSweetAlert visible']//h2[text()='Thank you for your purchase!']")
	WebElement messageSuccess;
	
	// WEBELEMENT FOR OK BUTTON
	
	@FindBy(xpath="//div[@class='sa-confirm-button-container']//button[text()='OK']")
	WebElement ButtonOK;
	
	
 
	// ACTIONS METHODS FOR CART ELEMENTS
 
	public void ClickPlaceOrder()
	{
	PlaceOrderButton.click();
	}
 
	public void SetName(String name)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("orderModal")));
		
		EnterNameFiled.sendKeys(name);
	}
	
	public void SetCountry(String country)
	{
		EnterCountryField.sendKeys(country);
	}
	
	public void SetCity(String City)
	{
		EntercityField.sendKeys(City);
	}
	
	public void SetCardDetails(String Card)
	{
		EntercardField.sendKeys(Card);
	}
	
	public void SetMonth(String Month)
	{
		EnterMonthField.sendKeys(Month);
	}
	
	public void SetYear(String Year)
	{
		EnteryearField.sendKeys(Year);
	}
	
	public void ClickPurchaseButton()
	{
		ClickPurchaseButton.click();
	}
	
	// ACTIONS METHODS FOR SUCCESS MESSAGE
	
	public String DisplayMessage()
	{
		return messageSuccess.getText();
	}
	
	// ACTION METHOD FOR OK BUTTON ON SUCCESS MESSAGE
	
	public void ClickOKButton()
	{
		ButtonOK.click();
	}
}