

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Level2Class4Login {

	public static void main(String[] args) {
		WebDriver fox = new FirefoxDriver();
		fox.get("https://www.gmail.com");
		fox.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("vlad.lekhtsikau@gmail.com");
		fox.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
		fox.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("password");
		//I don't really feel comfortable giving out my email password, but other than that this code should work.
		fox.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		

	}

}
