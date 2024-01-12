package frameWorkStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class SwagLabMainClass {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		SwagLabLoginPage Login = new SwagLabLoginPage(driver);
		Login.UserName();
		Login.Password();
		Login.Login();
		Thread.sleep(2000);
		SwagLabInventoryPage Inventory = new SwagLabInventoryPage(driver);
		Inventory.BagPackText();
		Inventory.AddToCart();
		Inventory.Cart();
		
	}

}
