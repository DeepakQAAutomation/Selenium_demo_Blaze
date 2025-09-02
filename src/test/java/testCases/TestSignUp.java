package testCases;
 
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
 
public class TestSignUp extends BaseTest
{
	@Test
	public void ExecuteSignUP() throws InterruptedException
	{
		HomePage Home = new HomePage(driver);
		Home.ClickSignUPLink();
		Home.SignUPEnterUserNmae("deepak200593@gmail.com");
		Home.SignUPEnterPassword("Automation@2025");
		Home.ClickSignUpButton();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
        System.out.println("Alert Text: " + alert.getText());
        Assert.assertEquals(alert.getText(), "This user already exist.");
        if(alert.getText().equals("This user already exist."))
        {
        	System.out.println("Test is passed");
        }
        else
        {
        	System.out.println("Test is failed");
        }

        alert.accept();  // Click OK

	}
}