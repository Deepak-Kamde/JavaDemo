package seleniumPrac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002YZI744\\eclipse-workspace\\chromedriver.exe");

		// Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();

		// manage() method- to Maximize window
		driver.manage().window().maximize();

		// Open URL of Application using get() and navigate() method
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);

		// Open URL of Application Using navigate() Method
		driver.navigate().to("https://www.google.com/");

		// Refresh the Page
		Thread.sleep(3000);
		driver.navigate().refresh();

		// Navigate to Back
		Thread.sleep(3000);
		driver.navigate().back();

		// Navigate to forward
		Thread.sleep(3000);
		driver.navigate().forward();

		// Get Current URL
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// Get Title of the webpage

		Thread.sleep(3000);
		System.out.println(driver.getTitle());

		// Close the Current Browser
		driver.close();

		// Close All Browser Instance
		driver.quit();

	}

}