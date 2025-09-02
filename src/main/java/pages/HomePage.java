package pages;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class HomePage 
{
 
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	// WEBELEMENTS FOR SIGNUP MENU
	@FindBy(xpath="//a[@class='nav-link' and contains(text(),'Sign up')]")
	WebElement SignUpLink;
	@FindBy(xpath="//input[@id='sign-username']")
	WebElement signupUserNamefield;
	@FindBy(xpath="//input[@id='sign-password']")
	WebElement signuppasswordField;
	@FindBy(xpath="//div[@class='modal-footer']//button[contains(text(),'Sign up')]")
	WebElement SignUpbutton;
	// WEBELEMENTS FOR LOGIN LINK
	@FindBy(xpath="//a[@class='nav-link' and contains(@id,'login2')]")
	WebElement LoginLink;
	@FindBy(xpath="//input[@class='form-control' and contains(@id,'loginusername')]")
	WebElement LoginEnterUserNameField;
	@FindBy(xpath="//input[@class='form-control' and contains(@id,'loginpassword')]")
	WebElement LoginEnterPasswordField;
	@FindBy(xpath="//button[@class='btn btn-primary' and contains(text(),'Log in')]")
	WebElement LoginButton;
	@FindBy(xpath="//a[@class='nav-link' and contains(text(),'Welcome')]")
	WebElement TextWelcome;
	//WEBELEMENT FOR CART LINK
 
	@FindBy(xpath="//a[@class='nav-link' and contains(text(),'Cart')]")
	WebElement CartLink;
 
 
	// ACTIONS METHODS FOR SIGN UP WEBELEMENTS
	public void ClickSignUPLink()
	{
		SignUpLink.click();
	}
	public void SignUPEnterUserNmae(String UName)
	{
		signupUserNamefield.sendKeys(UName);
	}
	public void SignUPEnterPassword(String PWD)
	{
		signuppasswordField.sendKeys(PWD);
	}
	public void ClickSignUpButton()
	{
		SignUpbutton.click();
	}
	// ACTIONS METHODS FOR Login WEBELEMENTS
	public void ClickLoginLink()
	{
		LoginLink.click();
	}
	public void LoginEnterUserName(String LUName)
	{
		LoginEnterUserNameField.sendKeys(LUName);
	}
	public void LoginEnterPassword(String LPWD)
	{
		LoginEnterPasswordField.sendKeys(LPWD);
	}
	public void ClickLoginButton()
	{
		LoginButton.click();
	}
	public String SuccessMessage()
	{
		return TextWelcome.getText();
	}
	// ACTIONS METHODS FOR CART ELEMENTS ON HOME PAGE
 
	public void ClickCartLink()
	{
	CartLink.click();
	}
 
}