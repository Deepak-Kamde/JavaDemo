package seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersExample {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002YZI744\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Forgot')]")).click();
		// Locate Element with Id
		
		//Locate an Element with name
		//driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//Thread.sleep(5000);
		
		//Thread.sleep(3000);
		//Locate an Element with className
		//driver.findElement(By.className("")).click();
		//Locate an Element with LinkText
		//driver.findElement(By.linkText("Forgot your password?")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.partialLinkText("Forgot")).click();
		//Thread.sleep(3000);
		//System.out.println(driver.findElements(By.tagName("img")).size());
		
		
		//driver.close();

	}

}
