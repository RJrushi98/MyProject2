package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplyStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//driver.findElement(By.xpath("//input[@name=\"show-hide\"]"));		
		
		driver.findElement(By.xpath("//input[@id=\"hide-textbox\"]")).click();
		Thread.sleep(1000);
		//boolean Result = driver.findElement(By.xpath("//input[@id=\"show-textbox\"]")).isDisplayed();
		
		boolean Result1 = driver.findElement(By.xpath("//input[@name=\"show-hide\"]")).isDisplayed();
		
		System.out.println("Result="+Result1);
		
		
		

	}

}
