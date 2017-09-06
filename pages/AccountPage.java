package eComm.macys.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage  //using ObjectRepo
{

	WebDriver driver;
	Object_Repo objr;
	
	public void checkOutAsGuest(WebDriver driver) throws IOException

	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(objr.findEle("guest_checkout"))).click();//guest checkout
	}

	public  AccountPage(WebDriver wd) throws IOException{
		driver =wd;
		objr=new Object_Repo(driver);
	}
}
