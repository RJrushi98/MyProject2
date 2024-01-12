package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethodStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
//		
//		driver.get("https://demoqa.com/elements");
//
//		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Rishi");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='userName']")).clear();
//		
		driver.findElement(By.xpath("//label[@class='custom-control-label'][1]")).click();
		
	}

}
