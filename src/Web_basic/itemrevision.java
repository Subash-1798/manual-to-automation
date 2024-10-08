package Web_basic;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.Assesmentresult;
import pageobject.Logindigiasses;
import pageobject.batchperformance;
public class itemrevision {
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String baseURL = "https://digiassess-nonprod.gcp.digivalitsolutions.com/staging-daweb/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Actions action = new Actions(driver);

		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		

		Logindigiasses.Login(driver).sendKeys("digiproductsadmin@digivalsolutions.com");
		Logindigiasses.password(driver).sendKeys("digiassess@#801");
		Logindigiasses.submit(driver).click();
		Logindigiasses.done(driver).click();
		Thread.sleep(5000);
		
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"mat-focus-indicator mat-icon-button mat-button-base\"]"))).click();
		Logindigiasses.reportsandanalytics(driver).click();

		Assesmentresult.assesmentresults(driver).click();
		Assesmentresult.pending(driver).click();
		Assesmentresult.dropdowntypes(driver).click();
		Assesmentresult.searchtypes(driver).sendKeys("ST123");
		Assesmentresult.selecttypes(driver).click();
		Assesmentresult.itemrevision(driver).click();
		Assesmentresult.programsideicon(driver).click();
		Assesmentresult.yearsideicon(driver).click();
		Assesmentresult.InRevision(driver).click();
		Thread.sleep(5000);
		WebElement student1 = driver.findElement(By.xpath("//div[text()=' 23010002 ']"));
		action.moveToElement(student1).perform();
		student1.click();
		batchperformance.itemtypefilter(driver).click();
		batchperformance.itemtype(driver).click();
		Thread.sleep(5000);
		batchperformance.sideicon(driver).click();
		batchperformance.closeicon1(driver).click();
		batchperformance.closeicon2(driver).click();
		batchperformance.itemwiseresponse(driver).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement itemwiseresponsedown = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/span[text() = ' 23010002 ']")));
		Thread.sleep(5000);
		batchperformance.itemrevision(driver).click();
		WebElement itemrevisiondown = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text() = ' Unacceptable ' ])[1]")));
		Thread.sleep(5000);
		batchperformance.GradeDistributionOutcome(driver).click();
		WebElement GradeDistributiondown = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text() = 'ORIGINAL RESULT ']")));
		batchperformance.Graderevision(driver).click();
		WebElement Graderevisiondown = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text() = ' 23010002 ']")));
		batchperformance.Finalizedresult(driver).click();
		Thread.sleep(5000);
		batchperformance.donerevision(driver).click();
		Thread.sleep(5000);
		batchperformance.readytopublish(driver).click();
		Assesmentresult.programsideicon(driver).click();
		Assesmentresult.yearsideicon(driver).click();
		batchperformance.readytopublish(driver).click();
		
		
	}
}
