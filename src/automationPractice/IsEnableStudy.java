package automationPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9067032885");
		
		boolean Result = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(Result);
		
		boolean Result1 = driver.findElement(By.xpath("//button[@type='submit']")).isSelected();
		System.out.println(Result1);
		
		
		
		
	}

}
