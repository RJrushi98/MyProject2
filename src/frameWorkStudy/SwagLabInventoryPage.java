package frameWorkStudy;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabInventoryPage 
{
	@FindBy(className="inventory_item_name")private WebElement BagPack;
	@FindBy(className="btn_secondary btn_inventory")private WebElement AddToCartButton;
	@FindBy(className="shopping_cart_container")private WebElement CartBucket;
	
	public SwagLabInventoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void BagPackText()
	{
		BagPack.getText();
	}
	public void AddToCart()
	{
		AddToCartButton.click();
	}
	public void Cart()
	{
		CartBucket.click();
	}

}
