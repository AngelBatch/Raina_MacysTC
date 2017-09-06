package eComm.macys.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage //using PageFactory:: hover
{

	WebDriver driver;
	//@FindBy(how=How.XPATH,using=".//*[starts-with(@id,'flexid')]/a[text()='JUNIORS']") WebElement junior_link; //hover on juniors
	@FindBy(how=How.XPATH,using= ".//*[@id='flexid_16904']/div/div[1]/ul/li[8]/a") WebElement jeans_link;
	
	public void navToJuniorJeans()
	{	WebDriverWait wait= new WebDriverWait(driver,30);
		Actions a1 = new Actions(driver);
		//a1.moveToElement(junior_link).build().perform();
		a1.moveToElement(driver.findElement(By.xpath(".//*[starts-with(@id,'flexid')]/a[text()='JUNIORS']"))).build().perform();
		wait.until(ExpectedConditions.visibilityOf(jeans_link)).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='flexid_16904']/div/div[1]/ul/li[8]/a"))).click();
	}

	public  HomePage(WebDriver wd)
	{
		driver = wd;
		PageFactory.initElements( driver, this);
	}


}



