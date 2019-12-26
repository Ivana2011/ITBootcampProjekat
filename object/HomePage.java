package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static final String URL_HOME = "https://petstore.octoperf.com/";
	private static final String STORE_XPATH = "//a[contains(text(),'Enter the Store')]";

	public static WebElement getStore(WebDriver driver) {
		return driver.findElement(By.xpath(STORE_XPATH));
	}

	public static void enterTheStore(WebDriver driver) {
		getStore(driver).click();
	}

	public static String getXpath() {
		return STORE_XPATH;
	}

}
