package seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class CloseMethodDemo {

	public static void main(String[] args) throws Exception {
		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002YZI744\\eclipse-workspace\\chromedriver.exe");
		// ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY
		// Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();

		// manage() method- to Maximize window
		driver.manage().window().maximize();

		// Open URL of Application using get() and navigate() method
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.findElement(By.id("td-cover-block-0")));
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register now!")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
