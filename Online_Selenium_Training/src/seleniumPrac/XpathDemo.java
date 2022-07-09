package seleniumPrac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws Exception {
		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002YZI744\\eclipse-workspace\\chromedriver.exe");

		// Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();

		// manage() method- to Maximize window
		driver.manage().window().maximize();

		// Open URL of Application using get() and navigate() method
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");

	}

}
