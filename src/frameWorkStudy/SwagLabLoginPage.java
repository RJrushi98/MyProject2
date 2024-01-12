package frameWorkStudy;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 
{
	
	@FindBy(name="user-name")private WebElement UserNameField;
	@FindBy(name="password")private WebElement PasswordField;
	@FindBy(className ="btn_action")private WebElement LoginButton;
	
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		public void UserName()
		{
			UserNameField.sendKeys("standard_user");
		}
		public void Password()
		{
			PasswordField.sendKeys("secret_sauce");
		}
		public void Login()
		{
			LoginButton.click();
		}

}
