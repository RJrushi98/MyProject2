package coverFoxWithDataDriven;

import java.io.FileInputStream; 
import java.io.IOException; 
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.WorkbookFactory; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.chrome.ChromeOptions;

public class CF_TC555_Validate_search_results_for_healthcare_policies

{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
//		FileInputStream myfile= new FileInputStream("C:\\MyAllNotes\\TestSceanrioTemplate.xlsx"); 
//		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("CoverFoxData"); 
//		String ageData = mySheet.getRow(0).getCell(0).getStringCellValue(); 
//		String pinCodeData = mySheet.getRow(0).getCell(1).getStringCellValue(); 
//		String mobNumData = mySheet.getRow(0).getCell(2).getStringCellValue(); 
		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("--disable-notifications"); 
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.coverfox.com/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		CoverFoxHomePage home= new CoverFoxHomePage(driver); 
		Thread.sleep(500); 
		home.clickOnMaleButton();
		
		CoverFoxHealthPlanPage healthPlan= new CoverFoxHealthPlanPage(driver); 
		Thread.sleep(500); 
		healthPlan.clickOnNextButton();
		
		CoverFoxMemberDetailsPage membersDetails= new CoverFoxMemberDetailsPage(driver); 
		Thread.sleep(1000); 
		membersDetails.hanldeAgeDropDown(); 
		Thread.sleep(1500);
		membersDetails.clickOnNextButton();
		
		CoverFoxAddressDetailsPage addressDetails= new CoverFoxAddressDetailsPage(driver);
		Thread.sleep(1500); 
		addressDetails.enterPinCode(); 
		Thread.sleep(1500); 
		addressDetails.enterMobNum(); 
		Thread.sleep(1500); 
		addressDetails.clickOnContinueButton();
		
		CoverFoxHealthPlanResultsPage planResults= new CoverFoxHealthPlanResultsPage(driver);
		Thread.sleep(7000); 
		planResults.validatePlanListWithResults(); 
		Thread.sleep(2000);
		
		}
	}





























































