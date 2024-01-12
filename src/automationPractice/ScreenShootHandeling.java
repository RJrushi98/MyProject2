package automationPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShootHandeling {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/homepage");
		Thread.sleep(1000);
		
		File obj1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(obj1);
		
		File obj2 = new File("C:\\Users\\DELL-PC\\Pictures\\Screenshots\\icc.jpg");
		
		FileHandler.copy(obj1, obj2);

	}

}
