package seleniumPrac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceDemo {

	public static void main(String[] args) throws Exception  {
		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002YZI744\\eclipse-workspace\\chromedriver.exe");

		// Launching Chrome Browser Instance
		WebDriver driver = new ChromeDriver();

		// manage() method- to Maximize window
		driver.manage().window().maximize();

		// Open URL of Application using get() and navigate() method
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		String html=driver.getPageSource();
		System.out.println(html);

	}
}
