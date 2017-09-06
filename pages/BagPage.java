package eComm.macys.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BagPage //using Pagefactory
{
	WebDriver driver;
	@FindBy(how=How.XPATH, using=".//*[@id='atbTopMessage']/a") WebElement cartMessage;
	@FindBy(how=How.ID,using="checkoutLink") WebElement checkoutButton;
	
	public void noOfItemsInCart (WebDriver driver,String qt)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		String cartMesg= wait.until(ExpectedConditions.visibilityOf(cartMessage)).getText();
		String [] cartMesgItemCount = cartMesg.split(" ", 2);
		String cartItemCount= cartMesgItemCount[0];
		System.out.println(cartItemCount);		
		if(cartItemCount.equals(qt))
			System.out.println("The Quantity added to cart is same as selected.");
		else 
			System.out.println("The Quantity added to cart is not same as selected.");
	}
	
	public void viewBagAndCheckout(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkoutLink"))).click();
		wait.until(ExpectedConditions.visibilityOf(checkoutButton)).click();
	}

	public  BagPage(WebDriver wd)
	{
		driver=wd;
		PageFactory.initElements(driver, this);
	}
}
