package eComm.macys.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingBagPage //using ObjectRepo
{
	WebDriver driver;
	Object_Repo objr;
	public String itemRemoval(WebDriver driver) throws IOException
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(objr.findEle("remove_item"))).click();		
		String errorMsg= wait.until(ExpectedConditions.visibilityOf(objr.findEle("shopping_bag_message"))).getText();
		
		//print error message
		if (errorMsg.equals("Your Current Shopping Bag is empty."))
		{System.out.println("Removal successful");
		System.out.println("Message displayed: "+errorMsg);
		}
		else
			System.out.println("Removal unsuccessful");
		return errorMsg;
	}

	public void proceedToCheckOut(WebDriver driver) throws IOException
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(objr.findEle("proceed_to_checkout"))).click();
}

	public  ShoppingBagPage(WebDriver wd) throws IOException
	{
		driver=wd;
		objr=new Object_Repo(driver);
	}
}
