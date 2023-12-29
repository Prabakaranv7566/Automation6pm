package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownParticular {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/dropdowns");
	WebElement element = driver.findElement(By.xpath("//select[@id='fruits']"));
	Select s=new Select(element);
	List<WebElement> options = s.getOptions();
	for(WebElement ele: options)
	{
		String text = ele.getText();
		if(text.equals("Orange"))
		{
			s.selectByVisibleText(text);
		}
	}
	
	
}
}
