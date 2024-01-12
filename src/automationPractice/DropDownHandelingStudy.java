package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandelingStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(1000);
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(1000);
		Select sDay=new Select(Day);
		sDay.selectByValue("15");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(1000);
		Select smonth=new Select(month);
		smonth.selectByValue("5");
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(1000);
		Select syear=new Select(year);
		syear.selectByValue("1998");
		
		boolean result = syear.isMultiple();
		System.out.println("year multiple selectable status is "+result);
		driver.close();

	}

}
