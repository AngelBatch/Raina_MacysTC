package eComm.macys.pages;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Object_Repo {
	WebDriver driver;
	Properties prop;

	public Object_Repo(WebDriver wd) throws IOException 
	{		
		File f= new File("C:\\Users\\Rajneesh Mehta\\Desktop\\H2Kinfosys\\Eclipse neon\\Angel Assignments\\Object_Repo.properties");
		FileReader fr = new FileReader(f);
		prop = new Properties();
		prop.load(fr);	
		driver=wd;
	}

	public WebElement findEle(String str) throws IOException
	{	
		String loc=prop.getProperty(str);

		WebElement e=null;
		if (loc.startsWith("id"))
			e=driver.findElement(By.id(loc.replace("id:", "")));
		else if(loc.startsWith("xpath"))  
			e= driver.findElement(By.xpath(loc.replace("xpath:","")));  
		else if(loc.startsWith("classname"))  
			e= driver.findElement(By.className(loc.replace("classname:","")));  
		else if(loc.startsWith("name"))  
			e= driver.findElement(By.name(loc.replace("name:","")));  
		else if(loc.startsWith("cssSelector"))  
			e= driver.findElement(By.cssSelector(loc.replace("cssSelector:","")));  

		return e;
	}

}
