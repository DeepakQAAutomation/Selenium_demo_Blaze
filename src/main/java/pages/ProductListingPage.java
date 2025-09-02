package pages;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class ProductListingPage 
{
 
	public WebDriver driver;
	public ProductListingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// WEBELEMET FOR SELECTING ITEMS ON THE PRODUCT PAGE
	@FindBy(xpath="//div[@class='card-block']//a[contains(text(),'Nokia lumia 1520')]")
	WebElement lumia;
	@FindBy(xpath="//div[@class='col-sm-12 col-md-6 col-lg-6']//a[@class='btn btn-success btn-lg' and contains(text(),'Add to cart')]")
	WebElement BtnAddToCart;
	// ACTION METHODS FOR THE SELECTED ITEMS
	public void ClickONItems() throws InterruptedException
	{
		Thread.sleep(2000);
		lumia.click();
	}
	public void clickAddtocartButton()
	{
		BtnAddToCart.click();
	}
}