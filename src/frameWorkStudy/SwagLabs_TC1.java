package frameWorkStudy;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs_TC1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		WebElement First_iteam = driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory'][1]"));
		First_iteam.click();
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory'][1]")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();
		List<WebElement> Cart_Items_Name = driver.findElements(By.className("inventory_item_name"));
		System.out.println(Cart_Items_Name.size());
		
		for(WebElement CI:Cart_Items_Name)
		{
			System.out.println("Cart Items are "+CI.getText());
		}
		
		Iterator<WebElement> IT = Cart_Items_Name.iterator();
		WebElement CartIems = IT.next();
		
		
		if (CartIems.getText().equals("Sauce Labs Backpack"))
		{
			System.out.println("TC1 is Pass");
			driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
		}
		else
		{
			System.out.println("TC1 is failed");
		}

		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("Rishi");
		driver.findElement(By.id("last-name")).sendKeys("Jawale");
		driver.findElement(By.id("postal-code")).sendKeys("415523");

		driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
		driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
		
		String ThankYouMessage = driver.findElement(By.className("complete-header")).getText();
	
		if(ThankYouMessage.equals("THANK YOU FOR YOUR ORDER"))	
		{
			System.out.println("Thank you message comming");
		}
		else
		{
			System.out.println("message not comming please crosscheck");
		}
			
			
		
		
		
	}

}
