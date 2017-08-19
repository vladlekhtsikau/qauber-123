import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddReportsWithHashMap {

	public static void main(String[] args) {
		WebDriver fox = new FirefoxDriver();
		fox.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		fox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fox.get("http://fits.qauber.com");
		fox.manage().window().maximize();
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("email", "dryrun4@mailinator.com");
		map.put("password", "password");
		map.put("caseID", "123456789");
		map.put("firstname", "Krokodil");
		map.put("lastname", "Gena");
		map.put("location", "1234 Mockingbird Lane");
		
		
		
		fox.findElement(By.xpath(".//*[@id='exampleInputEmail1']")).sendKeys(map.get("email"));
		fox.findElement(By.xpath(".//*[@id='exampleInputPassword1']")).sendKeys(map.get("password"));
		fox.findElement(By.xpath(".//*[@type='submit']")).sendKeys(Keys.RETURN);
		fox.findElement(By.xpath(".//*[text() = 'Add Report']")).click();
		fox.findElement(By.xpath("//div[@class='fa fa-user size']")).click();
		fox.findElement(By.xpath("//input[@ng-model='wizard.report.caseNumber']")).sendKeys(map.get("caseID"));
		fox.findElement(By.xpath("//input[@name='lastName']")).sendKeys(map.get("lastname"));
		fox.findElement(By.xpath("//input[@name='firstName']")).sendKeys(map.get("firstname"));
		fox.findElement(By.xpath("//h4/div[@title='Gang Membership']")).click();
		fox.findElement(By.xpath("//input[@ng-model='wizard.report.locationOfStop']")).sendKeys(map.get("location"));
		fox.findElement(By.xpath("//h4/div[@title='Preview']")).click();
		fox.findElement(By.xpath("//button[@ng-click='wizard.commitReport()']")).click();
		fox.findElement(By.xpath("//div[5]/a[1]")).click();
		
		fox.quit();
		
	}
		

	}
