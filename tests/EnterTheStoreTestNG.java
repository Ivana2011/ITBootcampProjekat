package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.object.HomePage;

public class EnterTheStoreTestNG {
	
	public void wait3() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void homePage() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HomePage.URL_HOME);
		driver.manage().window().maximize();
		wait3();

		HomePage.enterTheStore(driver);
		wait3();

		String currUrl = driver.getCurrentUrl();
		String url = "https://petstore.octoperf.com/actions/Catalog.action";
		Assert.assertEquals(currUrl, url);
		driver.close();
	}
}