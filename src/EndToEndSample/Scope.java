package EndToEndSample;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// This is the sample original code for the GitHub uploaded repository
public class Scope {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); 
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		System.out.println("Tester 2 Edited this~!!");
		System.out.println("Tester 2 Edited this too~!!");
		
		WebElement leftFooterDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); 
		int leftmostCount = leftFooterDriver.findElements(By.tagName("a")).size();
		List<WebElement> leftmostLinks = leftFooterDriver.findElements(By.tagName("a")); 
		System.out.println(leftmostCount);
		
				for(int i = 1; i < leftmostCount; i++) {
					String clickOnLinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER); 
					leftmostLinks.get(i).sendKeys(clickOnLinkTab);
					}
					
					Set<String> windowNames = driver.getWindowHandles();	
					Iterator<String> iteratorz = windowNames.iterator();
				
				while(iteratorz.hasNext()) {
					driver.switchTo().window(iteratorz.next());
					System.out.println(driver.getTitle());
					}

				
				}  
	
		
		

	

}
