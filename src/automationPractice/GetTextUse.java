package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextUse {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nobroker.in/");
		
		Thread.sleep(1000);
		
		String ExpectedResult = "World's Largest NoBrokerage Property Site";
		
		String ActualResult = driver.findElement(By.xpath("//div[text()=\"World's Largest NoBrokerage Property Site\"]")).getText();
		
		System.out.println(ActualResult);
		
		if(ExpectedResult.equals(ActualResult))
		{
			System.out.println("Test case Pass");
			
		}
		else
		{
			System.out.println("Test case Failed");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
