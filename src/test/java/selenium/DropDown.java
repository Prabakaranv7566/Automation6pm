package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		WebElement flist = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select s=new Select(flist);
		//s.selectByIndex(3);
		s.selectByVisibleText("Apple");
		
		boolean more = s.isMultiple();
		System.out.println(more); //false
		List<WebElement> optionlist = s.getOptions();
		for(WebElement ele: optionlist)
		{
			String val = ele.getText();
			System.out.println(val);
			s.selectByVisibleText(val);
			Thread.sleep(2000);
		}
				
	}

}
