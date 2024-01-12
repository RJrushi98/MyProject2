package CoverFox_With_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CoverFox_HomePage 
{
  @FindBy(xpath = "//div[text()='Male']")private WebElement MaleButton;
  public void CoverFoxHomePage(WebDriver driver) 
  {
	  PageFactory.initElements(driver,this);
	  
  }
}
