

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Level2Class3HW5 {

	public static void main(String[] args) {
		FirefoxDriver fox = new FirefoxDriver();
		fox.get("http://www.globalrph.com/davescripts/popup.htm");
		fox.findElement(By.xpath("//input[@value='Click for window']")).click();
		
		Set<String> handles = fox.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String main = it.next();
		String second = it.next();
		
		fox.switchTo().window(second).findElement(By.xpath("html/body/h2")).getText();
		System.out.println(fox.switchTo().window(second).findElement(By.xpath("html/body/h2")).getText());
		
		fox.switchTo().window(main).close();
		System.out.println("Ha we closed the main window first!");
		fox.switchTo().window(second).close();
		
		
		

	}

}
