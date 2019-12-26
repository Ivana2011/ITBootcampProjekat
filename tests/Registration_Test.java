package page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.object.Registration;
import utility.ExcelUtils;

public class Registration_Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(Registration.URL);
		driver.manage().window().maximize();

		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {

			driver.get(Registration.URL);

			Registration.getID(driver).clear();
			Registration.inputID(driver, ExcelUtils.getDataAt(i, 0));

			Registration.getPassword(driver).clear();
			Registration.inputPassword(driver, ExcelUtils.getDataAt(i, 1));

			Registration.getRepPass(driver).clear();
			Registration.inputRepPass(driver, ExcelUtils.getDataAt(i, 1));

			Registration.getName(driver).clear();
			Registration.inputName(driver, ExcelUtils.getDataAt(i, 2));

			Registration.getSurname(driver).clear();
			Registration.inputSurname(driver, ExcelUtils.getDataAt(i, 3));

			Registration.getEmail(driver).clear();
			Registration.inputEmail(driver, ExcelUtils.getDataAt(i, 4));

			Registration.getPhone(driver).clear();
			Registration.inputPhone(driver, ExcelUtils.getDataAt(i, 5));

			Registration.getAddress1(driver).clear();
			Registration.inputAddress1(driver, ExcelUtils.getDataAt(i, 6));

			Registration.getAddress2(driver).clear();
			Registration.inputAddress2(driver, ExcelUtils.getDataAt(i, 7));

			Registration.getCity(driver).clear();
			Registration.inputCity(driver, ExcelUtils.getDataAt(i, 8));

			Registration.getState(driver).clear();
			Registration.inputState(driver, ExcelUtils.getDataAt(i, 9));

			Registration.getZip(driver).clear();
			Registration.inputZip(driver, ExcelUtils.getDataAt(i, 10));

			Registration.getCountry(driver).clear();
			Registration.inputCountry(driver, ExcelUtils.getDataAt(i, 11));

			Registration.clickRegButton(driver);

		}

		driver.close();

	}

}
