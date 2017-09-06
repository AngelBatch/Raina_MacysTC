package eComm.macys.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ItemPage //using ObjectRepo
{
	WebDriver driver;
	Object_Repo objr;

	public void selectSizeAndQuantity(WebDriver driver, String qt) throws IOException 
	{	
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(objr.findEle("select_size"))).click();
		Select qty= new Select(objr.findEle("select_quantity"));
		qty.selectByVisibleText(qt);
	}

	public void addToBag(WebDriver driver) throws InterruptedException, IOException
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(objr.findEle("add_to_bag"))).click();
	}

	public  ItemPage(WebDriver wd) throws IOException
	{
		driver= wd;
		objr= new Object_Repo(driver);
	}
}





//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[starts-with(@id,'orderPanel')]/div[2]/div[2]/div[1]/ul/li[@class='swatch']/div)[1]"))).click();
//	Select qty= new Select(driver.findElement(By.xpath(".//*[starts-with(@id,'orderPanel')]/div[5]/div[1]/div[1]/form/select")));
//	qty.selectByVisibleText(qt);
