package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.object.Registration;
import page.object.SignIn;

public class RegistrationTestNG {

	// Registracija jednog korisnika
	@Test
	public void registracija() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(Registration.URL);
		driver.manage().window().maximize();

		Registration.clickID(driver);
		Registration.inputID(driver, "5655144313.0");

		Registration.clickPassword(driver);
		Registration.inputPassword(driver, "La7@n7@r");

		Registration.clickRepPass(driver);
		Registration.inputRepPass(driver, "La7@n7@r");

		Registration.clickName(driver);
		Registration.inputName(driver, "Ivana");

		Registration.clickSurname(driver);
		Registration.inputSurname(driver, "Milosavljevic");

		Registration.clickEmail(driver);
		Registration.inputEmail(driver, "lalala@gmail.com");

		Registration.clickPhone(driver);
		Registration.inputPhone(driver, "0653636363");

		Registration.clickAddress1(driver);
		Registration.inputAddress1(driver, "Ruzveltova 5");

		Registration.clickAddress2(driver);
		Registration.inputAddress2(driver, "Kamenicka 6");

		Registration.clickCity(driver);
		Registration.inputCity(driver, "Beograd");

		Registration.clickState(driver);
		Registration.inputState(driver, "Srbija");

		Registration.clickZip(driver);
		Registration.inputZip(driver, "11000");

		Registration.clickCountry(driver);
		Registration.inputCountry(driver, "Srbija");

		Registration.clickRegButton(driver);
		
		driver.close();
	}

	// Izmena podataka za korisnika
	@Test
	public void izmenaPodataka() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(SignIn.URL);
		driver.manage().window().maximize();

		SignIn.clickEnterSignIn(driver);

		SignIn.clickName(driver);
		SignIn.inputName(driver, "5655144313.0");

		SignIn.clickPassword(driver);
		SignIn.clearPassword(driver);
		SignIn.inputPassword(driver, "lalala@gmail.com");

		SignIn.clickLogIn(driver);

		SignIn.clickMyAccount(driver);

		Registration.getPhone(driver).clear();
		Registration.clickPhone(driver);
		Registration.inputPhone(driver, "0649998887");

		SignIn.clickChange(driver);

		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		SignIn.clickMyAccount(driver);
		SignIn.clickLogOut(driver);
		
		driver.close();

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Registration.getPhone(driver).getAttribute("value"), "0649998887");
		sa.assertAll();
	}
}
