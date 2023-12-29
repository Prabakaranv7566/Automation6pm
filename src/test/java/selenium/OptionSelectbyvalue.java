package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptionSelectbyvalue {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> days_count = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		
		for(int i=0; i<days_count.size();i++)
		{
			if(i%2!=0)
			{
				days_count.get(i).click();
			}
						
		}
		driver.findElement(By.xpath("//label[@for='female']/preceding-sibling::input")).click();
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.xpath("//select"));
		Select s=new Select(findElement);
		s.selectByVisibleText("India");
		
		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='colors']"));
		Select s1=new Select(findElement2);
		s1.selectByIndex(2);
		s1.selectByVisibleText("Yellow");
		s1.selectByValue("red");
		s1.selectByIndex(1);
		
		
	}

}
