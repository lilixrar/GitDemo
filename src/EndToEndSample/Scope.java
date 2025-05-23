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
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement leftFooterDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); // further limiting webdriver scope
		int leftmostCount = leftFooterDriver.findElements(By.tagName("a")).size(); // getting all the "a" links
		List<WebElement> leftmostLinks = leftFooterDriver.findElements(By.tagName("a")); // listing all the links
		System.out.println(leftmostCount);
		
//		//clicking on each link in a specific part of the page
//		for(int i = 1; i < leftmostCount; i++) {
//			leftmostLinks.get(i).click();
//		}  

		//clicking on each link in a specific part of the page ---> opening new tabs & getting window titles
		
		
		
				for(int i = 1; i < leftmostCount; i++) {
					String clickOnLinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER); // like holding command + click on links
					leftmostLinks.get(i).sendKeys(clickOnLinkTab);				// opens 4 tabs
					}
					
					Set<String> windowNames = driver.getWindowHandles(); // 4 times	
					Iterator<String> iteratorz = windowNames.iterator();
				
				while(iteratorz.hasNext()) {
					driver.switchTo().window(iteratorz.next());
					System.out.println(driver.getTitle());
					}
					
					
				
				}  
	
		
		

	

}
