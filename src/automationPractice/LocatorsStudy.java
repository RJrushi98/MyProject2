package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsStudy {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
//		driver.findElement(By.xpath("//div[@class='header-text'][2]")).click();
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Rishi");


	}

}
