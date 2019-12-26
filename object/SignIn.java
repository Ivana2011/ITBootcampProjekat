package page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	public static final String URL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	private static final String SIGNIN_BUTTON = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]";

	public static final String URL2 = "https://petstore.octoperf.com/actions/Catalog.action";
	private static final String SIGNIN_BUTTON2 = "//a[contains(text(),'Sign In')]";

	private static final String USERNAME_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
	private static final String PASSWORD_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]";
	private static final String LOGIN_XPATH = "//input[@name='signon']";
	private static final String MYACC_XPATH = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[3]";
	private static final String CHANGE_BUTTON_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]";

	private static final String LOGOUT_XPATH = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]";

	// Sign in stranica za prvog korisnika
	public static WebElement goToURL(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNIN_BUTTON));
	}

	public static void clickEnterSignIn(WebDriver driver) {
		goToURL(driver).click();
	}

	// Sign in stranica za ostale korisnike
	public static WebElement goToURL2(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNIN_BUTTON2));
	}

	public static void clickEnterSignIn2(WebDriver driver) {
		goToURL2(driver).click();
	}

	// Unos imena
	public static WebElement getName(WebDriver driver) {
		return driver.findElement(By.xpath(USERNAME_XPATH));
	}

	public static void clickName(WebDriver driver) {
		getName(driver).click();
	}

	public static void inputName(WebDriver driver, String s) {
		getName(driver).sendKeys(s);
	}

	// Unos sifre
	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_XPATH));
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void clearPassword(WebDriver driver) {
		getPassword(driver).clear();
	}

	public static void inputPassword(WebDriver driver, String s) {
		getPassword(driver).sendKeys(s);
	}

	// Logovanje
	public static WebElement getLogIn(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_XPATH));
	}

	public static void clickLogIn(WebDriver driver) {
		getLogIn(driver).click();
	}

	// Izlogovanje
	public static WebElement getLogOut(WebDriver driver) {
		return driver.findElement(By.xpath(LOGOUT_XPATH));
	}

	public static void clickLogOut(WebDriver driver) {
		getLogOut(driver).click();
	}

	// Moj nalog
	public static WebElement getMyAccount(WebDriver driver) {
		return driver.findElement(By.xpath(MYACC_XPATH));
	}

	public static void clickMyAccount(WebDriver driver) {
		getMyAccount(driver).click();
	}

	// Izmena podataka
	public static WebElement getChange(WebDriver driver) {
		return driver.findElement(By.xpath(CHANGE_BUTTON_XPATH));
	}

	public static void clickChange(WebDriver driver) {
		getChange(driver).click();
	}

}
