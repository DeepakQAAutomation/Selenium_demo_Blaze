package base;
 
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;
import pages.ProductListingPage;
 
public class BaseTest 
{
 
	public static WebDriver driver;
	@BeforeMethod(groups={"Smoke","Sanity","Regression","Master"})
	public void SetUpBrowser() throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// HOME PAGE LOGIN
		 HomePage home = new HomePage(driver);
	        home.ClickLoginLink();
	        home.LoginEnterUserName("deepak200593@gmail.com");
	        home.LoginEnterPassword("Automation@2025");
	        home.ClickLoginButton();
 
	   // PRODUCT ITEMS CLICKING
	        ProductListingPage Product = new ProductListingPage(driver);
			Thread.sleep(2000);
			Product.ClickONItems();  
 
	}
	@AfterMethod(groups={"Smoke","Sanity","Regression","Master"})
	public void TearDown()
	{
		if(driver!=null)
			driver.quit();
	}
 
	public String captureScreen(String tname) {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
 
	    TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	    File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
 
	    String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
	    File targetFile = new File(targetFilePath);
 
	    sourceFile.renameTo(targetFile);
 
	    return targetFilePath;
	}
 
}