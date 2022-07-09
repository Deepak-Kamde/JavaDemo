package seleniumPrac;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotHandle {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002YZI744\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		takeScreenshot("SeleniumHQ");
		driver.quit();
		

		// System.out.println("Facebook Application Launcehd Successfully");
	}

	public static void takeScreenshot(String fileName) throws IOException {

		// 1. Take a Screenshot and Store it as a FileFormat
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// 2. Copy the Screenshot to desired location using Copyfile method

		FileHandler.copy(file,
				new File("C:\\Users\\002YZI744\\eclipse-workspace\\Online_Selenium_Training\\src" + fileName + ".png"));

	}

}
