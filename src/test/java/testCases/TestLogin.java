package testCases;
 
import org.testng.Assert;
import org.testng.annotations.Test;
 
import base.BaseTest;
import pages.HomePage;
 
public class TestLogin extends BaseTest
{
 
	@Test(groups={"Smoke","Sanity"})
	public void Login()
	{
		HomePage Home = new HomePage(driver);
		Home.ClickLoginLink();
		Home.LoginEnterUserName("deepak200593@gmail.com");
		Home.LoginEnterPassword("Automation@2025");
		Home.ClickLoginButton();
		// Get the actual welcome text
	    String actualText = Home.SuccessMessage();
	    String expectedText = "Welcome deepak200593@gmail.com";
 
	    // Assertion (using TestNG)
	    Assert.assertEquals(actualText, expectedText, "Welcome message validation failed!");
	}
}