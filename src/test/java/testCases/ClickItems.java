package testCases;
 
import org.openqa.selenium.Alert;

import org.testng.Assert;

import org.testng.annotations.Test;
 
import base.BaseTest;

import pages.ProductListingPage;
 
public class ClickItems extends BaseTest 

{

	@Test(groups={"Sanity","Master"})

	public void  TestProduct() throws InterruptedException

	{

		ProductListingPage Product = new ProductListingPage(driver);

		Product.ClickONItems();

		Thread.sleep(2000);

		Product.clickAddtocartButton();


	Alert alert=driver.switchTo().alert();

	System.out.println("Alert message is:+"+alert);

	if(alert.getText().equals("Product added."))

			{

		System.out.println("Test is passed");

			}

	else

	{

		System.out.println("Test is failed");

	}

	alert.accept();

	}
 
}

 