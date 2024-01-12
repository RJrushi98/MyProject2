package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebdriverMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.instagram.com/");
		
		driver.navigate().back();
		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();
		
		String URL = driver.getCurrentUrl();
		System.out.println("URL = "+URL);
		
		String title = driver.getTitle();
		System.out.println("title = "+title);
		
//		driver.close();
//		Thread.sleep(5000);
//		driver.quit();
		
	}

}
