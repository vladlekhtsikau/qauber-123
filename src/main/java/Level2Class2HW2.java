import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Level2Class2HW2 {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * First we open firefox browser and navigate to our site
		 */
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://fits.qauber.com");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		/**
		 * Next we need to log in with valid credentials
		 */
		WebElement email = driver.findElement(By.xpath(".//*[@id='exampleInputEmail1']"));
		WebElement pw = driver.findElement(By.xpath(".//*[@id='exampleInputPassword1']"));
		WebElement login = driver.findElement(By.xpath(".//*[@type='submit']"));
		
		email.sendKeys("dryrun4@mailinator.com");
		pw.sendKeys("password");
		login.click();
		
		/**
		 * After that we navigate to the 'Add Reports' page that we want to test
		 */
		Thread.sleep(10000);
		WebElement add = driver.findElement(By.xpath(".//*[text() = 'Add Report']"));
		add.click();
		Thread.sleep(10000);
		WebElement subjectInfo = driver.findElement(By.xpath("//div[@class='fa fa-user size']"));
		subjectInfo.click();
		
		Thread.sleep(10000);
		
		/**
		 * Then we need to find all the elements and send information into them
		 * 
		 * There is a more streamlined method of doing this that I will use in the future
		 */
		WebElement caseID = driver.findElement(By.xpath("//input[@ng-model='wizard.report.caseNumber']"));
		WebElement type = driver.findElement(By.xpath("//select[@ng-model='wizard.report.suspectType']"));
		WebElement last = driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement first = driver.findElement(By.xpath("//input[@name='firstName']"));
		WebElement middle = driver.findElement(By.xpath("//input[@name='middleName']"));
		WebElement nick = driver.findElement(By.xpath("//input[@name='Nickname']"));
		WebElement dob = driver.findElement(By.xpath("//input[@ng-model='wizard.report.dob']"));
		WebElement age = driver.findElement(By.xpath("//input[@ng-model='wizard.report.age']"));
		WebElement height = driver.findElement(By.xpath("//input[@ng-model='wizard.report.height']"));
		WebElement weight = driver.findElement(By.xpath("//input[@ng-model='wizard.report.weight']"));
		WebElement suspect = driver.findElement(By.xpath("//option[@value='Suspect']"));
		WebElement sex = driver.findElement(By.xpath("//select[@ng-model='wizard.report.sex']"));
		WebElement u = driver.findElement(By.xpath("//option[@value='U']"));
		WebElement race = driver.findElement(By.xpath("//select[@ng-model='wizard.report.race']"));
		WebElement race2 = driver.findElement(By.xpath("//option[@value='African American']"));
		WebElement build = driver.findElement(By.xpath("//input[@ng-model='wizard.report.build']"));
		WebElement athletic = driver.findElement(By.xpath("//option[@value='A']"));
		
		
		
		last.sendKeys("Gena");
		first.sendKeys("Krokodil");
		caseID.sendKeys("123456789");
		middle.sendKeys("V.");
		nick.sendKeys("Genadiy");
		age.sendKeys("35");
		type.click();
		suspect.click();
		sex.click();
		u.click();
		race.click();
		race2.click();
		build.click();
		athletic.click();
		
		/**
		 * Some of these fields are extra, but the following fields are required
		 */
		
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
