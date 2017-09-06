package eComm.macys.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrderPage //using PageFactory
{
	WebDriver driver;
	@FindBy(how=How.ID, using= "rc-shipping-continue") WebElement shipping_continue;
	@FindBy(how=How.XPATH,using=".//*[@aria-required='true']") List <WebElement> mandatoryFields;

	public void clickOnContinue(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(shipping_continue)).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rc-shipping-continue"))).click();
	}

	public int printMandatoryFields(WebDriver driver){
		//List<WebElement> mandatoryFields=  driver.findElements(By.xpath(".//*[@aria-required='true']"));
		//print the fields names
		System.out.println("No. of mandatory fields are "+ mandatoryFields.size());			
		for(int i=0; i<mandatoryFields.size();i++)
		{System.out.println(mandatoryFields.get(i).getAttribute("id"));}

		return mandatoryFields.size();

	}

	public  PlaceOrderPage(WebDriver wd)
	{
		driver=wd;
		PageFactory.initElements(driver, this);


	}


}
