package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.object.Registration;
import page.object.SignIn;
import utility.ExcelUtils;

public class SignInTestNG {

	public void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void clickButton() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(SignIn.URL);
		driver.manage().window().maximize();

		SignIn.clickEnterSignIn(driver);
		String currUrl = driver.getCurrentUrl();
		String url = "https://petstore.octoperf.com/actions/Account.action?signonForm=";

		if (currUrl.contains("jsessionid")) {
			if (currUrl.contains("signonForm") && url.contains("signonForm")) {
				currUrl = "";
				url = "";
			}
		}

		Assert.assertEquals(currUrl, url);
		driver.close();
	}

	@Test
	public void signIn() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(SignIn.URL);
		driver.manage().window().maximize();
		SignIn.clickEnterSignIn(driver);

		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {

			SignIn.clickName(driver);
			SignIn.inputName(driver, ExcelUtils.getDataAt(i, 0));

			SignIn.clickPassword(driver);
			SignIn.clearPassword(driver);
			SignIn.inputPassword(driver, ExcelUtils.getDataAt(i, 1));

			SignIn.clickLogIn(driver);
			wait2();
			SignIn.clickLogOut(driver);
			wait2();
			SignIn.clickEnterSignIn2(driver);
		}
	}
}
