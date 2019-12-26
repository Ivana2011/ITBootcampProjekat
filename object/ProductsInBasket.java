package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsInBasket {

	public static final String URL = "https://petstore.octoperf.com/actions/Catalog.action";

	private static final String BIRD_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/a[5]/img[1]";
	private static final String FINCH_XPATH = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/a[1]";
	private static final String EST19_XPATH = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/a[1]";
	private static final String ADD_XPATH = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[7]/td[1]/a[1]";
	private static final String CHECKOUT_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[1]/a[1]";
	private static final String CONTINUE_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]";
	private static final String CONFIRM_XPATH = "/html[1]/body[1]/div[2]/div[2]/a[1]";

	// Klik na pticu
	public static WebElement getBird(WebDriver driver) {
		return driver.findElement(By.xpath(BIRD_XPATH));
	}

	public static void clickBird(WebDriver driver) {
		getBird(driver).click();
	}

	// Odabir fincha
	public static WebElement getFinch(WebDriver driver) {
		return driver.findElement(By.xpath(FINCH_XPATH));
	}

	public static void clickFinch(WebDriver driver) {
		getFinch(driver).click();
	}

	// Pregled
	public static WebElement getDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EST19_XPATH));
	}

	public static void clickDetails(WebDriver driver) {
		getDetails(driver).click();
	}

	// Kupovina
	public static WebElement getAdd(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_XPATH));
	}

	public static void clickAdd(WebDriver driver) {
		getAdd(driver).click();
	}

	// Checkout
	public static WebElement getCheckout(WebDriver driver) {
		return driver.findElement(By.xpath(CHECKOUT_XPATH));
	}

	public static void clickCheckout(WebDriver driver) {
		getCheckout(driver).click();
	}

	// Continue dugme
	public static WebElement getContinue(WebDriver driver) {
		return driver.findElement(By.xpath(CONTINUE_XPATH));
	}

	public static void clickContinue(WebDriver driver) {
		getContinue(driver).click();
	}

	// Confirm dugme
	public static WebElement getConfirm(WebDriver driver) {
		return driver.findElement(By.xpath(CONFIRM_XPATH));
	}

	public static void clickConfirm(WebDriver driver) {
		getConfirm(driver).click();
	}

}
