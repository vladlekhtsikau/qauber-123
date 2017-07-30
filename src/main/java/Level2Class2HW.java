import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Level2Class2HW {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://fits.qauber.com");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		WebElement email = driver.findElement(By.xpath(".//*[@id='exampleInputEmail1']"));
		WebElement pw = driver.findElement(By.xpath(".//*[@id='exampleInputPassword1']"));
		WebElement login = driver.findElement(By.xpath(".//*[@type='submit']"));
		
		email.sendKeys("dryrun4@mailinator.com");
		pw.sendKeys("password");
		login.click();
		
		Thread.sleep(10000);
		WebElement add = driver.findElement(By.xpath(".//*[text() = 'Add Report']"));
		add.click();
		Thread.sleep(10000);
		WebElement subjectInfo = driver.findElement(By.xpath("//div[@class='fa fa-user size']"));
		subjectInfo.click();
		
		Thread.sleep(10000);
		
		WebElement caseID = driver.findElement(By.xpath("//input[@ng-model='wizard.report.caseNumber']"));
		WebElement last = driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement first = driver.findElement(By.xpath("//input[@name='firstName']"));		
		
		last.sendKeys("Gena");
		first.sendKeys("Krokodil");
		caseID.sendKeys("123456789");
			
		WebElement gang = driver.findElement(By.xpath("//h4/div[@title='Gang Membership']"));
		gang.click();
		Thread.sleep(10000);
		WebElement location = driver.findElement(By.xpath("//input[@ng-model='wizard.report.locationOfStop']"));
		location.sendKeys("1234 Mockingbird Lane");
		
		WebElement preview = driver.findElement(By.xpath("//h4/div[@title='Preview']"));
		preview.click();
		Thread.sleep(10000);
		WebElement commit = driver.findElement(By.xpath("//button[@ng-click='wizard.commitReport()']"));
		commit.click();
		
	}

}
