package page.object;

import org.openqa.selenium.*;
import org.testng.Assert;

public class Registration {

	public static final String URL = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
		
	private static final String ID_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	private static final String PASSWORD_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
	private static final String REP_PASSWORD_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]";
	
	private static final String NAME_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[1]/td[2]/input[1]";
	private static final String SURNAME_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[2]/td[2]/input[1]";
	private static final String EMAIL_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[3]/td[2]/input[1]";
	private static final String PHONE_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[4]/td[2]/input[1]";
	private static final String ADDRESS1_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[5]/td[2]/input[1]";
	private static final String ADDRESS2_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[6]/td[2]/input[1]";
	private static final String CITY_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[7]/td[2]/input[1]";
	private static final String STATE_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[8]/td[2]/input[1]";
	private static final String ZIP_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[9]/td[2]/input[1]";
	private static final String COUNTRY_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[2]/tbody[1]/tr[10]/td[2]/input[1]";
	private static final String REG_BUTTON_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]";

	// User ID
	public static WebElement getID(WebDriver driver) {
		return driver.findElement(By.xpath(ID_XPATH));
	}

	public static void clickID(WebDriver driver) {
		getID(driver).click();
	}

	public static void inputID(WebDriver driver, String s) {
		getID(driver).sendKeys(s);
	}

	// Password
	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_XPATH));
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void inputPassword(WebDriver driver, String s) {
		getPassword(driver).sendKeys(s);
	}

	// Repeat Password
	public static WebElement getRepPass(WebDriver driver) {
		return driver.findElement(By.xpath(REP_PASSWORD_XPATH));
	}

	public static void clickRepPass(WebDriver driver) {
		getRepPass(driver).click();
	}

	public static void inputRepPass(WebDriver driver, String s) {
		getRepPass(driver).sendKeys(s);
	}

	// First name
	public static WebElement getName(WebDriver driver) {
		return driver.findElement(By.xpath(NAME_XPATH));
	}

	public static void clickName(WebDriver driver) {
		getName(driver).click();
	}

	public static void inputName(WebDriver driver, String s) {
		getName(driver).sendKeys(s);
	}

	// Last name
	public static WebElement getSurname(WebDriver driver) {
		return driver.findElement(By.xpath(SURNAME_XPATH));
	}

	public static void clickSurname(WebDriver driver) {
		getSurname(driver).click();
	}

	public static void inputSurname(WebDriver driver, String s) {
		getSurname(driver).sendKeys(s);
	}

	// Email
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void inputEmail(WebDriver driver, String s) {
		getEmail(driver).sendKeys(s);
	}

	// Phone
	public static WebElement getPhone(WebDriver driver) {
		return driver.findElement(By.xpath(PHONE_XPATH));
	}

	public static void clickPhone(WebDriver driver) {
		getPhone(driver).click();
	}

	public static void inputPhone(WebDriver driver, String s) {
		getPhone(driver).sendKeys(s);
	}

	// Address1
	public static WebElement getAddress1(WebDriver driver) {
		return driver.findElement(By.xpath(ADDRESS1_XPATH));
	}

	public static void clickAddress1(WebDriver driver) {
		getAddress1(driver).click();
	}

	public static void inputAddress1(WebDriver driver, String s) {
		getAddress1(driver).sendKeys(s);
	}

	// Address2
	public static WebElement getAddress2(WebDriver driver) {
		return driver.findElement(By.xpath(ADDRESS2_XPATH));
	}

	public static void clickAddress2(WebDriver driver) {
		getAddress2(driver).click();
	}

	public static void inputAddress2(WebDriver driver, String s) {
		getAddress2(driver).sendKeys(s);
	}

	// City
	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath(CITY_XPATH));
	}

	public static void clickCity(WebDriver driver) {
		getCity(driver).click();
	}

	public static void inputCity(WebDriver driver, String s) {
		getCity(driver).sendKeys(s);
	}

	// State
	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath(STATE_XPATH));
	}

	public static void clickState(WebDriver driver) {
		getState(driver).click();
	}

	public static void inputState(WebDriver driver, String s) {
		getState(driver).sendKeys(s);
	}

	// Zip
	public static WebElement getZip(WebDriver driver) {
		return driver.findElement(By.xpath(ZIP_XPATH));
	}

	public static void clickZip(WebDriver driver) {
		getZip(driver).click();
	}

	public static void inputZip(WebDriver driver, String s) {
		getZip(driver).sendKeys(s);
	}

	// Country
	public static WebElement getCountry(WebDriver driver) {
		return driver.findElement(By.xpath(COUNTRY_XPATH));
	}

	public static void clickCountry(WebDriver driver) {
		getCountry(driver).click();
	}

	public static void inputCountry(WebDriver driver, String s) {
		getCountry(driver).sendKeys(s);
	}

	// Save information/register
	public static WebElement getRegButton(WebDriver driver) {
		return driver.findElement(By.xpath(REG_BUTTON_XPATH));
	}

	public static void clickRegButton(WebDriver driver) {
		getRegButton(driver).click();
		
		String currUrl = driver.getCurrentUrl();
		String url = "https://petstore.octoperf.com/actions/Catalog.action";
		Assert.assertEquals(currUrl, url);
	}
	
	
		

}
