import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverStudy {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		String URLname = driver.getCurrentUrl();
		System.out.println("URL ="+URLname);
		String Title = driver.getTitle();
		System.out.println("Title ="+Title);
	
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Rakhi");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();

	}

	
}
