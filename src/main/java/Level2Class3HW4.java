

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Level2Class3HW4 {

	public static void main(String[] args) {
		FirefoxDriver fox = new FirefoxDriver();
		fox.get("http://demo.guru99.com/v4/");
		fox.findElement(By.xpath("//input[@onblur='validateuserid();']")).sendKeys("mngr91351");
		fox.findElement(By.xpath("//input[@onblur='validatepassword();']")).sendKeys("hehaman");
		fox.findElement(By.xpath("//input[@value='LOGIN']")).click();
		fox.findElement(By.xpath(".//*[text()='Delete Account']")).click();
		fox.findElement(By.xpath("//input[@onblur='validateaccountno();']")).sendKeys("222777222");
		fox.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		
		Alert a = fox.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		fox.switchTo().alert().accept();
		
		fox.close();
		
		
		

	}

}
