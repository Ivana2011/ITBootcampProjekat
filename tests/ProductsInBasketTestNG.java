package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.object.ProductsInBasket;
import page.object.SignIn;
import utility.ExcelUtils;

public class ProductsInBasketTestNG {

	public void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void shopping() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);

		driver.get(ProductsInBasket.URL);
		driver.manage().window().maximize();
		wait2();

		// Logovanje
		SignIn.clickEnterSignIn(driver);
		SignIn.clickName(driver);
		SignIn.inputName(driver, ExcelUtils.getDataAt(1, 0));
		SignIn.clickPassword(driver);
		SignIn.clearPassword(driver);
		SignIn.inputPassword(driver, ExcelUtils.getDataAt(1, 1));
		SignIn.clickLogIn(driver);
		wait2();

		// Odabir ptice
		ProductsInBasket.clickBird(driver);
		wait2();
		ProductsInBasket.clickFinch(driver);
		wait2();
		ProductsInBasket.clickDetails(driver);
		wait2();
		ProductsInBasket.clickAdd(driver);
		wait2();

		// Provera da li je ptica u korpi
		String currUrl = driver.getCurrentUrl();
		String url = "https://petstore.octoperf.com/actions/Cart.action?addItemToCart=&workingItemId=EST-19";
		Assert.assertEquals(currUrl, url);

		// Kupovina ptice
		ProductsInBasket.clickCheckout(driver);
		wait2();
		ProductsInBasket.clickContinue(driver);
		wait2();
		ProductsInBasket.clickConfirm(driver);

	}
}
